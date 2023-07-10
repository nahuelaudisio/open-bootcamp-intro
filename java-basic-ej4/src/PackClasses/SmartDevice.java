package PackClasses;

public class SmartDevice {
    //ATRIBUTOS
    public String made;
    public int numeroSerie;

    //constructor vacio
    public SmartDevice(){

    }

    public SmartDevice(String made, int numeroSerie) {
        this.made = made;
        this.numeroSerie = numeroSerie;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "made='" + made + '\'' +
                ", numeroSerie=" + numeroSerie +
                '}';
    }
}
