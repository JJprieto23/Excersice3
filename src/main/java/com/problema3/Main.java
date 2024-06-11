package com.problema3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Contacto> contactos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int eleccion = obtenerEleccion();
            switch (eleccion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    eliminarContacto();
                    break;
                case 3:
                    buscarContacto();
                    break;
                case 4:
                    mostrarTodosLosContactos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Gestión de Contactos ---");
        System.out.println("1. Agregar un nuevo contacto");
        System.out.println("2. Eliminar un contacto");
        System.out.println("3. Buscar un contacto por nombre");
        System.out.println("4. Mostrar todos los contactos");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static int obtenerEleccion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void agregarContacto() {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número de teléfono: ");
        String numeroTelefono = scanner.nextLine();
        System.out.print("Ingrese el correo electrónico: ");
        String correoElectronico = scanner.nextLine();

        contactos.add(new Contacto(nombre, numeroTelefono, correoElectronico));
        System.out.println("Contacto agregado exitosamente.");
    }

    private static void eliminarContacto() {
        System.out.print("Ingrese el nombre del contacto a eliminar: ");
        String nombre = scanner.nextLine();
        Contacto contactoAEliminar = null;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                contactoAEliminar = contacto;
                break;
            }
        }
        if (contactoAEliminar != null) {
            contactos.remove(contactoAEliminar);
            System.out.println("Contacto eliminado exitosamente.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    private static void buscarContacto() {
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombre = scanner.nextLine();
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(contacto);
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    private static void mostrarTodosLosContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos para mostrar.");
        } else {
            System.out.println("\n--- Lista de Contactos ---");
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }
}