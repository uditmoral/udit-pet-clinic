package udit.springframework.uditpetclinic.services;

import udit.springframework.uditpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
