package ar.edu.utn.ba.ddsi.Climalert.Models.Dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Current {
    private double temp_c;
    private double temp_f;
    private Condition condition;
    private double wind_kph;
    private int humidity;
}