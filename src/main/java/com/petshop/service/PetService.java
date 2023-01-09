package com.petshop.service;

import java.util.List;
import com.petshop.model.Pet;

public interface PetService {
    public List<Pet> list();
    public List<Pet> findName(String name);
    public Pet findId(String id);
    public Pet create(Pet pet);
    public Pet update(String id,Pet pet);
    public String delete(String id);
}
