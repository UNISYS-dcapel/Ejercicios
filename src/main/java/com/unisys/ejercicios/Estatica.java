package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Estatica {
    public static final double PI = 3.16;

    static String berrinche = "el quejido";
}
