package dz.touche.rh.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "raison_sortie")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RaisonSortie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "motif", length = 150)
    private String motif;
}
