package pf.net.api.organism.repository;

import org.springframework.data.repository.CrudRepository;
import pf.net.api.organism.domain.Mission;

public interface MissionRepository extends CrudRepository<Mission, Long> {
}
