package ammar.springfreamwork.petclinic.services.springdatajpa;

import ammar.springfreamwork.petclinic.model.Owner;
import ammar.springfreamwork.petclinic.repositories.OwnerRepository;
import ammar.springfreamwork.petclinic.repositories.PetRepository;
import ammar.springfreamwork.petclinic.repositories.PetTypeRepository;
import ammar.springfreamwork.petclinic.services.OwnerService;


import java.util.HashSet;
import java.util.Set;

public class OwnerSDJpaService  implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deletedById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
