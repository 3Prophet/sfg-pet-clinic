package ch.zhaw.logvidmi.model.sfgpetclinic.services;

import ch.zhaw.logvidmi.model.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
