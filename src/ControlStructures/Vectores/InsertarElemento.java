package ControlStructures.Vectores;

import java.util.Scanner;
import java.util.Arrays;
// Programa donde buscamos insertar un valor en un vector para que esté ordenado de menor a mayor.
public class InsertarElemento {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la dimensión del vector : ");
        int dim = sc.nextInt();
        int[] v = new int[dim];
        System.out.println("Introduce los elementos del vector : ");
        for (int i = 0; i < dim; i++){
            v[i] = sc.nextInt();
        }
        System.out.println("Introduce el valor a insertar : ");
        int valor = sc.nextInt();
        int[] v_nuevo = insertarElemento(v, valor);
        System.out.println("Vector original: " + Arrays.toString(v));
        System.out.println("Vector con el valor insertado: " + Arrays.toString(v_nuevo));
    }
    public static int posicionInsercion(int[] v, int valor){
        for (int i = 0; i < v.length; i++){
            if (valor <= v[i]){
                return i;
                // Compara el valor con el último elemento menor o igual que el valor.
            }
        }
        return v.length;
        // Si no encuentra un valor menor, devuelve el máximo rango del vector.
    }
    public static int[] insertarElemento(int[] v, int valor){
        int pos = posicionInsercion(v,valor);
        // Sacamos la posición con la función.
        int[] v_nuevo = new int[v.length + 1];
        for (int i = 0; i < pos; i++){
            v_nuevo [i] = v[i];
        }
        v_nuevo [pos] = valor;
        for (int i = pos; i < v.length; i++){
            v_nuevo [i + 1] = v[i];
        }
        // Con dos bucles se crea vector por partes añadiendo el vector en su posición correcta.
        return v_nuevo;
    }
}

