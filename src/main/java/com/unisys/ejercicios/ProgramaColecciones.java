package com.unisys.ejercicios;

import java.awt.datatransfer.Clipboard;
import java.util.*;

public class ProgramaColecciones {
    public static void main(String[] args) {

        Pieza pieza = new Pieza("Amd", "procesador");
        Ordenador ordenador = new Ordenador();
        ordenador.setMarca("Dell");
        ordenador.setModelo("Latitude");
        List<Pieza> listado = new ArrayList<>();
        listado.add(pieza);
        System.out.println(listado);
        //Ordenador ordenador = new Ordenador("Dell","Latitude",listado);
        for (int i = 0; i < 4; i++) {
            pieza = new Pieza("Pieza" + i, "Tipo" + i);
            listado.add(pieza);
            System.out.println(ordenador);
        }
        ordenador.setPiezas(listado);
        System.out.println(ordenador);

        Set<Pieza> misPiezas = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            pieza = new Pieza("Pieza" + i, "Tipo" + i);
            misPiezas.add(pieza);
        }
        Pieza pieza2 = new Pieza("Grafica2", "grafica2");
        Pieza pieza3 = new Pieza("Grafica3", "grafica3");
        Pieza pieza4 = new Pieza("Grafica4", "grafica4");
        Pieza pieza5 = new Pieza("Grafica5", "grafica5");

        misPiezas.add(pieza2);
        misPiezas.add(pieza3);
        misPiezas.add(pieza4);
        misPiezas.add(pieza5);

        System.out.println(misPiezas);
        Map<String, String> cliente = new HashMap<String, String>();
        cliente.put("Nombre: ","Pepe");
        cliente.put("Dirección: ","Mi calle");
        cliente.put("Telefono: ","677655234");
        cliente.put("email: ","p@p.com");
        System.out.println(cliente);
        List<Map<String,String>> listadoMapa=new ArrayList<Map<String,String>>();
        listadoMapa.add(cliente);
        System.out.println(listadoMapa);
    }
}