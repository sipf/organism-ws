package pf.net.api.organism.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Social {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "social_network_id")
    private SocialNetwork socialNetwork;

    @NotBlank(message = "Social link can not be empty, null or with empty space")
    private String link;

    @ManyToOne
    @JoinColumn(name = "organism_id")
    private Organism organism;
}
