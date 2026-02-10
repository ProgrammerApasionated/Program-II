package Estructuras;
import java.util.Scanner;
// Estructura de como usar un scanner simple en Java.

public class EstructuraScanner {
    public static void main(String[]arg){
        // Creamos un scanner y lo llamamos sc.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la variable :");
        int variable = sc.nextInt();
    }
}
