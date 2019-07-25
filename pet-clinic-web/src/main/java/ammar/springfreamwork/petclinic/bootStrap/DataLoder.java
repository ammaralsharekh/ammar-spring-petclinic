package ammar.springfreamwork.petclinic.bootStrap;

import ammar.springfreamwork.petclinic.model.Owner;
import ammar.springfreamwork.petclinic.model.Vet;
import ammar.springfreamwork.petclinic.services.OwnerService;
import ammar.springfreamwork.petclinic.services.VetService;
import ammar.springfreamwork.petclinic.services.map.OwnerServiceMap;
import ammar.springfreamwork.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoder implements CommandLineRunner {
  private  final OwnerService ownerService;
  private  final VetService vetService;

    public DataLoder(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets...."); }
}
