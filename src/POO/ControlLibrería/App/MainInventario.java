package POO.ControlLibrería.App;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import POO.ControlLibrería.Modelo.Inventario;
import POO.ControlLibrería.Excepciones.FicheroVacioException;
import POO.ControlLibrería.Modelo.Libro;

public class MainInventario {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Inventario inv = new Inventario();
        int opcion = -1;
        while (opcion != 6){
            System.out.println("===== MENÚ INVENTARIO =====");
            System.out.println("1. Cargar inventario desde fichero");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Eliminar libro por título");
            System.out.println("5. Insertar libro manualmente");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Introduce la ruta del fichero: \n");
                    String ruta = sc.nextLine();
                    File f = new File(ruta);
                    if (!f.exists()){
                        System.out.println("La ruta no existe.");
                        break;
                    }
                    try {
                        inv = GestorInventario.cargarDesdeFichero(ruta);
                        System.out.println("Se ha creado el inventario correctamente.");
                    } catch (FileNotFoundException e){
                        System.out.println("No se ha encontrado el fichero.");
                    } catch (FicheroVacioException e){
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                    case 2:
                        System.out.println("Los libros que hay son : ");
                        System.out.println(inv);
                        break;
                case 3 :
                    System.out.print("Introduce el título a buscar: ");
                    String tituloBuscar = sc.nextLine();
                    Libro encontrado = inv.buscarPorTitulo(tituloBuscar);
                    if (encontrado != null){
                        System.out.println("Libro encontrado: " + encontrado);
                    }
                    else {
                        System.out.println("No existe un libro con ese título.");
                    }
                    break;
                case 4:
                    System.out.println("Introduce el titulo a eliminar: ");
                    String titulo = sc.nextLine();
                    if (inv.eliminarPorTitulo(titulo)){
                        System.out.println("El libro se ha eliminado correctamente.");
                    }
                    else {
                        System.out.println("No se encontró ese libro.");
                    }
                    break;
                case 5:
                    System.out.print("Introduce el título del libro: ");
                    String tituloNuevo = sc.nextLine();
                    System.out.print("Introduce el autor: ");
                    String autorNuevo = sc.nextLine();
                    Libro nuevo = new Libro(tituloNuevo, autorNuevo);
                    inv.insertar(nuevo);
                    System.out.println("Libro insertado correctamente.");
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default
                        :System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}
