package POO.GestorHabitos;

public class MainHabitos {
    public static void main(String[] args) {
        // Crear el gestor
        GestorHabitos gestor = new GestorHabitos();
        // Crear algunos hábitos
        Habitos h1 = new Habitos("Leer", "20:00");
        Habitos h2 = new Habitos("Ejercicio", "18:00");
        Habitos h3 = new Habitos("Meditación", "22:00");
        Habitos h4 = new Habitos("Leer", "20:00"); // Duplicado de h1
        System.out.println("=== Añadiendo hábitos ===");
        gestor.añadirHabito(h1);
        gestor.añadirHabito(h2);
        gestor.añadirHabito(h3);
        // Intentar añadir un duplicado
        try {
            gestor.añadirHabito(h4);
        } catch (HabitoInvalidoException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        // Mostrar hábitos actuales
        System.out.println("\n=== Lista actual de hábitos ===");
        mostrarLista(gestor);
        // Quitar un hábito
        System.out.println("\n=== Quitando el hábito en posición 1 ===");
        gestor.quitar(1);
        // Mostrar hábitos después de quitar
        System.out.println("\n=== Lista después de quitar ===");
        mostrarLista(gestor);
    }
    // Método auxiliar para imprimir el contenido del gestor
    private static void mostrarLista(GestorHabitos gestor) {
        try {
            java.lang.reflect.Field f = GestorHabitos.class.getDeclaredField("lista_habitos");
            java.lang.reflect.Field c = GestorHabitos.class.getDeclaredField("cant_habitos");
            f.setAccessible(true);
            c.setAccessible(true);
            Habitos[] lista = (Habitos[]) f.get(gestor);
            int cant = (int) c.get(gestor);
            for (int i = 0; i < cant; i++) {
                System.out.println(i + ": " + lista[i]);
            }
        } catch (Exception e) {
            System.out.println("Error mostrando lista: " + e);
        }
    }
}
