package udit.springframework.uditpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udit.springframework.uditpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
