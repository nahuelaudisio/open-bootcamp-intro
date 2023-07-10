package Main;

import PackClasses.SmartDevice;
import PackClasses.SmartPhone;
import PackClasses.SmartWatch;

public class Main {
    /*
    En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

    Agregaréis atributos tal cual tendrían esos objetos en la realidad.

    Crear constructor vacío y con todos los parámetros para cada clase.

    Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("creo a dispositivo PADRE");
        SmartDevice device = new SmartDevice("china",1215650);
        System.out.println("muestro el dispotivo padre creado: " + device.toString());


        System.out.println("creo un SmartPhone");
        SmartPhone phone = new SmartPhone("china",124654,59412315,true,"IOS",
                "Motorola",true,21351651);

        System.out.println("Muestro telefono: " + phone.toString());

        System.out.println("creo un SmartWatch");
        SmartWatch watch = new SmartWatch("argentina",1531651,true,"Samsung",4654564,true);

        System.out.println("muestro reloj: " + watch.toString());




    }
}