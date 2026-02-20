package ControlStructures.Matrices;
import java.util.Scanner;

// Ejercicio donde se calcula la suma de todos los valores de una matriz.
public class MatrizSuma {
    public static void main (String[]args){
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
        // Estructura sacada de Estructuras.EstructuraCrearMatriz.
        matrizSumatorio(matriz);
    }
    public static int matrizSumatorio(int[][]matriz){
        int suma = 0;
        for (int i = 0; i < matriz[0].length; i++){
            for (int i2 = 0; i2 < matriz.length; i2++) {
                suma = suma + matriz[i][i2];
            }
        }
        System.out.println("El sumatorio de la matriz es igual a " + suma);
        return suma;
    }
}
