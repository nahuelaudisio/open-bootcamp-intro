public class EjemplosHerencia {

    public static void main(String[] args) {

}

class Vehiculo{

    int velocidadMaxima;
    String matricula;

    String  sonido;

    public Vehiculo(){
        System.out.println("estoy en el constructor de vehiculo");
    }


    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

//esta clase hereda de VEHICULO

class Coche extends Vehiculo {

}

