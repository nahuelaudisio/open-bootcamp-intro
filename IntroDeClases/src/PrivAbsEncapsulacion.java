public class PrivAbsEncapsulacion {

    public static void main(String[] args) {


    }
}


class Vehiculo{

    private String tipo;
    private  int velocidadMaxima;


    public Vehiculo(String tipo, int velocidadMaxima) {
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}