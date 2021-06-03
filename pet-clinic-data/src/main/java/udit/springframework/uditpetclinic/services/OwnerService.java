package udit.springframework.uditpetclinic.services;

import udit.springframework.uditpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);

}
