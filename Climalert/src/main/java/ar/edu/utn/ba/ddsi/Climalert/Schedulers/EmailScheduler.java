package ar.edu.utn.ba.ddsi.Climalert.Schedulers;

import ar.edu.utn.ba.ddsi.Climalert.Services.IEmailService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailScheduler {
    private final IEmailService emailService;

    public EmailScheduler(IEmailService emailService) {
        this.emailService = emailService;
    }

    @Scheduled(cron = "${cron.expression}")
    public void procesarEmailsPendientes() {
        emailService.procesarPendientes();
    }

    @Scheduled(cron = "${cron.expression}")
    public void loguearEmailsPendientes() {
        emailService.loguearEmailsPendientes();
    }
}