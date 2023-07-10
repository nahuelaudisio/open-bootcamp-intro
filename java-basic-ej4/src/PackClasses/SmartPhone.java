package PackClasses;

public class SmartPhone extends SmartDevice {

    public int phoneNumber;
    public boolean chip;
    public String sistemaOperativo;
    public String marca;
    public boolean camara;
    public int precio;

    public SmartPhone() {
    }

    public SmartPhone(String made, int numeroSerie, int phoneNumber, boolean chip, String sistemaOperativo, String marca, boolean camara, int precio) {
        super(made, numeroSerie);
        this.phoneNumber = phoneNumber;
        this.chip = chip;
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.camara = camara;
        this.precio = precio;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "phoneNumber=" + phoneNumber +
                ", chip=" + chip +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", marca='" + marca + '\'' +
                ", camara=" + camara +
                ", precio=" + precio +
                ", made='" + made + '\'' +
                ", numeroSerie=" + numeroSerie +
                '}';
    }
}
