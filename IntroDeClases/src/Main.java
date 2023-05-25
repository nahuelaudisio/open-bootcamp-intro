public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Coche coche = new Coche();
        System.out.println(coche.velocidadActual);


        coche.acelerar();
        System.out.println(coche.velocidadActual);
        coche.decelerar();

        Coche coche1 = new Coche(5,53);
        System.out.println(coche1.numeroDePuertas);
        System.out.println(coche1.velocidadMaxima);

    }
}


class Coche {
     int numeroDePuertas;
     int velocidadMaxima;
     float velocidadActual;

public Coche(){

    numeroDePuertas = 4;
    velocidadActual = 120;
    velocidadActual = 111;
    System.out.println("estoy en el constructor ** SIN PARAMETROS**");
}

public Coche(int numeroDePuertas, int velocidadMaxima){
    this.numeroDePuertas = numeroDePuertas;
    this.velocidadMaxima = velocidadMaxima;
    System.out.println("Estoy en el constructor con PARAMETROS");
}
     public void acelerar(){
         velocidadActual += 15;
     }
    public void decelerar(){}

    //SOBRECARGA DE METODOS

    public int suma(int a, int b){return a + b;}
    public float suma(float a,float b){ return a + b;}
}