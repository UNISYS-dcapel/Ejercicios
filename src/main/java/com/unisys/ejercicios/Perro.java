package com.unisys.ejercicios;

public class Perro {
    public String raza;

    public Perro(){
        raza = "";
    }
    public Perro(String i){
        this.raza = i;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }
}
