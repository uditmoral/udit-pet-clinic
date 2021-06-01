package udit.springframework.uditpetclinic.services;
import udit.springframework.uditpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
