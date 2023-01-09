package com.petshop.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petshop.model.Pet;
import com.petshop.service.PetService;

@RestController
@RequestMapping("/")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> list(){
        return this.petService.list();
    }
    @GetMapping("/pet/{name}")
    public List<Pet> listByName(@PathVariable("name") String name){
        return this.petService.findName(name);
    }
    @GetMapping("/pet/byid/{id}")
    public Pet listById(@PathVariable("id") String id){
        return this.petService.findId(id);
    }
    @PostMapping
    public Pet create(@RequestBody Pet pet){
        return this.petService.create(pet);
    }
    @PatchMapping("/{id}")
    public Pet update(@PathVariable("id") String id, @RequestBody Pet pet){
        return this.petService.update(id,pet);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        return this.petService.delete(id);
    }
}
