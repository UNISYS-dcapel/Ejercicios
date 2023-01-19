package com.unisys.ejercicios;

import java.util.Objects;

public class Empleado extends Persona{
    private String nombre;
    private String dni;
    private Integer tlf;
    protected Integer sueldo;
    private String cargo;

    public Empleado() {
        this.nombre = "";
        this.dni = "";
        this.tlf = 0;
        this.sueldo = 0;
        this.cargo = "";
    }
    public Empleado(String nombre, String dni, Integer tlf, Integer sueldo, String cargo) {
        this.nombre = nombre;
        this.dni = dni;
        this.tlf = tlf;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getTlf() {
        return tlf;
    }

    public void setTlf(Integer tlf) {
        this.tlf = tlf;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(getNombre(), empleado.getNombre()) && Objects.equals(getDni(), empleado.getDni()) && Objects.equals(getTlf(), empleado.getTlf()) && Objects.equals(getSueldo(), empleado.getSueldo()) && Objects.equals(getCargo(), empleado.getCargo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getDni(), getTlf(), getSueldo(), getCargo());
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
