package Basics.Pruebas;

import java.util.Scanner;
// Programa donde probamos los métodos en Java.
public class PruebaMétodosStatic {
    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número : ");
        int digito = sc.nextInt();
        int divisor = 0;
        divisor = divisores(digito);
        System.out.println("La cantidad de divisores de " + digito + " son : " + divisor);
    }
    public static int divisores(int num) {
        int cant_divisores = 0;
        for (int i = 1; i <= num/2; ++i) {
            if (num % i == 0) {
                ++cant_divisores;
            }
        }
    return cant_divisores + 1;
    }
}
