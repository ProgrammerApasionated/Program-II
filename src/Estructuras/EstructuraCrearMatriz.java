package Estructuras;

import java.util.Scanner;

public class EstructuraCrearMatriz {
    public static void main (String[]args) {
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
    }
}
// Utilizado en los ejercicios de matrices.