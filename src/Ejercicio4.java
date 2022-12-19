public class Ejercicio4 {
    public static void main(String[] args) {
        
        int numeroIf = 0;

        if (numeroIf<0){
            System.out.println("numeroIf es negativo: " + numeroIf);
        }
        else if(numeroIf>0){
            System.out.println("numeroIf es negativo: " + numeroIf );
        } else {
            System.out.println("numeroIf es 0");
        }

        int numeroWhile = 1;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("numeroWhile es: " + numeroWhile);
        }

        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println("numeroDoWhile es: " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        for(int numeroFor = 0; numeroFor <= 5; numeroFor++){
            System.out.println("numeroFor es: " + numeroFor);
        }

        String estacion = "verano";
        switch(estacion) {
            case "verano":
                System.out.println("es " + estacion);
                break;
            case "invierno":
                System.out.println("es " + estacion);
                break;
            case "primavera":
                System.out.println("es " + estacion);
                break;
            case "otoño":
                System.out.println("es " + estacion);
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}