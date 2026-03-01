package POO.ClinicaVeterinaria;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private boolean vacunado;
    private static int mascotasCreadas = 0;

    public Mascota(String nombre, String especie, int edad, boolean vacunado) {
        this.nombre = nombre;
        this.especie = especie;
        setEdad(edad);
        this.vacunado = vacunado;
        mascotasCreadas++;
    }
    public Mascota(String nombre, String especie) {
        this(nombre, especie, 0, false);
    }
    public Mascota() {
        this("Sin nombre", "Desconocido", 0, false);
    }
    public void setEdad(int edad) {
        if (edad < 0){
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void vacunar() {
        this.vacunado = true;
    }
    public String getNombre(){
        return this.nombre;
    }
    public boolean isVacunado(){
        return this.vacunado;
    }
    @Override
    public String toString() {
        return "Mascota: " + nombre + " (" + especie + "), edad: " + edad + ", vacunado: " + vacunado;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mascota)) return false;
        Mascota otra = (Mascota) o;
        return this.nombre.equals(otra.nombre) &&
                this.especie.equals(otra.especie);
    }
    public static int getTotalMascotas() {
        return mascotasCreadas;
    }
}
