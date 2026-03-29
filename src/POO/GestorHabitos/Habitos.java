package POO.GestorHabitos;

public class Habitos {
    private String nombre;
    private String horario;
    public Habitos(String nombre, String horario){
        this.nombre = nombre;
        this.horario = horario;
    }
    public String toString(){
        return "[" + this.nombre + "] " + "-> " + this.horario;
    }
    // Getters.
    public String getNombre(){
        return this.nombre;
    }
    public String getHorario(){
        return this.horario;
    }
    public boolean equals(Object o){
        if (this == o) {return true;}
        if (!(o instanceof Habitos)) {return false;}
        Habitos h = (Habitos) o;
        return this.nombre.equals(h.nombre) && this.horario.equals(h.horario);
    }
}
