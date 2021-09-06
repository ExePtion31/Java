package data;

import entity.Usuario;
import java.util.List;

public interface IUsuarioDAO {
    public static final String SQL_READ = "SELECT * FROM usuarios";
    public static final String SQL_CREATE = "INSERT INTO usuarios(usuario, pass) VALUES(?, ?)";
    public static final String SQL_UPDATE = "UPDATE usuarios SET usuario = ?, pass = ? WHERE id_usuario = ?";
    public static final String SQL_DELETE = "DELETE FROM usuarios WHERE id_usuario = ?";
    
    List<Usuario> listarUsuarios();
    
    void crearUsuario(Usuario usuario);
    
    void actualizarUsuario(Usuario usuario);
    
    void eliminarUsuario(Usuario usuario);
}
