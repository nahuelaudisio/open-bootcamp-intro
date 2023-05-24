package org.example;

public class EjemploDeSwicht {
    public static void main(String[] args) {
        var estacion = "sape";

        switch (estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;

            case "otoño":
                System.out.println("es otoño");
                break;

            default:
                System.out.println("no salio nada");
                break;
        }

        System.out.println("FIN");
    }
}
