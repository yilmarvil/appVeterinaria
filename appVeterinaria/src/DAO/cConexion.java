package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class cConexion {
    String db = "bdMVC2";
    String url ="jdbc:mysql://127.0.0.1/"+db;
    String user = "root";
    String pass = "123456";
    
   public Connection conectar()
    {
        Connection link = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url,this.user,this.pass);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }

}

