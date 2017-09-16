package pf.net.api.organism.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pf.net.api.organism.domain.Organism;

@RepositoryRestResource
public interface OrganismRepository extends JpaRepository<Organism, Long> {
}
