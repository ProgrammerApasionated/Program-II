package ControlStructures.Cadenas;
import java.util.Scanner;
// Ejercicios que busca la racha de mayúsculas en una cadena.
public class RachaMayusculas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena a leer :");
        String cadena = sc.nextLine();
        int racha_mayus = 0;
        racha_mayus = contarMayus(cadena);
        System.out.println("La mayor racha de mayúsculas ha sido de : " + racha_mayus);
    }
    public static int contarMayus(String frase){
        int racha_mayu = 0;
        int racha_max = 0;
        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if (Character.isUpperCase(c)){
                ++racha_mayu;
            }
            else {
                if (racha_mayu > racha_max){
                    racha_max = racha_mayu;
                }
                racha_mayu = 0;
            }
        }
        if (racha_mayu > racha_max){
            racha_max = racha_mayu;
        }
        return racha_max;
    }
}
