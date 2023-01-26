package CONTROLADOR;

import DAO.MedicosDAO;
import MODELO.mMedicos;
import javax.swing.table.DefaultTableModel;

public class cMedicos {

    MedicosDAO oMedicosDAO = new MedicosDAO();
    mMedicos omMedicos = new mMedicos();

    public DefaultTableModel listar() {
        return oMedicosDAO.listar();
    }

    public boolean insertar(String idmedico, String colegiatura, String nombres, String apaterno, String amaterno, String direccion, String telefono, String email) {
        omMedicos.setIdmedico(idmedico);
        omMedicos.setColegiatura(colegiatura);
        omMedicos.setNombres(nombres);
        omMedicos.setApaterno(apaterno);
        omMedicos.setAmaterno(amaterno);
        omMedicos.setDireccion(direccion);
        omMedicos.setTelefono(telefono);
        omMedicos.setEmail(email);

        return oMedicosDAO.insertar(omMedicos);
    }

    public boolean modificar(String idmedico, String colegiatura, String nombres, String apaterno, String amaterno, String direccion, String telefono, String email) {
        omMedicos.setIdmedico(idmedico);
        omMedicos.setColegiatura(colegiatura);
        omMedicos.setNombres(nombres);
        omMedicos.setApaterno(apaterno);
        omMedicos.setAmaterno(amaterno);
        omMedicos.setDireccion(direccion);
        omMedicos.setTelefono(telefono);
        omMedicos.setEmail(email);

        return oMedicosDAO.modificar(omMedicos);
    }

    public boolean eliminar(String idmedico) {

        boolean valor = oMedicosDAO.eliminar(idmedico);
        return valor;
    }
}
