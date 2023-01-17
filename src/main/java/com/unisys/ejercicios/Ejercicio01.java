package com.unisys.ejercicios;

public class Ejercicio01 {
    public static void main(String[] args){
        int numero = 10;
        short marianico = 12;
        long gasol = 18;
        boolean independencia = false;
        double presupuesto = 12.5;
        float longitud = 12.68F;
        var suma = gasol + marianico;
        System.out.println("La suma total es: "+suma);
        if (independencia){
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }
        var resultado = switch (marianico){
            case 32,28 -> "superior";
            case 12 -> "igual";
            default -> "otra cosa";
        };
        System.out.println(resultado);
    }
}
