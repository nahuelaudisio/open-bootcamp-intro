package org.example;

public class EjercicioConSwitch {
    public static void main(String[] args) {
// Por último, para el Switch, deberás crear la variable estacion,
// y distintos case para las cuatro estaciones del año. Dependiendo del valor de la
// variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
// También habrá que poner un default para cuando el valor de la variable no sea una estación.

        String estacion = "verano";

        switch (estacion){
            case "verano":
                System.out.println("es VERANO");
                break;
            case "invierno":
                System.out.println("es INVIERNO");
                break;
            case "otoño":
                System.out.println("es OTOÑO");
            case "primavera":
                System.out.println("es PRIMAVERA");
                break;
            default:
                System.out.println("No se ingreso la estacion CORRECTA");
        }

        System.out.println("fin del ejercicio");

    }
}
