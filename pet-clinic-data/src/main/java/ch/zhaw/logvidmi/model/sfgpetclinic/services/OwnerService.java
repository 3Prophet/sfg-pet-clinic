package ch.zhaw.logvidmi.model.sfgpetclinic.services;

import ch.zhaw.logvidmi.model.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName();

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}