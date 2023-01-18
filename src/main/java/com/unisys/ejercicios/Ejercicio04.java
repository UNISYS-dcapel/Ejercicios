package com.unisys.ejercicios;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Declara una cadena llamada saludo con el valor "Hola"
         */
        String saludo = new String("Hola");
        /*
        Saca por pantalla el número de caracteres de la cadena
        */
        System.out.println("El valor de la cadena es: "+saludo.length());
        /*
        Saca por pantalla el 4º caracter de la cadena
         */
        System.out.println(saludo.charAt(3));
        /*
        Saca por pantalla la cadena en mayúsculas
         */
        System.out.println(saludo.toUpperCase());
        /*
        Saca por pantalla la cadena en minúsculas
         */
        System.out.println(saludo.toLowerCase());
        /*
        Saca por pantalla la posición del carácter 'l'
         */
        System.out.println("La posicion de l es : "+saludo.indexOf("l"));
        /*
        Declara otra cadena llamada saludo2 y compárala con la cadena saludo, saca un mensaje por pantalla indicando si son o no iguales
         */
        String saludo2 = new String("Hola2");
        if (saludo.equals(saludo2)){
            System.out.println(Ejercicio02.ANSI_GREEN);
            System.out.println("Los textos son iguales");
        }else{
            System.out.println(Ejercicio02.ANSI_RED);
            System.out.println("Los textos son diferentes");
        }
    }
}
