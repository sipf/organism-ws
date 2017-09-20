package pf.net.api.organism.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Social {

    @Id
    @GenericGenerator(
            name = "sequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "SOCIAL_SEQUENCE"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @GeneratedValue(generator = "sequenceGenerator")
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
