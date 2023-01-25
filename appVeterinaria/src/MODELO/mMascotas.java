package MODELO;

public class mMascotas {
    private String idmascotas;
    private String nombre;
    private String tipo;
    private String raza;
    private int edad;
    private String descripcion;
    private String clientes_idcliente;

    public mMascotas() {
    }

    public mMascotas(String idmascotas, String nombre, String tipo, String raza, int edad, String descripcion, String clientes_idcliente) {
        this.idmascotas = idmascotas;
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.descripcion = descripcion;
        this.clientes_idcliente = clientes_idcliente;
    }

    public String getIdmascotas() {
        return idmascotas;
    }

    public void setIdmascotas(String idmascotas) {
        this.idmascotas = idmascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClientes_idcliente() {
        return clientes_idcliente;
    }

    public void setClientes_idcliente(String clientes_idcliente) {
        this.clientes_idcliente = clientes_idcliente;
    }

}
