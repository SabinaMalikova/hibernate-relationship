package peaksoft.many_to_many;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Project {
    @Id
    @GeneratedValue(generator = "project_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "project_gen",
            sequenceName = "project_seq",
            allocationSize = 1)
    private Long id;
    private String description;
}
