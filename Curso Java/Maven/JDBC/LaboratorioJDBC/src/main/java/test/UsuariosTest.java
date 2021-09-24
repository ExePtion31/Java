package test;

import java.util.Scanner;
import negocio.*;

public class UsuariosTest {

    public static void main(String[] args) {
        IAccionesUsuario data = new AccionesUsuarioImp();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n|-----MENÚ PRINCIPAL-----|"
                    + "\n1.-Ver lista de usuarios."
                    + "\n2.-Crear un nuevo usuario."
                    + "\n3.-Actualizar un usuario."
                    + "\n4.-Eliminar un usuario."
                    + "\n0.-Salir.");
            int respuesta = Integer.parseInt(sc.nextLine());
            if (respuesta == 1) {
                data.listarUsuarios();
            } else if (respuesta == 2) {
                data.crearUsuario();
            } else if (respuesta == 3) {
                data.actualizarUsuario();
            } else if (respuesta == 4) {
                data.eliminarUsuario();
            } else if (respuesta == 0) {
                break;
            }
        }
    }
}
