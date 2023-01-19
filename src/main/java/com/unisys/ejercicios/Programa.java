package com.unisys.ejercicios;

public class Programa {
    public static void main(String[] args) {
        Perro toby = new Perro();
        toby.raza = "Terrier";
        System.out.println(toby.raza);
        Perro otto = new Perro();
        otto.raza = "Pastor Aleman";
        System.out.println(otto.raza);
        Perro fluky = new Perro();
        fluky = new Perro();
        fluky.setRaza("Perro de aguas");
        System.out.println(fluky);
        System.out.println(fluky.getRaza());
        System.out.println(fluky.toString());
    }
}
