package DAO;

import MODELO.mMascotas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class MascotasDAO {
    private cConexion mysql = new cConexion();
    private Connection cn = mysql.conectar();
    private String consulta = "";

    public DefaultTableModel listar() {
        DefaultTableModel modelo;
        String[] titulos = {"ID MASCOTA", "NOMBRE", "TIPO", "RAZA", "EDAD", "DESCRIPCION","ID CLIENTE"};
        Object[] registro = new Object[titulos.length];

        modelo = new DefaultTableModel(null, titulos);
        consulta = "select * from mascotas";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            cst.execute();

            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                registro[0] = rs.getString("idmascotas");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("tipo");
                registro[3] = rs.getString("raza");
                registro[4] = rs.getInt("edad");
                registro[5] = rs.getString("descripcion");
                registro[6] = rs.getString("clientes_idcliente");
                

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("Error al listar: " + e);
            return null;
        }
    }

    public boolean insertar(mMascotas modelo) {
        consulta = "insert into mascotas() values(?,?,?,?,?,?,?)";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            cst.setString(1,modelo.getIdmascotas());
            cst.setString(2,modelo.getNombre());
            cst.setString(3,modelo.getTipo());
            cst.setString(4,modelo.getRaza());
            cst.setInt(5,modelo.getEdad());
            cst.setString(6,modelo.getDescripcion());
            cst.setString(7,modelo.getClientes_idcliente());
           
            int n = cst.executeUpdate();
            if (n != 0) {
                System.out.println("Se guardó exitosamente");
                return true;
            } else {
                System.out.println("No se pudo almacenar");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error al almacenar la Venta" + e);
            return false;
        }
    }

    public boolean modificar(mMascotas modelo) {
        consulta = "update mascotas set nombre=?,tipo=?,raza=?,edad=?,descripcion=?,clientes_idcliente=? where idmascotas=?";
        try {
            CallableStatement cst = cn.prepareCall(consulta);

            cst.setString(1,modelo.getNombre());
            cst.setString(2,modelo.getTipo());
            cst.setString(3,modelo.getRaza());
            cst.setInt(4,modelo.getEdad());
            cst.setString(5,modelo.getDescripcion());
            cst.setString(6,modelo.getClientes_idcliente());
            cst.setString(7,modelo.getIdmascotas());

            int n = cst.executeUpdate();

            if (n != 0) {
                System.out.println("Se actualizó correctamente");
                return true;
            } else {
                System.out.println("No se actualizó");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error. No se eliminó el actualizar" + e);
            return false;
        }
    }

    public boolean eliminar(String idmascota) {
        consulta = "delete from mascotas where idmascotas = ?";
        try {
            CallableStatement cst = cn.prepareCall(consulta);
            cst.setString(1, idmascota);
            int n = cst.executeUpdate();
            if (n != 0) {
                System.out.println("Se eliminó correctamente");
                return true;
            } else {
                System.out.println("No se eliminó");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error. No se eliminó el registro");
            return false;
        }
    }
}
