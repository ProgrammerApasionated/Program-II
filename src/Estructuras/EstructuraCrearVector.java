package Estructuras;

import java.util.Scanner;
// Estructura para crear un vector en Java.
public class EstructuraCrearVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de elementos del vector : ");
        int dim = sc.nextInt();
        int[] v = new int[dim];
        System.out.println("Introduce los elementos del vector : ");
        for (int i = 0; i < dim; i++) {
            v[i] = sc.nextInt();
        }
    }
}