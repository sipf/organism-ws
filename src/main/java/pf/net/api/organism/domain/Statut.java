package pf.net.api.organism.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
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
