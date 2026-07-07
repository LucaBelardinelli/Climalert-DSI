package ar.edu.utn.ba.ddsi.Climalert.Services;


import reactor.core.publisher.Mono;

public interface IAlertasService {
    Mono<Void> generarAlertasYAvisar();
}