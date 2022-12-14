public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AdicionarPuerta();
        miCoche.AdicionarPuerta();
        System.out.println(miCoche.puerta);
    } 
}

class Coche {
    
    public int puerta;

    public void AdicionarPuerta(){
        this.puerta++;
    }
}