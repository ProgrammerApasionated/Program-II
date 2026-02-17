package Basics.EjerciciosSimples;

import java.util.Scanner;
// Hacemos un programa de un cálculo de un factorial con un número que da el usuario.
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número : ");
        int numero = sc.nextInt();
        int factorial = 1;
        for (int i=numero ;i >=1 ; i-- ){
            // Multiplicamos por i y luego i se reduce en 1 al final de cada vuelta
            factorial *=i;
        }
    System.out.println("El factorial de " + numero + " es : " + factorial);
    }
}

