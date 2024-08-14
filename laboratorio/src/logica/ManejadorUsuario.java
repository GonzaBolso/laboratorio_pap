package logica;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ManejadorUsuario {
    private Map<String, Usuario> usuarioisNick;           // Coleccion
    private static ManejadorUsuario instancia = null;  // Instancia unica de manejador usando Singleton

    private ManejadorUsuario() {                       // Constructor privado
    	usuarioisNick = new HashMap<String, Usuario>();
    }

    public static ManejadorUsuario getinstance() {
        if (instancia == null)
            instancia = new ManejadorUsuario();      // Constructor solo se llama de aca
        return instancia;
    }

    public void addUsuario(Usuario usu) {
        String nick = usu.getNickname();    // Get de la cedula
        usuarioisNick.put(nick, usu);                 // agrego al usuario a la coleccion
    }

    public Usuario obtenerUsuario(String nickname) {     // Recibo una cedula y devuelvo el objeto Usuario
        return ((Usuario) usuarioisNick.get(nickname));
    }

    public Usuario[] getUsuarios() {      // Devuelve la coleccion completa de los usuarios en array
        if (usuarioisNick.isEmpty())
            return null;
        else {
            Collection<Usuario> usrs = usuarioisNick.values(); // Metodo values devuelve la coleccion entera
            Object[] o = usrs.toArray();                    // Devuelve los objetos a una array     
            Usuario[] usuarios = new Usuario[o.length];     // Creo  un array de usuarios
            for (int i = 0; i < o.length; i++) {
                usuarios[i] = (Usuario) o[i];              // Cargo con la salida de toArray
            }

            return usuarios;
        }
    }

}