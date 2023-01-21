package DAO;

import MODELO.mUsuarios;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class UsuariosDAO {
    private cConexion mysql = new cConexion();
    private Connection cn = mysql.conectar();
    private String consulta = "";
    
    
    public DefaultTableModel listar() {
        DefaultTableModel modelo;
        String[] titulos = {"ID USUARIO","TIPO DE USUARIO","NOMBRE","EMAIL","NICK","PASSWORD"};
        Object[] registro = new Object[titulos.length];
        
        modelo = new DefaultTableModel(null,titulos);
        consulta = "select * from usuarios";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            cst.execute();
            
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {                
                registro[0] = rs.getInt("idusuarios");
                registro[1] = rs.getInt("tipo");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("email");
                registro[4] = rs.getString("nick");
                registro[5] = rs.getString("password");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("Error al listar: "+e);
            return null;
        }    
    }
    
    public boolean insertar(mUsuarios modelo) {
       consulta = "insert into usuarios() values(?,?,?,?,?,?)";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            cst.setInt(1,modelo.getIdusuarios());
            cst.setInt(2,modelo.getTipo());
            cst.setString(3,modelo.getNombre());
            cst.setString(4,modelo.getEmail());
            cst.setString(5,modelo.getNick());
            cst.setString(6,modelo.getPassword());
            
            int n = cst.executeUpdate();
            if(n!=0)
            {
                System.out.println("Se guardó exitosamente");
                return true;
            }
            else{
                System.out.println("No se pudo almacenar");
                return false;
            }
             
        } catch (Exception e) {
            System.out.println("Error al almacenar la Venta"+e);
            return false;
        }
    }
    
    public boolean modificar(mUsuarios modelo) {
        consulta = "update usuarios set tipo=?,nombre=?,email=?,nick=?,password=? where idusuarios=?";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            
            cst.setInt(1,modelo.getTipo());
            cst.setString(2,modelo.getNombre());
            cst.setString(3,modelo.getEmail());
            cst.setString(4,modelo.getNick());
            cst.setString(5,modelo.getPassword());
            cst.setInt(6,modelo.getIdusuarios());
            
            int n = cst.executeUpdate();
            
            if (n!=0)
            {
                System.out.println("Se actualizó correctamente");
                return true;
            }
            else{
                System.out.println("No se actualizó");
                return false;
            }
            
        } catch (Exception e) {
            System.out.println("Error. No se eliminó el actualizar"+e);
            return false;
        }
    }
    public DefaultTableModel RecuperarUsuario(String nick, String password) {
        DefaultTableModel modelo;
        String[] titulos = {"ID USUARIO","TIPO DE USUARIO","NOMBRE","EMAIL","NICK","PASSWORD"};
        Object[] registro = new Object[titulos.length];
        
        modelo = new DefaultTableModel(null,titulos);
        consulta = "select * from usuarios where nick='"+nick+"' and "+
            "password= '"+password+"'";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            cst.execute();
            
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {                
                registro[0] = rs.getInt("idusuarios");
                registro[1] = rs.getInt("tipo");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("email");
                registro[4] = rs.getString("nick");
                registro[5] = rs.getString("password");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("Error al listar: "+e);
            return null;
        }    
    }
}
