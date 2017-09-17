package pf.net.api.organism.repository;

import org.springframework.data.repository.CrudRepository;
import pf.net.api.organism.domain.SocialNetwork;

public interface SocialNetworkRepository extends CrudRepository<SocialNetwork, Long> {
}
