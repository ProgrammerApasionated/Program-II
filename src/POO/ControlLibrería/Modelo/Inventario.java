package POO.ControlLibrería.Modelo;

public class Inventario {
    private Libro[] libros;
    public Inventario() {
        libros = new Libro[0];
    }
    public void insertar(Libro l) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].equals(l)) {
                return;
            }
        }
        Libro[] nuevo = new Libro[libros.length + 1];
        for (int i = 0; i < libros.length; i++) {
            nuevo[i] = libros[i];
        }
        nuevo[libros.length] = l;
        libros = nuevo;
    }
    public Libro buscarPorTitulo(String titulo) {
        for (int i = 0; i < libros.length; i++){
            if(libros[i].getTitulo().equals(titulo)){
                return libros[i];
            }
        }
        return null;
    }
    public boolean eliminarPorTitulo(String titulo) {
        int pos = -1;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                pos = i;
                break;
            }
        }
        // No encontrado.
        if (pos == -1) {
            return false;
        }
        Libro[] nuevo = new Libro[libros.length - 1];
        int j = 0;
        // Recorremos y inicializamos un vector sin esa posición.
        for (int i = 0; i < libros.length; i++) {
            if (i != pos) {
                nuevo[j] = libros[i];
                j++;
            }
        }
        libros = nuevo;
        return true;
    }
    public int longitud() {
        return libros.length;
    }

    public Libro[] listar() {
        Libro[] copia = new Libro[libros.length];
        for (int i = 0; i < libros.length; i++) {
            copia[i] = libros[i];
        }
        return copia;
    }
    @Override
    public String toString() {
        String s = "Inventario: \n";
        for (int i = 0; i < libros.length; i++) {
            s += " - " + libros[i].toString() + "\n";
        }
        return s;
    }

}
