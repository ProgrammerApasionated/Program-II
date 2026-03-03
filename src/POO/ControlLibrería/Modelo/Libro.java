package POO.ControlLibrería.Modelo;

public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor, boolean estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = estado;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = false;
    }

    public Libro() {
        this("Sin título", "Desconocido", false);
    }

    // Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }
    public boolean getDisponible(){
        return this.disponible;
    }
    public boolean cambiarEstado(){
        this.disponible = !this.disponible;
        return this.disponible;
    }
    @Override
    public String toString() {
        return "Titulo -> " + titulo + " con autor -> " + autor + " y con estado -> " + disponible;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Libro)){
            return false;
        }
        Libro otro = (Libro) o;
        return this.titulo.equals(otro.titulo) &&
                this.autor.equals(otro.autor);
    }
}
