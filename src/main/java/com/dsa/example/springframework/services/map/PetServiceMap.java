package com.dsa.example.springframework.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.dsa.example.springframework.model.Pet;
import com.dsa.example.springframework.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
	

}
