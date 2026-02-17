package ControlStructures.Vectores;

import java.util.Scanner;
import java.util.Arrays;
// Trabajar con un vector y a base de una función crear un nuevo vector sn repeticiones.
// Usando la función EsAlternante del ejercicio anterior demostramos la solución.
public class NoRepetidos {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la dimensión del vector");
        int dim = sc.nextInt();
        int[] v = new int[dim];
        // Creamos el vector con la dimensión dada pero con elementos vacíos.
        System.out.println("Introduce los elementos del vector : ");
        for (int i = 0; i < dim; i++){
            v[i] = sc.nextInt();
        }
        // Creamos el vector con cada valor dado.
        System.out.println("Introduce el valor a eliminar: ");
        int valor = sc.nextInt();
        System.out.println("Vector original: " + Arrays.toString(v));
        // Imprimimos el vector original
        int[] v_nuevo = eliminarValor(v,valor);
        if (esAlternante(v_nuevo)){
            System.out.println("El vector es alternante.");
            System.out.println("Vector sin el valor: " + Arrays.toString(v_nuevo));
        }
        else {
            System.out.println("El vector no es alternante.");
            System.out.println("Vector sin el valor: " + Arrays.toString(v_nuevo));
        }
        // Comparamos la condición Alternante y mostramos el nuevo vector.
    }
    public static int[] eliminarValor(int[] v, int valor){
        int contador = 0;
        for (int i : v){
            if (i != valor){
                contador++ ;
            }
        }
        int [] vector_nuevo = new int[contador];
        int j = 0;
        for (int i : v){
            if (i != valor){
                vector_nuevo[j] = i;
                j++;
            }
        }
        // Comparando los valores del vector con el valor dado creamos un vector nuevo con esa dimensión y con los valores que no coinciden.
    return vector_nuevo;

    }
    public static boolean esAlternante(int[] v){
        for (int i = 0; i < v.length - 1; i++){
            boolean actualPar = (v[i] % 2 == 0);
            boolean siguientePar = (v[i+1] % 2 == 0);
            if (actualPar == siguientePar){
                return false;
            }
        }
        return true;
        // Mediante la comprobación de que dos elementos consecutivos no son pares demostramos que son Alternantes.
    }
}
