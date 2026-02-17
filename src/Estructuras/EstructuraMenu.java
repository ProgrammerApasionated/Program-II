package Estructuras;

import java.util.Scanner;
import java.util.Arrays;

public class EstructuraMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int[] vector = null;
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
            }
            if (opcion == 2) {
                variable = crearVariable();
                System.out.println("Variable creada: " + variable);
            }
            if (opcion == 3) {
                System.out.println("Saliendo del programa...");
            }
            if (opcion < 1 || opcion > 3) {
                System.out.println("Opción no válida.");
            }
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
}
