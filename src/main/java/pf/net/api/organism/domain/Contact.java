package pf.net.api.organism.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Contact name can not be empty, null or with empty space")
    @Column(nullable = false, unique = true)
    private String name;

    private String address;
    private String phone;
    private String mail;
    private String fax;

    @ManyToOne
    @JoinColumn(name = "organism_id")
    private Organism organism;
}
