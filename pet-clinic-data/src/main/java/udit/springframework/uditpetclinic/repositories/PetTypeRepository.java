package udit.springframework.uditpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udit.springframework.uditpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
