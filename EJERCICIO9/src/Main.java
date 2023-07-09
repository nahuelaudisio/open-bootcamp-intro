public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");

        Cliente cliente = new Cliente();
        cliente.nombre = "Sebastian";
cliente.edad = 27;
cliente.telefono = 465483;
cliente.credito = 46465;

        System.out.println("Persona");
        System.out.println("Nombre: " + cliente.nombre +
                " Edad: " + cliente.edad +
                " Telefono: " + cliente.telefono +
                " Credito: " + cliente.credito);



        System.out.println("trabajador");
        Trabajador trabajador = new Trabajador();

        trabajador.nombre = "leo";
        trabajador.edad= 23;
        trabajador.telefono= 541654;
        trabajador.salario= 446444;

        System.out.println("el trabajador que ingrese es: NOMBRE "+
                trabajador.nombre + ", EDAD: " + trabajador.edad + ", TEFEFONO:  " + trabajador.telefono +
                " SALARIO : " + trabajador.salario);
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



class Trabajador extends Persona{
    int salario;

    public Trabajador(){

    }
}