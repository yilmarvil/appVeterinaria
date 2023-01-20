package CONTROLADOR;

import DAO.ClientesDAO;
import MODELO.mClientes;
import javax.swing.table.DefaultTableModel;

public class cClientes {
    ClientesDAO oClientesDAO = new ClientesDAO();
    mClientes omClientes = new mClientes();
    
    public DefaultTableModel listar() {
        return oClientesDAO.listar();
    }
    public boolean insertar(String idcliente, String dni, String nombres, String apaterno, String amaterno, String direccion, String telefono, String email){
        omClientes.setIdcliente(idcliente);
        omClientes.setDni(dni);
        omClientes.setNombres(nombres);
        omClientes.setApaterno(apaterno);
        omClientes.setAmaterno(amaterno);
        omClientes.setDireccion(direccion);
        omClientes.setTelefono(telefono);
        omClientes.setEmail(email);
        
        return oClientesDAO.insertar(omClientes);
    }
    public boolean modificar(String idcliente, String dni, String nombres, String apaterno, String amaterno, String direccion, String telefono, String email){
        omClientes.setIdcliente(idcliente);
        omClientes.setDni(dni);
        omClientes.setNombres(nombres);
        omClientes.setApaterno(apaterno);
        omClientes.setAmaterno(amaterno);
        omClientes.setDireccion(direccion);
        omClientes.setTelefono(telefono);
        omClientes.setEmail(email);
        
        return oClientesDAO.modificar(omClientes);
    } 
}
