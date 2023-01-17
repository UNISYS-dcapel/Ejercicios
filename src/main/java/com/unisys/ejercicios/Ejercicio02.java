package com.unisys.ejercicios;

public class Ejercicio02 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static void main(String[] args) {
        /*
        Crea un bucle de tipo While que de 10 vueltas e imprima el número de vuelta por pantalla.
         */
        System.out.println(ANSI_WHITE_BACKGROUND);
        int i=0;
        while (i<10){
            System.out.println("Ahora toca el "+i);
            i++;
        }
        /*
        Crea un bucle de tipo do-while que de 10 vueltas e imprima el número de vuelta por pantalla.
         */
        int b=0;
        do {
            System.out.println(b);
            b++;
        }while (b<10);
        /*
        Crea un bucle de tipo for que de 10 vueltas e imprima el número de vuelta por pantalla
         */
        int a=0;
        for (a=0;a<10;a++){
            System.out.println("ahora con for:"+a+ANSI_GREEN);
        }
        /*
        Crea una sentencia condicional para que dependiendo de si el valor de la edad (int) de una persona, imprima por pantalla si puede o no conducir un coche
         */
        int edad=17;
        if (edad>=18){
            System.out.println("Puedes conducir"+ANSI_GREEN);
        }else{
            System.out.println("No puedes conducir"+ANSI_RED);
        }
        /*
        Crea una sentencia condicional múltiple, para que dependiendo de la edad de una persona, si tiene 18, puede conducir, su tiene 21 podria beber en USA y si es cualquier otro valor, simplemente imprima la edad por pantalla.
         */
        if (edad==18){
            System.out.println("Puede conducir");
        } else if (edad==21) {
            System.out.println("Puedes beber en USA");
        } else {
            System.out.println("La edad es: "+edad);
        }
        /*
        Crea un bucle de tipo While que de 10 vueltas e imprima el número de vuelta por pantalla. Dentro del bucle, su el valor que utilizas de contador de vueltas es 5, haz que se salga con un break, si es 2 que haga un continue.
         */
        int c=1;
        while (c<=10){
            System.out.println("Valor While: " + c);
            if (c==5){
                break;
            }
            if(c==2){
                c++;
                continue;
            }
            c++;
        }
        String dancingGirl = "💃";
        System.out.println(dancingGirl);
    }
}
