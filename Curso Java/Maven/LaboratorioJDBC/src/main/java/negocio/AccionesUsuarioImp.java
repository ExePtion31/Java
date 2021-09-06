package negocio;

import data.*;
import entity.Usuario;
import java.util.List;
import java.util.Scanner;

public class AccionesUsuarioImp implements IAccionesUsuario {

    Scanner sc = new Scanner(System.in);
    IUsuarioDAO data = new UsuarioDAOImp();

    @Override
    public void listarUsuarios() {
        List<Usuario> usuarios = data.listarUsuarios();
        usuarios.forEach(usuario -> {
            System.out.println(usuario);
        });
    }

    @Override
    public void crearUsuario() {
        Usuario usuario = null;
        System.out.println("\n|----NUEVO USUARIO----|"
                + "\nNombre de usuario:");
        String nombreUsuario = sc.nextLine();
        System.out.println("Contraseña usuario:");
        String passUsuario = sc.nextLine();
        usuario = new Usuario(nombreUsuario, passUsuario);
        data.crearUsuario(usuario);
    }

    @Override
    public void actualizarUsuario() {
        Usuario usuario = null;
        System.out.println("\n|----ACTUALIZAR USUARIO----|"
                + "\nID Usuario: ");
        int idUsuario = Integer.parseInt(sc.nextLine());
        System.out.println("Nuevo nombre de usuario:");
        String nombreUsuario = sc.nextLine();
        System.out.println("Nueva contraseña usuario:");
        String passUsuario = sc.nextLine();
        usuario = new Usuario(idUsuario, nombreUsuario, passUsuario);
        data.actualizarUsuario(usuario);
    }

    @Override
    public void eliminarUsuario() {
        Usuario usuario = null;
        System.out.println("\n|----ACTUALIZAR USUARIO----|"
                + "\nID Usuario: ");
        int idUsuario = Integer.parseInt(sc.nextLine());
        usuario = new Usuario(idUsuario);
        data.eliminarUsuario(usuario);
    }
}
