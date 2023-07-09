//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
// esta nueva clase tendrá la variable credito solo para esa clase.
//
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
// el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
// y con una variable salario que solo tenga la clase Trabajador.


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! estoy haciendo el ejercicio 9 de open booutCAMP");
    Cliente cliente = new Cliente();

    cliente.nombre = "Sebastian";
    cliente.edad= 27;
    cliente.telefono= 123464168;
    cliente.credito=15464;

        System.out.println("el cliente que ingrese es: NOMBRE "+
        cliente.nombre + ", EDAD: " + cliente.edad + ", TEFEFONO:  " + cliente.telefono +
                " CREDITO : " + cliente.credito);
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;

    public Persona(){

    }

}

class Cliente extends Persona{
    //tiene otro atributo
    int credito;


public Cliente(){

}
}