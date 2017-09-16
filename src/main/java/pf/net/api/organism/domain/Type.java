package pf.net.api.organism.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Type name can not be empty, null or with empty space")
    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "type", fetch = FetchType.EAGER)
    private List<Organism> organisms;

}
