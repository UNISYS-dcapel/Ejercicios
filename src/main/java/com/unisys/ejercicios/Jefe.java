package com.unisys.ejercicios;

import java.util.Objects;

public class Jefe extends Empleado{
    private String cabron;

    public Jefe() {
        return;
    }
    public Jefe(String cabron) {
        this.cabron = cabron;
    }

    public Jefe(String nombre, String dni, Integer tlf, Integer sueldo, String cargo, String cabron) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.cabron = cabron;
    }

    public String getCabron() {
        return cabron;
    }

    public void setCabron(String cabron) {
        this.cabron = cabron;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "nombre='" + super.getNombre() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                ", tlf=" + super.getTlf() +
                ", sueldo=" + super.getSueldo() +
                ", cargo='" + super.getCargo() + '\'' +
                "cabron='" + this.cabron + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jefe jefe = (Jefe) o;
        return Objects.equals(getCabron(), jefe.getCabron());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCabron());
    }
}
