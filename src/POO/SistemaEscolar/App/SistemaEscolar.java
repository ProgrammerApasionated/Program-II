package POO.SistemaEscolar.App;

import POO.SistemaEscolar.Modelos.Estudiantes;
import POO.SistemaEscolar.Modelos.Asignaturas;

public class SistemaEscolar {

    private Estudiantes[] estudiantes;
    private Asignaturas[] asignaturas;

    public SistemaEscolar() {
        estudiantes = new Estudiantes[0];
        asignaturas = new Asignaturas[0];
    }
    // Métodos para Estudiantes.
    public void insertarEstudiante(Estudiantes e) {
        Estudiantes[] nuevo = new Estudiantes[estudiantes.length + 1];
        for (int i = 0; i < estudiantes.length; i++) {
            nuevo[i] = estudiantes[i];
        }
        nuevo[estudiantes.length] = e;
        estudiantes = nuevo;
    }
    public Estudiantes buscarEstudiante(String nombre) {
        for (Estudiantes e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
    public String listarEstudiantes() {
        if (estudiantes.length == 0) {
            return "No hay estudiantes registrados.";
        }
        String salida = "";
        for (Estudiantes e : estudiantes) {
            salida += e.getNombre() + " | Curso: " + e.getCurso() +
                    " | Notas: " + e.mostrarNotas() + "\n";
        }
        return salida;
    }
    // Métodos de Asignaturas.
    public void insertarAsignatura(Asignaturas a) {
        Asignaturas[] nuevo = new Asignaturas[asignaturas.length + 1];
        for (int i = 0; i < asignaturas.length; i++) {
            nuevo[i] = asignaturas[i];
        }
        nuevo[asignaturas.length] = a;
        asignaturas = nuevo;
    }
    public String listarAsignaturas() {
        if (asignaturas.length == 0) {
            return "No hay asignaturas registradas.";
        }
        String salida = "";
        for (Asignaturas a : asignaturas) {
            salida += a.toString() + "\n";
        }
        return salida;
    }
}
