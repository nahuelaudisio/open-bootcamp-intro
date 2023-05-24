package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int contador = 11;

        while (contador > 0){
            contador -= 1;
            System.out.println("contador vale : "+ contador);

        }
        System.out.println("FIN");

        //ahora EL DO WHILE

        int contador2 = 5;
        do {
            System.out.println("el valor de contador2 es : " + contador2);
            contador2 -=1;
        }while (contador2 > 1);

        System.out.println("sali del do WHILE - FIN ");
// ahora con un FOR
int valores[] =  {10,20,30,40,50};

for (int i=0 ; i < valores.length; i++){
    System.out.println(valores[i]);

}



    }
}