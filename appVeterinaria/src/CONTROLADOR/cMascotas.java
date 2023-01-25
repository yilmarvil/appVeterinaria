package CONTROLADOR;

import DAO.MascotasDAO;
import MODELO.mMascotas;
import javax.swing.table.DefaultTableModel;

public class cMascotas {
    MascotasDAO oMascotasDAO = new MascotasDAO();
    mMascotas omMascotas = new mMascotas();
    
    public DefaultTableModel listar() {
        return oMascotasDAO.listar();
    }
    public boolean insertar(String idmascotas, String nombre, String tipo, String raza, int edad, String descripcion, String clientes_idcliente){
        omMascotas.setIdmascotas(idmascotas);
        omMascotas.setNombre(nombre);
        omMascotas.setTipo(tipo);
        omMascotas.setRaza(raza);
        omMascotas.setEdad(edad);
        omMascotas.setDescripcion(descripcion);
        omMascotas.setClientes_idcliente(clientes_idcliente);
               
        return oMascotasDAO.insertar(omMascotas);
    }
    public boolean modificar(String idmascotas, String nombre, String tipo, String raza, int edad, String descripcion, String clientes_idcliente){
        omMascotas.setIdmascotas(idmascotas);
        omMascotas.setNombre(nombre);
        omMascotas.setTipo(tipo);
        omMascotas.setRaza(raza);
        omMascotas.setEdad(edad);
        omMascotas.setDescripcion(descripcion);
        omMascotas.setClientes_idcliente(clientes_idcliente);
               
        return oMascotasDAO.modificar(omMascotas);
    }
    
    public boolean eliminar(String idmascota) {

        boolean valor = oMascotasDAO.eliminar(idmascota);
        return valor;
    }

}
