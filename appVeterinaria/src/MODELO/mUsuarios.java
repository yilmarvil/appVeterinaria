package MODELO;

public class mUsuarios {
    private int idusuarios;
    private int tipo;
    private String nombre;
    private String email;
    private String nick;
    private String password;

    public mUsuarios() {
    }

    public mUsuarios(int idusuarios, int tipo, String nombre, String email, String nick, String password) {
        this.idusuarios = idusuarios;
        this.tipo = tipo;
        this.nombre = nombre;
        this.email = email;
        this.nick = nick;
        this.password = password;
    }

    public int getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
