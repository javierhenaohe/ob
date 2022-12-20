public class Ejercicio8 {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(20);
        System.out.println("La edad es: " + persona.getEdad() + " años");

        persona.setNombre("Javier");
        System.out.println("El nombre es: " + persona.getNombre());

        persona.setTelefono(5551213);
        System.out.println("El telefono es: " + persona.getTelefono());
    }
}

class Persona{
    
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono (int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}