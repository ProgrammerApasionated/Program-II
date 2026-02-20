package ControlStructures.Cadenas;

import java.util.Scanner;

// Primera toma de contacto con strings.
// Se busca encontrar la cantidad de dígitos que hay en una cadena.
public class ContarDígitos {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena a leer :");
        String cadena = sc.nextLine();
        int cant_num = 0;
        cant_num = contarNum(cadena);
        System.out.println("La cantidad de dígitos en la cadena es de : " + cant_num);
    }
    public static int contarNum(String frase) {
        int cant_num = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isDigit(c)){
                ++cant_num;
            }
        }
        return cant_num;
    }
}
