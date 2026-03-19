package POO.SistemaEscolar.Modelos;

public class Estudiantes {
    private String nombre;
    private int[] notas;
    private String curso;

    public Estudiantes(String nombre, int [] notas, String curso){
        this.nombre = nombre;
        this.notas = notas;
        this.curso = curso;
    }
    // Getters
    public String getNombre(){
        return this.nombre;
    }

    public String getCurso(){
        return this.curso;
    }

    public int cantNotas(){
        return this.notas.length;
    }

    public String mostrarNotas(){
        String notas = "";
        if (cantNotas() == 0){
            return notas;
            // Si no hay notas el String devuelve la referencia a null.
        }
        for (int i = 0; i < this.notas.length; i++){
            notas += this.notas[i] + " ";
        }
        return notas;
        // Devuelve las notas con un espacio entre notas.
    }

    public int notaMedia(){
        int suma_notas = 0;
        if (cantNotas() == 0){
            return 0;
            // No hay notas devuelve un 0.
        }
        for (int i = 0; i < this.notas.length; i++){
            suma_notas += this.notas[i];
        }
        return suma_notas / this.notas.length;
    }
}
