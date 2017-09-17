package pf.net.api.organism.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Statut {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Statut name can not be empty, null or with empty space")
    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "statut", fetch = FetchType.EAGER)
    private List<Organism> organisms;
}
