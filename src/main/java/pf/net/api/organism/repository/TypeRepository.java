package pf.net.api.organism.repository;

import org.springframework.data.repository.CrudRepository;
import pf.net.api.organism.domain.Type;

public interface TypeRepository extends CrudRepository<Type, Long> {
}
