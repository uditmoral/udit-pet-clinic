package udit.springframework.uditpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    @Column(name = "visit_date")
    private LocalDate visitDate;

    @Column(name = "description")
    public String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;


}
