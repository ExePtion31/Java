package data;

import static data.ConexionDB.*;
import entity.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAOImp implements IUsuarioDAO {

    @Override
    public List<Usuario> listarUsuarios() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet query = null;
        Usuario usuario = null;
        List<Usuario> usuariosList = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_READ);
            query = stmt.executeQuery();
            while (query.next()) {
                usuario = new Usuario(query.getInt("id_usuario"), query.getString("usuario"), query.getString("pass"));
                usuariosList.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(query);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuariosList;
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_CREATE);
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getPassword());
            stmt.executeUpdate();
            System.out.println("\n|-------ALERTA-------|"
                    + "\nUsuario creado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId());
            stmt.executeUpdate();
            System.out.println("\n|-------ALERTA-------|"
                    + "\nUsuario actualizado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId());
            stmt.executeUpdate();
            System.out.println("\n|-------ALERTA-------|"
                    + "\nUsuario eliminado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

}
