package ControlStructures.Matrices;
import java.util.Scanner;
// Ejercicio consistente en transponer una matriz dada y devolverla.
public class MatrizTranspuesta {
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
        // Con la estructura de Estructuras.EstructuraCrearMatriz creamos la matriz.
        int[][] transpuesta = matrizTranspuesta(matriz);
        System.out.println("Matriz original : ");
        imprimirMatriz(matriz);
        System.out.println("Matriz transpuesta : ");
        imprimirMatriz(transpuesta);
        // Creando un método imprimir podemos enseñar una representación aproximada de los valores de la matriz.
    }
    public static int[][] matrizTranspuesta(int [][] matriz){
        int[][] matriz_trans = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++){
            for (int i2 = 0; i2 < matriz[0].length; i2++){
                matriz_trans[i2][i] = matriz[i][i2];
                // Creamos una variable auxiliar con los valores de la fila y columna de la matriz invertidos (filas por columnas y columnas por filas)
            }
        }
        return matriz_trans;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Enseñamos la matriz y hacemos un salto de línea por pura estética.
    }

}
