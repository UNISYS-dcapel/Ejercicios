package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class ChaletDeLujo extends Chalet{
    private Integer bagnos;

    ChaletDeLujo(Boolean terraza, String direccion, String comunidadAutonoma, Boolean garage, Boolean jardin, Integer bagnos){
        super(terraza, direccion, comunidadAutonoma, garage, jardin);
        this.bagnos = bagnos;
    }
    ChaletDeLujo(){
        super();
        this.bagnos = 0;
    }

    @Override
    public String toString() {
        return "ChaletDeLujo{" +"\n"+
                "Terraza = " + getTerraza() +"\n"+
                "Dirección = "+ getDireccion() +"\n"+
                "Comunidad Autonoma = "+ getComunidadAutonoma() +"\n"+
                "Garage = " + getGarage() +"\n"+
                "Jardin=" + getJardin() +"\n"+
                "Baños=" + bagnos +"q\n"+
                '}';
    }
}
