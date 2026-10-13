public class Main{
    public static void main(String [] args){
        Temporizador reloj = new Temporizador(2, 50);
         reloj.avanzarSegundos(25);
         System.out.println("Tiempo final: " + reloj.getMinutos() + " minutos y " + reloj.getSegundos() + " segundos");
    }
}
