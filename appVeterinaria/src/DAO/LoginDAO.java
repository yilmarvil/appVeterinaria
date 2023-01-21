package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LoginDAO {
    private cConexion mysql = new cConexion();
    private Connection cn = mysql.conectar();
    private String consulta = "";
    
    public boolean verificar(String nick, String password) {
        String[] registro = new String[1];
        boolean valor = false;
        
        consulta = "select idusuarios from usuarios where nick = ? and password = ?";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            cst.setString(1,nick);
            cst.setString(2,password);
            cst.execute();
            
            ResultSet rs = cst.getResultSet();
             while (rs.next()) {
                registro[0] = rs.getString("idusuarios");
                if(registro[0] != null) {
                    valor = true;
                } else {
                    valor = false;
                }
            }
            return valor;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return false;
        }
    }
}
