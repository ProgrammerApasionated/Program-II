package POO.GestorHabitos;

public class HabitoInvalidoException extends RuntimeException {
    public HabitoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
