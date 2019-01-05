package ch.zhaw.logvidmi.model.sfgpetclinic.services;

import ch.zhaw.logvidmi.model.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
