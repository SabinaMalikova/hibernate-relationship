package peaksoft.one_to_one;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "people")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {      // source class
    @Id
    @GeneratedValue(generator = "people_gen",
                    strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "person_gen",
                       sequenceName = "person_seq",
                       allocationSize = 1)
    private Long id;
    private Long INN;
    @OneToOne
    private Passport passport;
}
