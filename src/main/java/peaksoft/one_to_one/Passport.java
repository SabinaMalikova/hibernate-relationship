package peaksoft.one_to_one;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "passports")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Passport {   // target class      // mappedBy - всегда пишется в таргет классе
                                               // bi  болгондо target класстын таблицасында source класстын id полеси келдейт, бирок связь бар болот
    @Id
    @GeneratedValue(generator = "passport_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "passport_gen",
            sequenceName = "passport_seq",
            allocationSize = 1)
    private Long id;
    private String name;
    private String lastName;
    private String country;
    private LocalDate dateOfBirth;
    @OneToOne(mappedBy = "passport")
    private Person person;


}
