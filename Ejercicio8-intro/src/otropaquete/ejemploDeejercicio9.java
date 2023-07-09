package otropaquete;

public class ejemploDeejercicio9 {
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

class Cliente extends Persona {
    //tiene otro atributo
    int credito;


    public Cliente(){

    }
}
}
