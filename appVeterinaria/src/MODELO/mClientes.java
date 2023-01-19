package MODELO;

public class mClientes {
    
    private String idcliente;
    private String dni;
    private String nombres;
    private String apaterno;
    private String amaterno;
    private String direccion;
    private String telefono;
    private String email;

    public mClientes() {
    }

    public mClientes(String idcliente, String dni, String nombres, String apaterno, String amaterno, String direccion, String telefono, String email) {
        this.idcliente = idcliente;
        this.dni = dni;
        this.nombres = nombres;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
