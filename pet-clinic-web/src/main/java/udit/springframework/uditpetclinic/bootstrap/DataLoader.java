package udit.springframework.uditpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import udit.springframework.uditpetclinic.model.*;
import udit.springframework.uditpetclinic.services.OwnerService;
import udit.springframework.uditpetclinic.services.PetTypeService;
import udit.springframework.uditpetclinic.services.SpecialityService;
import udit.springframework.uditpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        loadData();

    }


    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiologySpeciality = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgerySpeciality = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistrySpeciality = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Shubman");
        owner1.setLastName("Gill");
        owner1.setAddress("Chandigarh");
        owner1.setCity("Punjab");
        owner1.setTelephone("12345678");

        Pet dog1 = new Pet();
        dog1.setName("Coco");
        dog1.setPetType(savedDogPetType);
        dog1.setOwner(owner1);
        dog1.setBirthdate(LocalDate.now());
        owner1.getPets().add(dog1);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Rohit");
        owner2.setLastName("Sharma");
        owner2.setAddress("Mumbai");
        owner2.setCity("Maharashtra");
        owner2.setTelephone("22345678");
        Pet cat1 = new Pet();
        cat1.setName("Garfy");
        cat1.setPetType(savedCatPetType);
        cat1.setOwner(owner2);
        cat1.setBirthdate(LocalDate.now());
        owner2.getPets().add(cat1);
        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Ravindra");
        vet1.setLastName("Jadeja");
        vet1.getSpecialities().add(savedRadiologySpeciality);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Navdeep");
        vet2.setLastName("Saini");
        vet2.getSpecialities().add(savedDentistrySpeciality);
        vetService.save(vet2);

        System.out.println("Loaded vets");
    }
}
