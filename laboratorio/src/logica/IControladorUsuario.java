package logica;

//import excepciones.UsuarioNoExisteException;
//import excepciones.UsuarioRepetidoException;

public interface IControladorUsuario {
	
	public abstract void registrarUsuario(String nickname, String n, String ap, String mail);

	public abstract DataUsuario verInfoUsuario(String nickname);
    
    public abstract DataUsuario[] getUsuarios();
}