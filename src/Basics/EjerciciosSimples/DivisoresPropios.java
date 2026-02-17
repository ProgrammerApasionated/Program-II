package Basics.EjerciciosSimples;

import java.util.Scanner;
// Programa que calcula los divisores propios de un número.
public class DivisoresPropios {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número : ");
        int digito = sc.nextInt();
        int cant_divisores = 0;
        for (int i = 1; i <= digito/2; ++i)
        // Recorremos los valores desde el 1, contándolo, hasta el dígito/2 para optimizar el proceso.
        {
            if (digito % i == 0)
            // Si el resto es 0, significa que es un divisor.
            {
                System.out.println("El número " + i + " es un divisor.");
                cant_divisores++;
            }
        }
    System.out.println("El número " + digito + " tiene un total de : " + cant_divisores + " divisores propios.");
    }
}
// Acabamos mostrando la cantidad encontrada de dígitos.