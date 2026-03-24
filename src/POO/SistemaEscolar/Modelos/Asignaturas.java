package POO.SistemaEscolar.Modelos;

import POO.ControlLibrería.Modelo.Libro;

import java.util.Objects;

public class Asignaturas {
    private String asignatura;
    private String horario;
    private String profesor;
    private static int cant_profe = 0;

    public Asignaturas(String asignatura, String horario, String profesor){
        this.asignatura = asignatura;
        this.horario = horario;
        this.profesor = profesor;
        cant_profe++;
    }
    // Getters
    public String getAsignatura(){
        return this.asignatura;
    }
    public String getHorario(){
        return this.horario;
    }
    public String getProfesor(){
        return this.profesor;
    }
    @Override
    public String toString(){
        return "La asignatura -> " + this.asignatura + " tiene como horario -> " + this.horario + " y como profesor a -> " + this.profesor;
    }
    public int getCant_profe(){
        return cant_profe;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (!(o instanceof Asignaturas)){
            return false;
        }
        Asignaturas otro = (Asignaturas) o;
        return this.asignatura.equals(otro.asignatura) && this.horario.equals(otro.horario) && this.profesor.equals(otro.profesor);
    }
}
