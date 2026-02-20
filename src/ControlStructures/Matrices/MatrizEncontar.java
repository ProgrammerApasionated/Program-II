package ControlStructures.Matrices;
import java.util.Scanner;
// Ejercicio consitente en encontar un valor y mostrar el/los índices que se encuentra el valor.
public class MatrizEncontar {
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
        System.out.println("Introduce el valor : ");
        int valor = sc.nextInt();
        encontrarIndice(matriz,valor);
    }
    public static void encontrarIndice(int [][] matriz, int valor){
        boolean encontrado = false;
        for (int fila = 0; fila < matriz.length; fila++){
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == valor) {
                    System.out.println("El valor se ha encontrado en la fila : " + fila + " y en la columna : " + columna);
                    encontrado = true;
                }
            }
        }
        if (!encontrado){
            System.out.println("El valor no se encuentra en la matriz.");
        }
    }
}
