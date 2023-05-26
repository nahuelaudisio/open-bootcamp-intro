public class EjemploAbstraccion {
    public static void main(String[] args) {

    }
}

 abstract class Vehiculo{

    int velocidadMaxima;
    String matricula;
    String  sonido;

    public Vehiculo(){
        System.out.println("estoy en el constructor de vehiculo");
    }

   abstract public String getSonido() ;
    abstract public void setSonido(String sonido);
}

//esta clase hereda de VEHICULO

class Coche extends Vehiculo {

    public String getSonido() {
        return this.sonido;
    }
    public void setSonido(String sonido){
     this.sonido = sonido;
    }

}
