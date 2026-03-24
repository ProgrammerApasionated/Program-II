package POO.ClinicaVeterinaria;

public class ClinicaVeterinaria {
    private Mascota[] mascotas;
    public ClinicaVeterinaria() {
        this.mascotas = new Mascota[0];
    }
    public void registrarMascota(Mascota m) {
        Mascota[] nuevo = new Mascota[mascotas.length + 1];
        for (int i = 0; i < mascotas.length; i++) {
            nuevo[i] = mascotas[i];
        }
        nuevo[mascotas.length] = m;
        mascotas = nuevo;
    }
    public Mascota buscarPorNombre(String nombre) {
        for (Mascota m : mascotas) {
            if (m.getNombre().equals(nombre)) {
                return m;
            }
        }
        return null;
    }
    public Mascota[] listarVacunados() {
        Mascota[] temp = new Mascota[mascotas.length];
        int count = 0;
        for (Mascota m : mascotas) {
            if (m.isVacunado()) {
                temp[count++] = m;
            }
        }
        Mascota[] resultado = new Mascota[count];
        for (int i = 0; i < count; i++) {
            resultado[i] = temp[i];
        }
        return resultado;
    }
    public boolean eliminarPorNombre(String nombre) {
        int pos = -1;
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i].getNombre().equals(nombre)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) return false;
        Mascota[] nuevo = new Mascota[mascotas.length - 1];
        int j = 0;
        for (int i = 0; i < mascotas.length; i++) {
            if (i != pos) {
                nuevo[j++] = mascotas[i];
            }
        }
        mascotas = nuevo;
        return true;
    }
    @Override
    public String toString() {
        String s = "Clínica Veterinaria:\n";
        for (Mascota m : mascotas) {
            s += " - " + m + "\n";
        }
        return s;
    }
}
