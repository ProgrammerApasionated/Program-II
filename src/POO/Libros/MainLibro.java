package POO.Libros;

import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro = new Libro("El Quijote", "Cervantes", "Estantería A", false);
        libro.imprimir();

        System.out.println("¿Qué quieres modificar?");
        System.out.println("1. Nombre");
        System.out.println("2. Autor");
        System.out.println("3. Sitio");
        System.out.println("4. Cambiar estado de prestado");
        System.out.println("Otro número: Ningún Cambio");
        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        switch (opcion) {
            case 1:
                System.out.print("Nuevo nombre: ");
                libro.setNombre(sc.nextLine());
                break;
            case 2:
                System.out.print("Nuevo autor: ");
                libro.setAutor(sc.nextLine());
                break;
            case 3:
                System.out.print("Nuevo sitio: ");
                libro.setSitio(sc.nextLine());
                break;
            case 4:
                libro.cambiarPrestado();
                break;
            default:
                System.out.println("No se cambia nada.");
        }
        System.out.println("Después de los cambios:");
        libro.imprimir();
    }
}