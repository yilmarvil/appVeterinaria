package DAO;

import MODELO.mClientes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ClientesDAO {
    private cConexion mysql = new cConexion();
    private Connection cn = mysql.conectar();
    private String consulta = "";
    
    public DefaultTableModel listar() {
        DefaultTableModel modelo;
        String[] titulos = {"ID Cliente","DNI","Nombres","Apellido Paterno","Apellido Materno","Dirección","Teléfono","e-mail"};
        Object[] registro = new Object[titulos.length];
        
        modelo = new DefaultTableModel(null,titulos);
        consulta = "select * from clientes";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            cst.execute();
            
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {                
                registro[0] = rs.getString("idcliente");
                registro[1] = rs.getString("dni");
                registro[2] = rs.getString("nombres");
                registro[3] = rs.getString("apaterno");
                registro[4] = rs.getString("amaterno");
                registro[5] = rs.getString("direccion");
                registro[6] = rs.getString("telefono");
                registro[7] = rs.getString("email");
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("Error al listar: "+e);
            return null;
        }    
    }
    
    public boolean insertar(mClientes modelo) {
       consulta = "insert into clientes() values(?,?,?,?,?,?,?,?)";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            cst.setString(1,modelo.getIdcliente());
            cst.setString(2,modelo.getDni());
            cst.setString(3,modelo.getNombres());
            cst.setString(4,modelo.getApaterno());
            cst.setString(5,modelo.getAmaterno());
            cst.setString(6,modelo.getDireccion());
            cst.setString(7,modelo.getTelefono());
            cst.setString(8,modelo.getEmail());

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
    
    public boolean modificar(mClientes modelo) {
        consulta = "update clientes set dni=?,nombres=?,apaterno=?,amaterno=?,direccion=?,telefono=?,email=? where idcliente=?";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            
            cst.setString(1,modelo.getDni());
            cst.setString(2,modelo.getNombres());
            cst.setString(3,modelo.getApaterno());
            cst.setString(4,modelo.getAmaterno());
            cst.setString(5,modelo.getDireccion());
            cst.setString(6,modelo.getTelefono());
            cst.setString(7,modelo.getEmail());
            cst.setString(8,modelo.getIdcliente());
            
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
            System.out.println("Error. No se eliminó el actualizar");
            return false;
        }
    }
}
