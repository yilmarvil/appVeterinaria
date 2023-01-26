package MODELO;

public class mMedicos {

    private String idmedico;
    private String colegiatura;
    private String nombres;
    private String apaterno;
    private String amaterno;
    private String direccion;
    private String telefono;
    private String email;

    public mMedicos() {
    }

    public mMedicos(String idmedico, String colegiatura, String nombres, String apaterno, String amaterno, String direccion, String telefono, String email) {
        this.idmedico = idmedico;
        this.colegiatura = colegiatura;
        this.nombres = nombres;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(String idmedico) {
        this.idmedico = idmedico;
    }

    public String getColegiatura() {
        return colegiatura;
    }

    public void setColegiatura(String colegiatura) {
        this.colegiatura = colegiatura;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
