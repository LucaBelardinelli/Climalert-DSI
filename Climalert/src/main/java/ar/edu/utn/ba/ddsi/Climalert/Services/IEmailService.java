package ar.edu.utn.ba.ddsi.Climalert.Services;

import ar.edu.utn.ba.ddsi.Climalert.Models.Entities.Email;
import java.util.List;

public interface IEmailService {
    Email crearEmail(Email email);
    List<Email> obtenerEmails(Boolean pendiente);
    void procesarPendientes();
    void loguearEmailsPendientes();
}