package test;

import datos.PersonaDAO;
import entity.Persona;
import java.util.*;

public class TestManejoPersonas {

    public static PersonaDAO personaDao = new PersonaDAO();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n|----MENÚ PRINCIPAL----|"
                    + "\n1.Ver lista de personas"
                    + "\n2.Crear persona"
                    + "\n3.Actualizar persona"
                    + "\n4.Eliminar persona"
                    + "\n0.Salir");
            var opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                listarPersonas();
            } else if (opcion == 2) {
                insertarPersona();
            } else if (opcion == 3) {
                actualizarPersona();
            } else if (opcion == 4) {
                eliminarPersona();
            } else if (opcion == 0) {
                break;
            }
        }
    }

    public static void listarPersonas() {
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println(persona);
        });
    }

    public static void insertarPersona() {
        Persona personaObj = null;

        System.out.println("\n|----NUEVO REGISTRO----|"
                + "\nIngrese el nombre: ");
        String nombrePersona = sc.nextLine();
        System.out.println("Ingrese el apellido");
        String apellidoPersona = sc.nextLine();
        System.out.println("Ingrese el e-mail:");
        String emailPersona = sc.nextLine();
        System.out.println("Ingrese el teléfono:");
        String telefonoPersona = sc.nextLine();
        personaObj = new Persona(nombrePersona, apellidoPersona, emailPersona, telefonoPersona);
        personaDao.insertar(personaObj);
    }

    public static void actualizarPersona() {
        Persona personaObj = null;

        System.out.println("\n|----ACTUALIZAR REGISTRO----|"
                + "\nIngrese el ID: ");
        int idPersona = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el nombre");
        String nombrePersona = sc.nextLine();
        System.out.println("Ingrese el apellido");
        String apellidoPersona = sc.nextLine();
        System.out.println("Ingrese el e-mail:");
        String emailPersona = sc.nextLine();
        System.out.println("Ingrese el teléfono:");
        String telefonoPersona = sc.nextLine();
        personaObj = new Persona(idPersona, nombrePersona, apellidoPersona, emailPersona, telefonoPersona);
        personaDao.actualizar(personaObj);
    }

    public static void eliminarPersona() {
        Persona personaObj = null;

        System.out.println("\n|----ELIMINAR REGISTRO----|"
                + "\nIngrese el ID: ");
        int idPersona = Integer.parseInt(sc.nextLine());
        personaObj = new Persona(idPersona);
        personaDao.eliminar(personaObj);
    }
}
