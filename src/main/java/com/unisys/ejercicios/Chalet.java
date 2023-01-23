package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Chalet extends Casa {
    private Boolean garage;

    private Boolean jardin;

    Chalet(Boolean terraza,String direccion, String comunidadAutonoma, Boolean garage, Boolean jardin){
        super(terraza, direccion,comunidadAutonoma);
        this.garage = garage;
        this.jardin = jardin;
    }
    Chalet(){
        super();
        this.garage = false;
        this.jardin = false;
    }

    @Override
    public String toString() {
        return "Chalet{" +"\n"+
                "Terraza = " + getTerraza() +"\n"+
                "Dirección = "+ getDireccion() +"\n"+
                "Comunidad Autonoma = "+ getComunidadAutonoma() +"\n"+
                "Garage = " + this.garage +"\n"+
                "Jardín=" + this.jardin +"\n"+
                '}';
    }
}
