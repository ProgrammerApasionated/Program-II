package PruebaExamen2;
// Ejercicio consistente en un ejemplo normal de la carpeta POO.
// Consistente en simular una clase de Fecha con distintos métodos.
//
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    public Fecha(Fecha otra){
        this.dia = otra.dia;
        this.mes = otra.mes;
        this.año = otra.año;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAño(){
        return this.año;
    }
    // Definimos los getters y la clase fecha.
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (!(o instanceof Fecha)){
            return false;
        }
        Fecha otra = (Fecha) o;
        return this.dia == otra.dia && this.mes == otra.mes && this.año == otra.año;
    }
    // Reescribimos el método equals para nuestra clase, comparando la referencia a memoria, luego si es una instáncia de nuestra clase y finalmente si es un objeto igual a algún otro de la clase.
    public int compareTo(Fecha otra) {
        if (this.año != otra.año) {
            return this.año - otra.año;
        }
        if (this.mes != otra.mes) {
            return this.mes - otra.mes;
        }
        return this.dia - otra.dia;
    }
    // Comparamos las fechas restándolas.
    public Fecha diaSiguiente() {
        int d = dia + 1;
        int m = mes;
        int a = año;
        int diasMes;
        switch (mes) {
            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;
            case 2:
                diasMes = 28;
                break;
            default:
                diasMes = 31;
        }
        if (d > diasMes) {
            d = 1;
            m++;
            if (m > 12) {
                m = 1;
                a++;
            }
        }
        return new Fecha(d, m, a);
    }
    // Creamos una nueva fecha que sea un día mayor, comprobando que no sea el día 28,30 o 31.
}
