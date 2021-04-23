package com.dsa.example.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dsa.example.springframework.model.Owner;
import com.dsa.example.springframework.model.Vet;
import com.dsa.example.springframework.services.OwnerService;
import com.dsa.example.springframework.services.VetService;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Loading Owners...");
		Owner owner1 = new Owner();
		owner1.setId(1l);
		owner1.setFirstName("Deepak");
		owner1.setLastName("Attarde");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2l);
		owner2.setFirstName("John");
		owner2.setLastName("Doe");
		
		ownerService.save(owner2);
		
		System.out.println("Loading Owners completed");
		System.out.println("Loading Vets...");
		Vet vet1 = new Vet();
		vet1.setId(1l);
		vet1.setFirstName("Vet1FN");
		vet1.setLastName("Vet1LN");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2l);
		vet2.setFirstName("Vet2FN");
		vet2.setLastName("Vet2LN");
		
		vetService.save(vet2);
		System.out.println("Loading Vets completed");
	}

	
}
