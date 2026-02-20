package ControlStructures.Cadenas;

import java.util.Scanner;
// Ejercicios de encontrar un patrón con un método booleano.
public class EncontrarPatrón {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena a leer :");
        String cadena = sc.nextLine();
        System.out.println("Introduce el patrón a buscar :");
        String patron = sc.nextLine();
        if (encontrarPatron(cadena,patron)){
            System.out.println("Se ha encontrado el patrón " + patron + " en la cadena : " + cadena);
        }
        else {
            System.out.println("No se ha encontrado el patrón " + patron + " en la cadena : " + cadena);
        }
    }
    public static boolean encontrarPatron(String frase, String patron){
        for (int i = 0; i <= frase.length() - patron.length(); i++){
            boolean coincide = true;
            for (int j = 0; j < patron.length(); j++){
                if (frase.charAt(i+j) != patron.charAt(j)){
                    coincide = false;
                    break;
                }
            }
            if (coincide){
                return true;
            }
        }
        return false;
    }
}
// Mediante una comprobación con valores boolean, se puede comprobar si coincide o no un patrón con una cadena.
