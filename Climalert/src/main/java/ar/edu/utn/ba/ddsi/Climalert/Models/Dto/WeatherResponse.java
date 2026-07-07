package ar.edu.utn.ba.ddsi.Climalert.Models.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {
    private Location location;
    private Current current;
}