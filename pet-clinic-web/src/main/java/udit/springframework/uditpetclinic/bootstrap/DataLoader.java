package udit.springframework.uditpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import udit.springframework.uditpetclinic.model.Owner;
import udit.springframework.uditpetclinic.model.PetType;
import udit.springframework.uditpetclinic.model.Vet;
import udit.springframework.uditpetclinic.services.OwnerService;
import udit.springframework.uditpetclinic.services.PetTypeService;
import udit.springframework.uditpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Shubman");
        owner1.setLastName("Gill");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Rohit");
        owner2.setLastName("Sharma");
        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Ravindra");
        vet1.setLastName("Jadeja");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Navdeep");
        vet2.setLastName("Saini");
        vetService.save(vet2);

        System.out.println("Loaded vets");

    }
}
