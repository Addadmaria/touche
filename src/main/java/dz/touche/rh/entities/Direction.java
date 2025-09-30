package dz.touche.rh.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "direction")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Direction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", length = 150)
    private String nom;
}

