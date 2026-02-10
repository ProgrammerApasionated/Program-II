package Basics.Pruebas;

// Programa para probar distintas estructuras condicionales o secuenciales.
// Ejemplos completamente triviales pero útiles para empezar.
public class PruebaEstructuras {
    public static void main (String[] args){
        System.out.println("Azul, verde");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
        // Sentencia for con 5 interacciones, donde i++ == i+=1
        int valor = 1;
        ++valor;
        if (valor == 1){
            System.out.println("Esto es imposible");
        }
        else {
            System.out.println("Esto tiene más sentido");
        }
        // Condicional simple con la estructura if-else, que siempre ejecuta la parte else.
        int contador_valor = 0;
        while (valor <= 3){
            ++valor;
            ++contador_valor;
            System.out.println("Llevamos " + contador_valor + " interacciones " );
            }
        // Ejemplo simple para comprobar el funcionamiento del while y la concatenación de cadenas y variables.
    }
}