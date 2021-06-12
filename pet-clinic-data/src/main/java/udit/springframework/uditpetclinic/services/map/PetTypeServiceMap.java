package udit.springframework.uditpetclinic.services.map;

import udit.springframework.uditpetclinic.model.PetType;
import udit.springframework.uditpetclinic.services.CrudService;

import java.util.Set;

public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements CrudService<PetType,Long> {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);

    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
