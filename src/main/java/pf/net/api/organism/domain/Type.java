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
public class Type {

    @Id
    @GenericGenerator(
            name = "sequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "TYPE_SEQUENCE"),
                    @Parameter(name = "initial_value", value = "1000"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @GeneratedValue(generator = "sequenceGenerator")
    private Long id;

    @NotBlank(message = "Type name can not be empty, null or with empty space")
    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "type", fetch = FetchType.EAGER)
    private List<Organism> organisms;

}
