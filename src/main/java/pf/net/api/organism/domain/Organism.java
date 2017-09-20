package pf.net.api.organism.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Organism {

    /*
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    */
    @Id
    @GenericGenerator(
            name = "sequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "ORGANISM_SEQUENCE"),
                    @Parameter(name = "initial_value", value = "1000"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @GeneratedValue(generator = "sequenceGenerator")
    private Long id;

    @NotBlank(message = "Organism name can not be empty, null or with empty space")
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = true)
    private String acronym;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @NotBlank(message = "Organisms description can not be empty, null or with empty space")
    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "statut_id")
    private Statut statut;

    @Column(nullable = false)
    private String logoSlug;

    @Column(nullable = false)
    private String iconSlug;

    @Column(nullable = false)
    private String websiteSlug;

    @OneToMany(mappedBy = "organism")
    private List<Contact> contacts;

    @OneToMany(mappedBy = "organism")
    private List<Mission> missions;

    @OneToMany(mappedBy = "organism")
    private List<Social> socials;

}
