package POO.SistemaEscolar.App;

import java.util.Scanner;

import POO.SistemaEscolar.Modelos.Estudiantes;
import POO.SistemaEscolar.Modelos.Asignaturas;

public class MainSistemaEscolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaEscolar sistema = new SistemaEscolar();
        int opcion = -1;
        while (opcion != 6) {
            System.out.println("===== MENÚ SISTEMA ESCOLAR =====");
            System.out.println("1. Insertar estudiante");
            System.out.println("2. Insertar asignatura");
            System.out.println("3. Listar estudiantes");
            System.out.println("4. Listar asignaturas");
            System.out.println("5. Buscar estudiante por nombre");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();
                    System.out.print("Cantidad de notas: ");
                    int cant = Integer.parseInt(sc.nextLine());
                    int[] notas = new int[cant];
                    for (int i = 0; i < cant; i++) {
                        System.out.print("Nota " + (i + 1) + ": ");
                        notas[i] = Integer.parseInt(sc.nextLine());
                    }
                    Estudiantes nuevo = new Estudiantes(nombre, notas, curso);
                    sistema.insertarEstudiante(nuevo);
                    System.out.println("Estudiante insertado correctamente.");
                    break;
                case 2:
                    System.out.print("Nombre de la asignatura: ");
                    String asig = sc.nextLine();
                    System.out.print("Horario: ");
                    String horario = sc.nextLine();
                    System.out.print("Profesor: ");
                    String profe = sc.nextLine();
                    Asignaturas nueva = new Asignaturas(asig, horario, profe);
                    sistema.insertarAsignatura(nueva);
                    System.out.println("Asignatura insertada correctamente.");
                    break;
                case 3:
                    System.out.println("=== ESTUDIANTES ===");
                    System.out.println(sistema.listarEstudiantes());
                    break;
                case 4:
                    System.out.println("=== ASIGNATURAS ===");
                    System.out.println(sistema.listarAsignaturas());
                    break;
                case 5:
                    System.out.print("Introduce el nombre a buscar: ");
                    String buscar = sc.nextLine();
                    Estudiantes encontrado = sistema.buscarEstudiante(buscar);
                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado.getNombre() +
                                " | Curso: " + encontrado.getCurso() +
                                " | Notas: " + encontrado.mostrarNotas());
                    } else {
                        System.out.println("No existe un estudiante con ese nombre.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}
