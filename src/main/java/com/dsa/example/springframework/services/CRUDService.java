package com.dsa.example.springframework.services;

import java.util.Set;

public interface CRUDService<T, ID> {

	T findById(ID id);

	T save(T object);

	Set<T> findAll();

	void delete(T object);

	void deleteById(ID id);
}
