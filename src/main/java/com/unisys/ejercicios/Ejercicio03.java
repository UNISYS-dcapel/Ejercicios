package com.unisys.ejercicios;

import java.util.Arrays;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        Crea un array de números enteros de 4 posiciones con el nombre miarray
        Inicializa manualmente cada una de las posiciones del array
         */
        int[] miArray ={1,2,3,4};
        System.out.println(miArray[0]);
        System.out.println(miArray[1]);
        System.out.println(miArray[2]);
        System.out.println(miArray[3]);
        /*
        Recorre el array con un bucle for con un bucle e imprime el valor asignado a cada una de las posiciones
         */
        int i;
        for (i=0;i<miArray.length;i++){
            System.out.println("El valor de miArray con for es: "+ miArray[i]);
        }
        /*
        Recorre el array con un bucle while con un bucle e imprime el valor asignado a cada una de las posiciones
        */
        int c=0;
        while (c<miArray.length){
            System.out.println("Este el es valor del Array con While: "+miArray[c]);
            c++;
        }
        /*
        Recorre el array con un bucle do-while con un bucle e imprime el valor asignado a cada una de las posiciones
         */
        int b=0;
        do {
            System.out.println("Valor del array con DO-While: "+miArray[b]);
            b++;
        }while (b<miArray.length);
        /*
        Declara un array de 2000 posiciones de números de tipo float llamado flotantes, inicializa con un bucle todos los valores a 0 del array, cambia la segunda posición del array y ponle el valor 7.3f y saca su valor por pantalla
         */
        float[] flotantes = new float[2000];
        Arrays.fill(flotantes,0);
        flotantes[2] = 7.3f;
        System.out.println("valor flotantes [2]: "+flotantes[2]);
        //Saca por pantalla el número de elementos de array
        System.out.println("valores totales del array flotantes:" + flotantes.length);
        String finalCountdown = "\uD83E\uDD2A";
        System.out.println(finalCountdown);
    }
}
