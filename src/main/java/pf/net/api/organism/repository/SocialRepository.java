package pf.net.api.organism.repository;

import org.springframework.data.repository.CrudRepository;
import pf.net.api.organism.domain.Social;

public interface SocialRepository extends CrudRepository<Social, Long> {
}
