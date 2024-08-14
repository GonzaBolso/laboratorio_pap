package logica;

public class Usuario {

	protected String nickname;
    protected String nombre;
    protected String apellido;
    protected String email;
    //private class DtFecha;
    protected String contraseña;

    public Usuario(String nick, String n, String ap,String mail, String pass) {
    	this.nickname = nick;
    	this.nombre = n;
        this.apellido = ap;
        this.email = mail;
        this.contraseña = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nick) {
        nickname = nick;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }

    public void setApellido(String ap) {
        apellido = ap;
    }
    
    public void setEmail(String mail) {
        nombre = mail;
    }
    
    public void setContraseña(String pass) {
        nombre = pass;
    }

}
