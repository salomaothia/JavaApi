package com.petshop.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.petshop.model.Pet;

public interface PetRepository extends MongoRepository<Pet,String>{
    @Query("{'nome':{$eq:?0}}")
    public List<Pet> findName(String name);
}
