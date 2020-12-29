package springboot.Tel11.DataRest.H2.sankar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import springboot.Tel11.DataRest.H2.sankar.Model.Alien;


@RepositoryRestResource(collectionResourceRel = "aliens",path="aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
