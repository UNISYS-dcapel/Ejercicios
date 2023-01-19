package com.unisys.ejercicios;


import java.util.Date;

public class PerroLombokApp {
    public static void main(String[] args) {
        PerroLombok toby = new PerroLombok("Toby","Terrier",10,(new Date(2012,10,2)));
        System.out.println(toby);
        PerroLombok otto = new PerroLombok("Otto","Pastor Alemán",9,(new Date()));
        System.out.println(otto);
        PerroLombok fluky = new PerroLombok();
        fluky.setNombre("Fluky");
        fluky.setRaza("Pastor de Aguas");
        fluky.setEdad(4);
        System.out.println(fluky);
    }


}
