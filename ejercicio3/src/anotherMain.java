public class anotherMain {
    //Segunda parte:
    //
    //Crear una clase coche.
    //
    //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    //
    //Una función que incremente el número de puertas que tiene el coche.
    //
    //Crear un objeto miCoche en el main y añadirle una puerta.
    //
    //Mostrar el número de puertas que tiene el objeto.

    public static void main(String[] args) {
Coche coche1 = new Coche();

coche1.sumarPuertas();
coche1.sumarPuertas();
coche1.sumarPuertas();
        coche1.sumarPuertas();

        System.out.println(coche1.numPuertas);

    }
}

class Coche{
    public int numPuertas = 0;


    public void sumarPuertas(){

        this.numPuertas++;
    }

}