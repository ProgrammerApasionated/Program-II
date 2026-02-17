package ControlStructures.Cadenas;

import java.util.Scanner;

// Ejercicio que busca contar cuántas rachas de dígitos consecutivos hay en una cadena.
public class ContarRachasDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena a leer : ");
        String cadena = sc.nextLine();
        int rachas = contarRachas(cadena);
        System.out.println("La cantidad de rachas de dígitos es : " + rachas);
    }
    public static int contarRachas(String frase) {
        int rachas = 0;
        boolean enRacha = false;
        // Recorremos la cadena carácter a carácter
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isDigit(c)) {
                // Si encontramos un dígito y no estábamos en racha, empieza una nueva
                if (!enRacha) {
                    rachas++;
                    enRacha = true;
                }
            }
            else {
                // Si encontramos un carácter que no es dígito, salimos de la racha
                enRacha = false;
            }
        }
        return rachas;
    }
}
