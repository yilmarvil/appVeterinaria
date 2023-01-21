package CONTROLADOR;

import DAO.LoginDAO;

public class cLogin {
    
    LoginDAO oLoginDAO = new LoginDAO();
    
    public boolean verificar(String nick, String password)
    {
        return oLoginDAO.verificar(nick,password);
    }
}
