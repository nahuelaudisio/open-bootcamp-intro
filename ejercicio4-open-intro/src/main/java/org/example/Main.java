package org.example;

public class Main {
    public static void main(String[] args) {

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 int numero = -1;

 if (numero >= 0){
     System.out.println("el numero " + numero + " es psitivo");
 } else {
     System.out.println("el numero " + numero + " es negativo");
 }
        System.out.println("FIN");
        System.out.println();
        System.out.println("Aca comienza otro ejercicio ");
        //Crea un bucle While, este bucle tendrá que tener como condición que la variable
        // numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //
        //Mostrarlo por pantalla cada vez que se ejecute.

        var numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        System.out.println("fin");

        System.out.println("comienza otro ejercicio");




    }



}