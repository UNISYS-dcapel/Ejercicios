package com.unisys.ejercicios;

import java.io.Serializable;
import java.util.Objects;

public class Pieza implements Serializable {

    private static final long SerialVersionUID=102;
    private String nombre;
    private String tipoDePieza;

    public Pieza(String nombre, String tipoDePieza) {
        this.nombre = nombre;
        this.tipoDePieza = tipoDePieza;
    }
    public Pieza(){
        this.nombre = "";
        this.tipoDePieza = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDePieza() {
        return tipoDePieza;
    }

    public void setTipoDePieza(String tipoDePieza) {
        this.tipoDePieza = tipoDePieza;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "nombre='" + nombre + '\'' +
                ", tipoDePieza='" + tipoDePieza + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieza pieza = (Pieza) o;
        return Objects.equals(getNombre(), pieza.getNombre()) && Objects.equals(getTipoDePieza(), pieza.getTipoDePieza());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getTipoDePieza());
    }
}
