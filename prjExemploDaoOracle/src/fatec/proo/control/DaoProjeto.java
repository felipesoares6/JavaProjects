package fatec.proo.control;

import fatec.proo.model.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author felipesoares
 */
public class DaoProjeto {
    private Connection conn;
    
    public DaoProjeto(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Projeto projeto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TBPROJETO(CODIGO, DESCRICAO, DATAINICIO, DATATERMINO) VALUES(?,?,?,?)");
            ps.setInt(1, projeto.getCodigo());
            ps.setString(2, projeto.getDescricao());
            ps.setString(3, projeto.getDataInicio());
            ps.setString(4, projeto.getDataTermino());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Projeto projeto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TBPROJETO set DESCRICAO = ?, DATAINICIO = ?, DATATERMINO = ? " +
                                                 "where CODIGO = ?");
            
            ps.setInt(1, projeto.getCodigo());
            ps.setString(2, projeto.getDescricao());
            ps.setString(3, projeto.getDataInicio());
            ps.setString(4, projeto.getDataTermino());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Projeto consultar (int codigo) {
        Projeto d = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from TBPROJETO where " +
                                                 "CODIGO = ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                d = new Projeto(codigo, rs.getString("DESCRICAO"), rs.getString("DATAINICIO"), rs.getString("DATATERMINO"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (d);
    }    
     
     public void excluir(Projeto projeto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TBPROJETO WHERE CODIGO = ?");
            
            ps.setInt(1, projeto.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    
}
