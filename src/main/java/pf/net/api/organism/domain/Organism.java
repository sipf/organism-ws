package pf.net.api.organism.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;


@Entity(name = "organism")
@Getter
@Setter
@Table(name = "organism")
public class Organism {

    /*
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Organism name can not be empty, null or with empty space")
    @Column(nullable = false, unique = true)
    private String name;

    private String acronym;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type_id")
    private Type type;

    @NotBlank(message = "Organisms description can not be empty, null or with empty space")
    @Column(nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "statut_id")
    private Statut statut;

    private String logo_slug;
    private String icon_slug;
    private String website_slug;

    @OneToMany(mappedBy = "organism")
    private List<Contact> contacts;

    @OneToMany(mappedBy = "organism", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Mission> missions;

    @OneToMany(mappedBy = "organism")
    private List<Social> socials;

}
