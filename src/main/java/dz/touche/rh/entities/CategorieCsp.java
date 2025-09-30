package dz.touche.rh.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categorie_csp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategorieCsp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", length = 150)
    private String nom;
}

