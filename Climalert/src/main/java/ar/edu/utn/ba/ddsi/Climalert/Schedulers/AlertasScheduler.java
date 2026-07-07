package ar.edu.utn.ba.ddsi.Climalert.Schedulers;


import ar.edu.utn.ba.ddsi.Climalert.Services.IAlertasService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AlertasScheduler {
    private static final Logger logger = LoggerFactory.getLogger(AlertasScheduler.class);
    private final IAlertasService alertasService;

    public AlertasScheduler(IAlertasService alertasService) {
        this.alertasService = alertasService;
    }

    @Scheduled(fixedRate = 60000) // Cada 1 minuto
    public void procesarAlertas() {
        try {
            alertasService.generarAlertasYAvisar();
            logger.info("Procesamiento de alertas completado");
        } catch (Exception e) {
            logger.error("Error procesando alertas: {}", e.getMessage());
        }
    }
}
