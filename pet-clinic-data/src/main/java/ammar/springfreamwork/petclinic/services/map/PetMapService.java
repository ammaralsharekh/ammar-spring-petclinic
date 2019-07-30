package ammar.springfreamwork.petclinic.services.map;

import ammar.springfreamwork.petclinic.model.Pet;
import ammar.springfreamwork.petclinic.services.CrudService;
import ammar.springfreamwork.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save( object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deletedById(Long id) {
        super.deletedById(id);
    }
}