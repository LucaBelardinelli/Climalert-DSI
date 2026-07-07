package ar.edu.utn.ba.ddsi.Climalert.Models.Repositories;


import ar.edu.utn.ba.ddsi.Climalert.Models.Entities.Email;

import java.util.List;
import java.util.Optional;

public interface IEmailRepository {
    Email save(Email email);
    List<Email> findAll();
    List<Email> findByEnviado(boolean enviado);
    Optional<Email> findById(Long id);
    void delete(Email email);
}