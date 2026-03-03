package POO.ControlLibrería.App;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import POO.ControlLibrería.Modelo.Inventario;
import POO.ControlLibrería.Modelo.Libro;
import POO.ControlLibrería.Excepciones.FicheroVacioException;

public class GestorInventario {
    public static Inventario cargarDesdeFichero(String ruta) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(ruta));
        if (!sc.hasNextLine()) {
            sc.close();
            throw new FicheroVacioException("El fichero no contiene libros");
        }
        Inventario inv = new Inventario();
        while (sc.hasNextLine()) {
            String titulo = sc.nextLine().trim();
            if (!titulo.isEmpty()) {
                Libro l = new Libro(titulo, "Desconocido");
                inv.insertar(l);
            }
        }
        sc.close();
        return inv;
    }
}
