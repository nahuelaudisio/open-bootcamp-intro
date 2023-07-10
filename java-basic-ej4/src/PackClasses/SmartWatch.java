package PackClasses;

public class SmartWatch extends SmartDevice {
    public boolean funcionesDeSalud;
    public String marca;
    public int precio;
    public boolean camara;

    public SmartWatch(){

    }

    public SmartWatch(String made, int numeroSerie, boolean funcionesDeSalud, String marca, int precio, boolean camara) {
        super(made, numeroSerie);
        this.funcionesDeSalud = funcionesDeSalud;
        this.marca = marca;
        this.precio = precio;
        this.camara = camara;
    }

    public boolean isFuncionesDeSalud() {
        return funcionesDeSalud;
    }

    public void setFuncionesDeSalud(boolean funcionesDeSalud) {
        this.funcionesDeSalud = funcionesDeSalud;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "funcionesDeSalud=" + funcionesDeSalud +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", camara=" + camara +
                ", made='" + made + '\'' +
                ", numeroSerie=" + numeroSerie +
                '}';
    }
}
