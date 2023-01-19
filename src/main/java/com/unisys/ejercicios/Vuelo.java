package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vuelo {
    public String cia;
    public int numeroVuelo;
    public String origen;
    public String destino;
    public int numPax;
}
