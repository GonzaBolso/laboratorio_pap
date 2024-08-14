package logica;

//import excepciones.UsuarioNoExisteException;

public class ControladorUsuario implements IControladorUsuario{

	public ControladorUsuario() {	
	}
	
	public void registrarUsuario(String nickname, String n, String ap, String mail, String contraseña){
        ManejadorUsuario mu = ManejadorUsuario.getinstance();
        Usuario u = mu.obtenerUsuario(nickname);  // Lo voy a buscar a la coleccion
        if (u != null)  // Si lo encontre es porque ya existe
        	System.out.print("ya esta registrado");
        	//throw new UsuarioRepetidoException("El usuario " + ci + " ya esta registrado");

        u = new Usuario(nickname, n, ap, mail, contraseña);  // Creo el objeto con el contructor de la clase Usuario
        mu.addUsuario(u);
    }
	
	// Devuelvo una DataUsuario para ser mostrado en la capa de presentacion
	public DataUsuario verInfoUsuario(String nickname){
        ManejadorUsuario mu = ManejadorUsuario.getinstance();  // mu tiene la coleccion
        Usuario u = mu.obtenerUsuario(nickname);                     // u obtiene el usuario pasado por parametro 
        if (u != null) // Si lo encontre es porque ya existe, solo traigo sus datos
            return new DataUsuario(u.getNickname(), u.getNombre(), u.getApellido(), u.getEmail());
        else
        	System.out.print("No existe Usuario");
        	//throw new UsuarioNoExisteException("El usuario " + ci + " no existe");
    }
	
	// Get de usuarios, pero no de los objetos sino de los DataUsuarios
    public DataUsuario[] getUsuarios(){
        ManejadorUsuario mu = ManejadorUsuario.getinstance();
        Usuario[] usrs = mu.getUsuarios();  // Usa el getUsuarios que devuelve array de objetos

        if (usrs != null) {
            DataUsuario[] du = new DataUsuario[usrs.length];
            Usuario usuario;

            // Para separar logica de presentacion, no se deben devolver los Usuario,
            // sino los DataUsuario
            for (int i = 0; i < usrs.length; i++) {
                usuario = usrs[i];
                du[i] = new DataUsuario(usuario.getNickname(), usuario.getNombre(), usuario.getApellido(), usuario.getEmail());
                // pasa el array de objetos a array de DataUsuaios
            }
            return du;
        } else
        	System.out.print("No existen Usuarios registrados");
            //throw new UsuarioNoExisteException("No existen usuarios registrados");

    }
	
}