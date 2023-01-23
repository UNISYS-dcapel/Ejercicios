package com.unisys.ejercicios;

public class CasaApp {
    public static void main(String[] args) {

        Casa casa = new Casa();
        System.out.println(casa);
        casa.setDireccion("Avenida Principes de España");
        casa.setTerraza(true);
        casa.setComunidadAutonoma("Madrid");
        System.out.println(casa);

        Chalet chalet = new Chalet();
        System.out.println(chalet);
        chalet.setGarage(true);
        chalet.setJardin(true);
        System.out.println(chalet);

        Piso piso = new Piso();
        System.out.println(piso);
        piso.setDireccion("Calle Jarama");
        piso.setTerraza(false);
        piso.setComunidadAutonoma("Madrid");
        piso.setPlanta(5);
        System.out.println(piso);

        ChaletDeLujo chaletDeLujo = new ChaletDeLujo();
        System.out.println(chaletDeLujo);
        chaletDeLujo.setBagnos(5);
        System.out.println(chaletDeLujo);;
        ChaletDeLujo chaletDeLujo1 = new ChaletDeLujo(true,"Calle Andalucia","Andalucia",true,true,5);
        System.out.println(chaletDeLujo1);

    }
}
