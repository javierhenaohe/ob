public class Ejercicio9 {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Javier";
        cliente.edad = 38;
        cliente.telefono = 5551213;
        cliente.credito = 100000.99;
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad + " años");
        System.out.println( "# telefono: " + cliente.telefono);
        System.out.println ("Credito: " + cliente.credito + " pesos");

        trabajador.nombre = "Daniel";
        trabajador.edad = 19;
        trabajador.telefono = 5551213;
        trabajador.salario = 200000.99;
        System.out.println("Trabajador: " + trabajador.nombre);
        System.out.println ("Edad: " + trabajador.edad + " años");
        System.out.println ("# telefono: " + trabajador.telefono);
        System.out.println ("Salario: " + trabajador.salario + " pesos");
    }
}

class Persona2{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona2{
    double credito;
}

class Trabajador extends Persona2 {
    double salario;
}

