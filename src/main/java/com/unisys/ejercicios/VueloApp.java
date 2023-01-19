package com.unisys.ejercicios;

public class VueloApp {
    public static void main(String[] args) {
        Vuelo consulta1 = new Vuelo("IB",6251,"MAD","MIA",250);
        System.out.println(Ejercicio02.ANSI_WHITE+"En el vuelo "+Ejercicio02.ANSI_RED+consulta1.getCia()+consulta1.getNumeroVuelo()+Ejercicio02.ANSI_WHITE+" con routing: " +Ejercicio02.ANSI_GREEN+consulta1.getOrigen()+consulta1.getDestino()+Ejercicio02.ANSI_WHITE );
        System.out.println("El número de pasajeros es: "+Ejercicio02.ANSI_BLUE+consulta1.getNumPax()+Ejercicio02.ANSI_WHITE);
        consulta1.setCia("AA");
        consulta1.setNumeroVuelo(2256);
        consulta1.setOrigen("MIA");
        consulta1.setDestino("DFW");
        consulta1.setNumPax(300);
        System.out.println(consulta1);
    }
}
