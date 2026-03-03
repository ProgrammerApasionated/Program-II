package POO.ControlLibrería.Excepciones;

public class FicheroVacioException extends RuntimeException {
    public FicheroVacioException(String mensaje) {
        super(mensaje);
    }
    public FicheroVacioException() {
        super("El fichero está vacío");
    }
}
