public class Main {
    //Crear clase Persona.
    //
    //Crear variables las privadas edad, nombre y telefono de la clase Persona.
    //
    //Crear gets y sets de cada propiedad.
    //
    //Crear un objeto persona en el main.
    //
    //Utiliza los gets y sets para darle valores a las propiedades edad, nombre
    // y telefono, por último muéstralas por consola.
    public static void main(String[] args) {
        System.out.println("Hello world!");

Persona persona = new Persona();

persona.setNombre("Nahuel");
persona.setEdad(27);
persona.setTelefono(456468131);

        System.out.println("nombre:  " + persona.getNombre() +
                " - Edad : "+ persona.getEdad() + " - TELEFONO: " + persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    //METODO CONSTRUCTOR
    public Persona(){

    }
// METODO CONSTRUCTOR CON PARAMETROS
    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}