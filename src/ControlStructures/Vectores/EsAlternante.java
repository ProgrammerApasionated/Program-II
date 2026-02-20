package ControlStructures.Vectores;

import java.util.Scanner;
// Trabajo con un vector que puede ser alternante (cambia de par a impar).
public class EsAlternante {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de elementos del vector : ");
        int dim = sc.nextInt();
        int [] v = new int[dim];
        System.out.println("Introduce los elementos del vector : ");
        for (int i = 0; i < dim; i++){
            v[i] = sc.nextInt();
        }
        // Mediante el uso de Estructuras.EstructuraCrearVector podemos crear el vector.
        if (esAlternante(v)){
            System.out.println("El vector es alternante.");
        }
        else {
            System.out.println("El vector NO es alternante.");
        }
        // Como el método es boolean se puede hacer un if que compruebe si es true o no la evaluación del método.
    }
    public static boolean esAlternante(int[] v){
        for (int i = 0; i < v.length - 1; i++){
            boolean actualPar = (v[i] % 2 == 0);
            boolean siguientePar = (v[i+1] % 2 == 0);
            // Para ser alternante NO tiene que ser par 2 índices consecutivos.
            if (actualPar == siguientePar){
                return false;
            }
        }
        return true;
    }
}
