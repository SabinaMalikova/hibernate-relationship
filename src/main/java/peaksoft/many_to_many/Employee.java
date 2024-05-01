package peaksoft.many_to_many;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Employee {
    @Id
    @GeneratedValue(generator = "employee_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "employee_gen",
            sequenceName = "employee_seq",
            allocationSize = 1)
    private Long id;
    private String full_name;

}
