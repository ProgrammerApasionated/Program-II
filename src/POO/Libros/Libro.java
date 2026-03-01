package POO.Libros;

public class Libro {
    private String nombre;
    private String autor;
    private String sitio;
    private boolean prestado;

    public Libro(String nombre, String autor, String sitio, boolean prestado) {
        this.nombre = nombre;
        this.autor = autor;
        this.sitio = sitio;
        this.prestado = prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getSitio() {
        return sitio;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public void cambiarPrestado() {
        this.prestado = !prestado;
    }

    public void imprimir() {
        System.out.println("=== Información del libro ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("Ubicación: " + sitio);
        System.out.println("Prestado: " + prestado);
    }
}