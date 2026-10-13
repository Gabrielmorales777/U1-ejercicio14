public class Temporizador {
    private int minutos;
    private int segundos;


    public Temporizador(int minutos, int segundos){
        if(minutos < 0 || segundos < 0 || segundos >= 60){
            throw new IllegalArgumentException("El tiempo ingresado no es valido");
        }
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public void avanzarSegundos(int cantidad){
        if(cantidad < 0){
            throw new IllegalArgumentException("La cantidad de segundos no puede ser negativa");

        }
        int totalSegundos = minutos * 60 + segundos + cantidad;
        minutos = totalSegundos / 60;
        segundos = totalSegundos % 60;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
}
