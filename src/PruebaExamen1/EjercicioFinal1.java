package PruebaExamen1;
import java.util.Scanner;
import java.util.Arrays;

// Ejercicio Final antes del primer examen de evaluación contínua.
// Consistente en hacer un ejercicio más abstracto de cada carpeta.
// Concretamente, haremos 3 métodos con 3 formas de retorno distintas, sobre cadenas, vectores y matrices.

public class EjercicioFinal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena para comprobar si es palíndromo:");
        String cadena = sc.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("La cadena \"" + cadena + "\" es un palíndromo.");
        } else {
            System.out.println("La cadena \"" + cadena + "\" NO es un palíndromo.");
        }

        int[] vector = {1, 2, 3, 4, 5};
        System.out.println("\nProbando si el vector está ordenado:");
        estáOrdenador(vector);

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("\nProbando matriz sin ceros:");
        int[][] nueva = matrizSinCeros(matriz);

        if (nueva != null) {
            System.out.println("La matriz no contiene ceros. Copia generada:");
            for (int i = 0; i < nueva.length; i++) {
                System.out.println(Arrays.toString(nueva[i]));
            }
        } else {
            System.out.println("No se ha generado matriz nueva porque contenía ceros.");
        }

        sc.close();
    }
    public static boolean esPalindromo(String cadena){
        String cadena_invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--){
            char c = cadena.charAt(i);
            cadena_invertida += c;
        }
        // Invertimos la cadena y damos esos valores a la variable auxiliar.
        for (int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            char c2 = cadena_invertida.charAt(i);
            // Más corto y óptimo - >   if (cadena.charAt(i) != cadena_invertida.charAt(i))
            if (c != c2){
                return false;
            }
            // Comparamos la condición, y con que uno no se cumpla ya podemos retornar false.
        }
        return true;
    }
    public static void estáOrdenador(int [] v){
        boolean ordenado = true;
        for (int i = 0; i < v.length - 1; i++){
            if (v[i] > v[i + 1]) {
                ordenado = false;
                break;
            }
        }
        if (ordenado) {
            System.out.println("El vector " + Arrays.toString(v) + " está ordenado de menor a mayor.");
        }
        else {
            System.out.println("El vector " + Arrays.toString(v) + " no está ordenado de menor a mayor.");
        }
    }
    public static int[][] matrizSinCeros(int[][] m){
        boolean sinCeros = true;
        for (int fila = 0; fila < m.length; fila++){
            for (int col = 0; col < m[0].length; col++){
                if (m[fila][col] == 0){
                    sinCeros = false;
                }
            }
        }
        if (!sinCeros){
            System.out.println("La matriz contiene ceros.");
            return null;
        }
        int[][] nueva = new int[m.length][m[0].length];
        for (int fila = 0; fila < m.length; fila++){
            for (int col = 0; col < m[0].length; col++){
                nueva[fila][col] = m[fila][col];
            }
        }
        return nueva;
    }
}
