package Basics.Pruebas;

import java.util.Scanner;

public class PruebaParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.println("Has introducido: " + numero);
        int contador = 0;
        for (int i = 0; i < numero; i++){
            if (i % 2 == 0){
                System.out.println(i + " es par");
            }
            else {
                System.out.println(i + " es impar");
            }
            contador += 1;
        }
    System.out.println("La cantidad de números es de " + contador);
    }
}
