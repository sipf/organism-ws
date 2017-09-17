package pf.net.api.organism.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class SocialNetwork {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Social media name can not be empty, null or with empty space")
    private String name;

    @NotBlank(message = "Social network logo can not be empty, null or with empty space")
    private String logo;

    @OneToMany(mappedBy = "socialNetwork")
    private List<Social> socials;
}
