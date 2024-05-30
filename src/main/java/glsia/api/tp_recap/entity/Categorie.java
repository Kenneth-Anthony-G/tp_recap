package glsia.api.tp_recap.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String designation;

    @OneToMany(mappedBy = "categorie")
    private List<Produit> Listproduit;

}
