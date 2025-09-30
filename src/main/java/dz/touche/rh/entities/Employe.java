package dz.touche.rh.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "employe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employe {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer matricule;

@Column(name = "employee_number", length = 100)
private String employeeNumber;

@Column(name = "name", length = 150)
private String name;

@Column(name = "lastname", length = 150)
private String lastname;

@Column(name = "telephone_pro", length = 50)
private String telephonePro;

@Column(name = "email_pro", length = 200)
private String emailPro;

@Column(name = "date_recrutement")
private LocalDate dateRecrutement;

// Relationships (assumes these entities exist)
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "poste_id")
private Poste poste;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "zone_id")
private Zone zone;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "direction_id")
private Direction direction;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "service_id")
private Service service;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "equipe_id")
private Equipe equipe;

@Column(name = "statut_employe", length = 50)
private String statutEmploye;

@Column(name = "classement", length = 50)
private String classement;

@Column(name = "date_sortie")
private LocalDate dateSortie;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "raison_sortie_id")
private RaisonSortie raisonSortie;

@Column(name = "nb_contrats")
private Integer nbContrats;

@Column(name = "created_at", updatable = false)
private LocalDateTime createdAt;

@Column(name = "updated_at")
private LocalDateTime updatedAt;

@PrePersist
protected void onCreate() {
LocalDateTime now = LocalDateTime.now();
this.createdAt = this.createdAt == null ? now : this.createdAt;
this.updatedAt = now;
}

@PreUpdate
protected void onUpdate() {
this.updatedAt = LocalDateTime.now();
}
}