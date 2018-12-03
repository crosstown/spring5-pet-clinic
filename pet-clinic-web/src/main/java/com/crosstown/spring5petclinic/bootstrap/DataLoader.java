package com.crosstown.spring5petclinic.bootstrap;

import com.crosstown.spring5petclinic.model.Owner;
import com.crosstown.spring5petclinic.model.Pet;
import com.crosstown.spring5petclinic.model.PetType;
import com.crosstown.spring5petclinic.model.Vet;
import com.crosstown.spring5petclinic.services.OwnerService;
import com.crosstown.spring5petclinic.services.PetTypeService;
import com.crosstown.spring5petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author developer
 * @date 2018-12-01
 * @time 14:41
 */
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
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerlayer");
        owner1.setCity("Miami");
        owner1.setTelephone("3053456789");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Pencil");
        owner2.setAddress("123 Brickerlayer");
        owner2.setCity("Miami");
        owner2.setTelephone("3053456789");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Just Cat");
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Paul");
        vet2.setLastName("Dogwood");

        vetService.save(vet2);

        System.out.println("Loaded vets...");




    }
}
