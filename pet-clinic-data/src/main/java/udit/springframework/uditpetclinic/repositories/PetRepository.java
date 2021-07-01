package udit.springframework.uditpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udit.springframework.uditpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
