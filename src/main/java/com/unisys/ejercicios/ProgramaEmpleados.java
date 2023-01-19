package com.unisys.ejercicios;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        Jefe jefe = new Jefe("Mike", "75729492A",659365225,62000 ,"Jefe" ,"SI");
        System.out.println("Jefe " + jefe.toString());
        Currito currito = new Currito();
        System.out.println("Currito " + currito);
        jefe.setCargo("Jefe");
        jefe.setDni("75859565Z");
        jefe.setNombre("Mike");
        jefe.setCabron("Si");
        System.out.println(jefe);
    }
}
