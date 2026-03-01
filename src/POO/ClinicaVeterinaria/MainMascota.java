package POO.ClinicaVeterinaria;

public class MainMascota {
    public static void main(String[] args) {

        // Crear la clínica
        ClinicaVeterinaria clinica = new ClinicaVeterinaria();

        // Registrar mascotas usando distintos constructores
        Mascota m1 = new Mascota("Luna", "Perro", 3, true);
        Mascota m2 = new Mascota("Michi", "Gato"); // edad=0, vacunado=false
        Mascota m3 = new Mascota(); // valores por defecto

        clinica.registrarMascota(m1);
        clinica.registrarMascota(m2);
        clinica.registrarMascota(m3);

        // Mostrar todas las mascotas
        System.out.println("=== Clínica completa ===");
        System.out.println(clinica);

        // Buscar por nombre
        System.out.println("=== Buscar mascota 'Michi' ===");
        Mascota buscada = clinica.buscarPorNombre("Michi");
        System.out.println(buscada != null ? buscada : "No encontrada");

        // Listar vacunados
        System.out.println("=== Mascotas vacunadas ===");
        Mascota[] vacunados = clinica.listarVacunados();
        for (Mascota m : vacunados) {
            System.out.println(" - " + m);
        }

        // Eliminar una mascota
        System.out.println("=== Eliminando 'Luna' ===");
        boolean eliminada = clinica.eliminarPorNombre("Luna");
        System.out.println("¿Eliminada? " + eliminada);

        // Mostrar clínica después de eliminar
        System.out.println("=== Clínica después de eliminar ===");
        System.out.println(clinica);

        // Mostrar total de mascotas creadas
        System.out.println("Total de mascotas creadas: " + Mascota.getTotalMascotas());

        // Probar excepción
        System.out.println("=== Probando excepción ===");
        try {
            m2.setEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}
