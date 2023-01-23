package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Casa {
    private Boolean terraza;
    private String direccion;
    private String comunidadAutonoma;

    Casa(Boolean terraza, String direccion,String comunidadAutonoma){
        this.terraza = terraza;
        this.direccion = direccion;
        this.comunidadAutonoma = comunidadAutonoma;
    }
    Casa(){
        this.terraza = false;
        this.direccion = "";
        this.comunidadAutonoma = "";
    }
}
