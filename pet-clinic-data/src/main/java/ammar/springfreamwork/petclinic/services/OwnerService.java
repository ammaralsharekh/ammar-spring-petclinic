package ammar.springfreamwork.petclinic.services;

import ammar.springfreamwork.petclinic.model.Owner;

import java.util.List;


public interface OwnerService extends  CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
