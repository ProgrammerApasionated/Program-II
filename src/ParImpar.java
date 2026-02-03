import java.util.Scanner;
// Programa que pidiendo un número al usuario dice si es par o impar.
public class ParImpar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número : ");
        int num = sc.nextInt();
        if (num%2 == 0){
            System.out.println("El número " + num + " es par.");
        }
        else {
            System.out.println ("El número " + num + " es impar.");
        }
    }
}
