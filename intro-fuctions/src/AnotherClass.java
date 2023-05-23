public class AnotherClass {
    public static void main(String[] args) {
Potato papa1 = new Potato();


papa1.quitarPapas();

        System.out.println(papa1.patata);



}


    }

class Potato{
    public int patata = 0;


    public void quitarPapas(){

        this.patata--;

    }
}