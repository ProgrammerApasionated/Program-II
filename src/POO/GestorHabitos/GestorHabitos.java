package POO.GestorHabitos;

public class GestorHabitos {
    private int cant_habitos = 0;
    private Habitos[] lista_habitos;
    public GestorHabitos(){
        lista_habitos = new Habitos[8];
    }
    public void añadirHabito(Habitos h){
        if (lista_habitos.length == cant_habitos) {
            Habitos[] lista_2 = new Habitos[cant_habitos * 2];

            for (int i = 0; i < cant_habitos; i++) {
                lista_2[i] = lista_habitos[i];
            }
            lista_habitos = lista_2;
        }
        for (int i = 0; i < cant_habitos; i++){
            if (lista_habitos[i].equals(h)){
                throw new HabitoInvalidoException("Duplicado : " + lista_habitos[i]);
            }
        }
        lista_habitos [cant_habitos] = h;
        cant_habitos++;
    }
    public void quitar (int posicion){
        if (posicion < 0 || posicion >= cant_habitos){
            return;
        }
        for (int i = posicion; i < cant_habitos; i++){
            lista_habitos[i] = lista_habitos[i+1];
        }
        lista_habitos[cant_habitos - 1] = null;
        cant_habitos--;
    }
}
