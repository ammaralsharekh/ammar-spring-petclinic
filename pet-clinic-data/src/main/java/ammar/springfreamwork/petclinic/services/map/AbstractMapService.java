package ammar.springfreamwork.petclinic.services.map;

import ammar.springfreamwork.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
    protected Map<Long,T> map =new HashMap<>();

    Set<T> findAll()
    {
        return new HashSet<>(map.values());
    }

    T findById(ID id)
    {
        return map.get(id);
    }

    T save(T object)
    {
        if(object != null)
        {
          object.setId(getNextId());
        }else
        {
            throw new RuntimeException("Object can't be null");
        }
         map.put(object.getId(),object);
        return object;
    }

    void deletedById(ID id)
    {
        map.remove(id);
    }

    void delete(T object)
    {
        map.entrySet().removeIf(entry-> entry.getValue().equals(object));
    }
    private Long getNextId() {
        if(map.size() == 0 )return  1L;
        //System.out.println("-------------------------------");
        //System.out.println(map.size());
       // System.out.println(map.keySet());


        return Collections.max(map.keySet())+1;
    }

}
