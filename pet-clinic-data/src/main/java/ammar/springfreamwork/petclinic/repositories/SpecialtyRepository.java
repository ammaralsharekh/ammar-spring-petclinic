package ammar.springfreamwork.petclinic.repositories;


import ammar.springfreamwork.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 8/5/18.
 */
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
