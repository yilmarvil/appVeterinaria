package CONTROLADOR;

import DAO.UsuariosDAO;
import MODELO.mUsuarios;
import javax.swing.table.DefaultTableModel;

public class cUsuarios {
    UsuariosDAO oUsuariosDAO = new UsuariosDAO();
    mUsuarios omUsuarios = new mUsuarios();
    
    public DefaultTableModel listar() {
        return oUsuariosDAO.listar();
    }
    public boolean insertar(int idusuarios, int tipo, String nombre, String email, String nick, String password){
        omUsuarios.setIdusuarios(idusuarios);
        omUsuarios.setTipo(tipo);
        omUsuarios.setNombre(nombre);
        omUsuarios.setEmail(email);
        omUsuarios.setNick(nick);
        omUsuarios.setPassword(password);

        return oUsuariosDAO.insertar(omUsuarios);
    }
    public boolean modificar(int idusuarios, int tipo, String nombre, String email, String nick, String password){
        omUsuarios.setIdusuarios(idusuarios);
        omUsuarios.setTipo(tipo);
        omUsuarios.setNombre(nombre);
        omUsuarios.setEmail(email);
        omUsuarios.setNick(nick);
        omUsuarios.setPassword(password);
        
        return oUsuariosDAO.modificar(omUsuarios);
    }

    public DefaultTableModel RecuperarUsuario(String nick, String password)
    {
        return oUsuariosDAO.RecuperarUsuario(nick, password);
    }    
}
