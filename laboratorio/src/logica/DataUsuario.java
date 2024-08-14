package logica;

public class DataUsuario {

	private String nickname;
    private String nombre;
    private String apellido;
    private String email;
    //private String fnacimiento;
    private String contraseña;

    public DataUsuario() {
    	this.setNickname(new String());
        this.setNombre(new String());
        this.setApellido(new String());
        this.setEmail(new String());
        this.setContraseña(new String());
    }

    public DataUsuario(String nombre, String apellido, String nickname, String email, String contraseña) {
    	this.setNickname(nickname);
    	this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEmail(email);
        this.setContraseña(contraseña);
    }

    public String getNombre() {
        return nombre;
    }

    public String getNickname() {
        return nickname;
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

    /* Sirve para mostrar textualmente la informacion del usuario, por ejemplo en un ComboBox
     */
    public String toString() {
        return getNickname() + " / " + getNombre() + " / " + getApellido() + " / " + getEmail();
    }

    private void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    private void setEmail(String email) {
        this.email = email;
    }
    
    private void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
