package ammar.springfreamwork.petclinic.services;

import ammar.springfreamwork.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends  CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
