package Basics.Pruebas;

import java.util.Scanner;
// Prueba de métodos boléanos en Java.
public class PruebaMétodosBoolean {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número :");
        int num = sc.nextInt();
        if (esPrimo(num)){
            System.out.println("El número " + num + " es primo.");
        }
        else
            System.out.println("El número " + num + " no es primo.");
    }
    public static boolean esPrimo(int num) {
        // Depuramos los casos que no son correctos.
        if (num <= 1){
            return false;
        }
        int cant_divisores = 0;
        for (int i = 1; i <= num/2 ; ++i) {
            if (num % i == 0) {
                ++cant_divisores;
            }
        }
        // Añadir el propio número como divisor.
        ++cant_divisores;
        if (cant_divisores == 2){
            return true;
        }
        return false;
    }
}
