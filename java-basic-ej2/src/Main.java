import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*
     Enunciado del ejercicio:

Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.


      */


        System.out.println("ingrese valor para agregar el IVA:");
        Scanner scanner = new Scanner(System.in);
        int precio = scanner.nextInt();

        System.out.println("el valor ingresado es: $ " + precio);

        agregarIva(precio);

        System.out.println("FIN DEL PROGRAMA");
    }

    public static void agregarIva(int precio){

        float iva = 1.21f;

        Float valorIva = iva * precio;


        System.out.println("el valor con IVA es: $ " + valorIva);

    }
}