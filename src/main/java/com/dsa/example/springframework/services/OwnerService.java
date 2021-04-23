package com.dsa.example.springframework.services;

import com.dsa.example.springframework.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long>{

	Owner findByLastName(String lastName);
}
