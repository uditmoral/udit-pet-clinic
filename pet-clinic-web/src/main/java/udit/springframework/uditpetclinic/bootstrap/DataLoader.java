package udit.springframework.uditpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import udit.springframework.uditpetclinic.model.Owner;
import udit.springframework.uditpetclinic.model.Vet;
import udit.springframework.uditpetclinic.services.OwnerService;
import udit.springframework.uditpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Shubman");
        owner1.setLastName("Gill");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Rohit");
        owner2.setLastName("Sharma");
        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ravindra");
        vet1.setLastName("Jadeja");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Navdeep");
        vet2.setLastName("Saini");
        vetService.save(vet2);

        System.out.println("Loaded vets");

    }
}
