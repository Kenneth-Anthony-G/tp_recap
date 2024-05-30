package glsia.api.tp_recap.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private float prix;
    private LocalDate dcreation;
    private boolean activation;

    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categorie;
}
