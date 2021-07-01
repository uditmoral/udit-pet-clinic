package udit.springframework.uditpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udit.springframework.uditpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
