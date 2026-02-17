package ControlStructures.Vectores;

import java.util.Scanner;
import java.util.Arrays;
// Ejercicio en el que el objetivo es eliminar los valores negativos de un vector.
public class NoNegativos {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la dimensión : ");
        int dim = sc.nextInt();
        int[] v = new int[dim];
        System.out.println("Introduce los elementos del vector : ");
        for (int i = 0; i < dim; i++){
            v[i] = sc.nextInt();
        }
        // Leemos la dimensión y creamos el vector.
        System.out.println("El vector original es :" + Arrays.toString(v));
        int [] v_nuevo = eliminarNegativos(v);
        System.out.println("El vector nuevo es :" + Arrays.toString(v_nuevo));
        // Mostramos los dos vectores y damos el resultado al nuevo.
    }
    public static int[] eliminarNegativos(int[] v){
        int dim_nuevo = 0;
        for (int i : v){
            if (i >= 0){
                dim_nuevo++;
            }
        }
        int[] v_nuevo = new int[dim_nuevo];
        int j = 0;
        for (int i : v){
            if (i >= 0){
                v_nuevo[j] = i;
                j ++;
            }
        }
        // Recorremos para sacar la dimension y luego le damos valores.
        return v_nuevo;
    }
}
