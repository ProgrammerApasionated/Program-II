package Estructuras;

import java.util.Scanner;
import java.util.Arrays;

public class EstructuraMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int[] vector = null;
        int[][] matriz = null;
        int variable = 0;
        System.out.println("=== MENÚ INTERACTIVO ===");
        while (opcion != 3) {
            System.out.println("\n1. Crear vector");
            System.out.println("2. Crear variable");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                vector = crearVector();
            } else if (opcion == 2) {
                variable = crearVariable();
                System.out.println("Variable creada: " + variable);
            } else if (opcion == 3) {
                matriz = crearMatriz();
                System.out.println("Matriz creada correctamente.");
            }
        }
        if (opcion == 4) {
            System.out.println("Saliendo del programa...");
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static int[] crearVector() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de elementos del vector: ");
        int dim = sc.nextInt();
        int[] v = new int[dim];
        System.out.println("Introduce los elementos del vector:");
        for (int i = 0; i < dim; i++) {
            v[i] = sc.nextInt();
        }
        System.out.println("Vector creado: " + Arrays.toString(v));
        return v;
    }

    public static int crearVariable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de la variable: ");
        int variable = sc.nextInt();
        return variable;
    }

    public static int[][] crearMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Número de columnas de la matriz: ");
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

}
// Futura implementación en los proyectos realizados.
// Consistente en un menú + las actuales estrucuturas.