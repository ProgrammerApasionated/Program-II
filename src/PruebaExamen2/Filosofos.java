package PruebaExamen2;

import POO.ControlLibrería.Excepciones.FicheroVacioException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filosofos {
    private String nombre;
    private String teorias;
    public Filosofos(String nombre, String teorias){
        this.nombre = nombre;
        this.teorias = teorias;
    }
    public static Filosofos[] cargarDesdeFichero(String ruta) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(ruta));
        // Si el fichero está vacío -> excepción
        if (!sc.hasNextLine()) {
            sc.close();
            throw new FicheroVacioException("El fichero está vacío");
        }
        // Inicializamos un vector con una dimensión.
        Filosofos[] lista = new Filosofos[8];
        int cantidad = 0;
        while (sc.hasNextLine()) {
            String nombre = sc.nextLine().trim();
            // Tiene que haber nombre + teoría.
            if (!sc.hasNextLine()) {
                sc.close();
                throw new FicheroVacioException("Falta teoría para " + nombre);
            }
            String teoria = sc.nextLine().trim();
            // Si el vector se llena, cambiamos la dimensión al doble.
            if (cantidad == lista.length) {
                Filosofos[] nuevo = new Filosofos[lista.length * 2];
                for (int i = 0; i < cantidad; i++) nuevo[i] = lista[i];
                lista = nuevo;
            }
            lista[cantidad] = new Filosofos(nombre, teoria);
            cantidad++;
        }
        sc.close();
        // Ajustamos el tamaño final
        Filosofos[] resultado = new Filosofos[cantidad];
        for (int i = 0; i < cantidad; i++) {
            resultado[i] = lista[i];
        }
        return resultado;
    }
    @Override
    public String toString() {
        return nombre + ": " + teorias;
    }
    public static void main(String[] args) {
        try {
            String ruta = "src/PruebaExamen2/datos/filosofos.txt";
            // Suponemos nuestra ruta al fichero
            Filosofos[] lista = cargarDesdeFichero(ruta);
            System.out.println("FILÓSOFOS CARGADOS:\n");
            for (int i = 0; i < lista.length; i++) {
                System.out.println((i + 1) + ". " + lista[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encontró el fichero.");
        } catch (FicheroVacioException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        // Finalmente, mediante el uso de un try/catch, comprobamos todas los posibles problemas con el fichero.
    }
}
