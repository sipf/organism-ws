package pf.net.api.organism.repository;

import org.springframework.data.repository.CrudRepository;
import pf.net.api.organism.domain.Statut;

public interface StatutRepository extends CrudRepository<Statut, Long> {
}
