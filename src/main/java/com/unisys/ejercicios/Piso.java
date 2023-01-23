package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Piso extends Casa {
    private Integer planta;

    Piso(Boolean terraza, String direccion, String comunidadAutonoma, Integer planta){
        super(terraza, direccion,comunidadAutonoma);
        this.planta = planta;
    }
    Piso(){
        super();
        this.planta=0;
    }

    @Override
    public String toString() {
        return "Piso{" +"\n"+
                "Terraza = " + getTerraza() +"\n"+
                "Dirección = "+ getDireccion()  +"\n"+
                "Comunidad Autonoma = "+ getComunidadAutonoma()  +"\n"+
                "planta=" + planta +"\n"+
                '}';
    }
}
