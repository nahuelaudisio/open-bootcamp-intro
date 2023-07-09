public class Main {
    public static void main(String[] args) {

/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String.
 */

        // Array de textos a concatenar
        String[] textos = {"Hola ", "Soy ", "Nahuel", ", ", "Mucho Gusto! "};

        // Variable para almacenar el resultado final
        String resultado = "";

        // Bucle para concatenar los textos
        for (String texto : textos) {
            resultado += texto;
        }

        // Imprimir el resultado final por consola
        System.out.println(resultado);
    }
    }
