package ar.edu.utn.ba.ddsi.Climalert.Schedulers;

import ar.edu.utn.ba.ddsi.Climalert.Services.IClimaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ClimaScheduler {
    private static final Logger logger = LoggerFactory.getLogger(ClimaScheduler.class);
    private final IClimaService climaService;

    public ClimaScheduler(IClimaService climaService) {
        this.climaService = climaService;
    }

    @Scheduled(fixedRate = 300000) // 300000 ms = 5 minutos
    public void actualizarClima() {
        try {
            climaService.actualizarClimaCiudades();
            logger.info("Actualización de clima completada");
        } catch (Exception e) {
            logger.error("Error actualizando clima: {}", e.getMessage());
        }
    }
}
