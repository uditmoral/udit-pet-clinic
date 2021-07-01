package udit.springframework.uditpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udit.springframework.uditpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
