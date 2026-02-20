package ControlStructures.Matrices;

import java.util.Scanner;

// Primer ejercicio con matrices, ejercicio consistente en calcular el valor máximo de una fila.
public class MatrizMax {
    public static void main(String[]args){
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
        System.out.println("\nMáximos de cada fila:");
        for (int i = 0; i < matriz.length; i++){
            maxFila(matriz,i);
        }
    }
    public static int maxFila(int[][] matriz, int fila) {
    int max = matriz[fila][0]; // Suponer un valor máximo, que se evaluará después.
        for (int i = 1; i < matriz[fila].length; i++){
        if (matriz[fila][i] > max){
            max = matriz[fila][i];
        }
    }
        System.out.println("Fila " + fila + " valor máximo : " + max);
        return max;
    }
}
