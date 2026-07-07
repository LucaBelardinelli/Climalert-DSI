package ar.edu.utn.ba.ddsi.Climalert.Controllers;

import ar.edu.utn.ba.ddsi.Climalert.Models.Entities.Email;
import ar.edu.utn.ba.ddsi.Climalert.Services.IEmailService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/emails")
public class EmailController {
    private final IEmailService emailService;

    public EmailController(IEmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public Email crearEmail(@RequestBody Email email) {
        return emailService.crearEmail(email);
    }

    @GetMapping
    public List<Email> obtenerEmails(@RequestParam(required = false) Boolean pendiente) {
        return emailService.obtenerEmails(pendiente);
    }
}