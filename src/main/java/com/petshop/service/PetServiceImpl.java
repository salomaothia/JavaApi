package com.petshop.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.petshop.model.Pet;
import com.petshop.repository.PetRepository;

@Service
public class PetServiceImpl implements PetService {
    @Autowired 
    private PetRepository petreRepository;
    
    @Override
    public List<Pet> list(){
        return this.petreRepository.findAll();
    }
    @Override
    public Pet create(Pet pet) {
        return this.petreRepository.save(pet);
    }
    @Override    
    public Pet update(String id,Pet pet) {
        pet.setId(id);
        return this.petreRepository.save(pet);
    }
    @Override
    public List<Pet> findName(String name) {
        return this.petreRepository.findName(name);
    }
    @Override
    public String delete(String id) {
        try {
            this.petreRepository.deleteById(id);            
        } catch (Exception e) {
            return e.toString();
        }
        return "Recurso de id:"+id+" excluído";
    }
    @Override
    public Pet findId(String id) {
        return this.petreRepository.findById(id).get();        
    }
}