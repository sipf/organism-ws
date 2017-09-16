package pf.net.api.organism.repository;

import org.springframework.data.repository.CrudRepository;
import pf.net.api.organism.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
