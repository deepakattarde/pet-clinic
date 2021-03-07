package com.dsa.example.springframework.model;

import java.time.LocalDate;

public class Pet {
	
	private LocalDate bitrhtDate;
	private PetType petType;
	private Owner owner;
	
	public LocalDate getBitrhtDate() {
		return bitrhtDate;
	}
	public void setBitrhtDate(LocalDate bitrhtDate) {
		this.bitrhtDate = bitrhtDate;
	}
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	
}
