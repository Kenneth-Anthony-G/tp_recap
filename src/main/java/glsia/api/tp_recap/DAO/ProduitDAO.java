package glsia.api.tp_recap.DAO;

import glsia.api.tp_recap.entity.Categorie;
import glsia.api.tp_recap.entity.Produit;
import jakarta.annotation.security.DenyAll;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
public class ProduitDAO {

}

    /*
    private int id;
    private String nom;
    private float prix;
    private LocalDate dcreation;
    private boolean activation;

    private CategorieDAO categorie;

    public static ProduitDAO fromEntity(Produit produit){
        if(produit==null){
            return null;
        }
        return ProduitDAO.builder()
                .id(produit.getId())
                .nom(produit.getNom())
                .prix(produit.getPrix())
                .dcreation(produit.getDcreation())
                .activation(false)
                .categorie(CategorieDAO.fromEntity(produit.getCategorie()))
                .build();
    }

    public static Produit toEntity(ProduitDAO produit){
        if(produit==null){
            return null;
        }
        return Produit.builder()
                .id(produit.getId())
                .nom(produit.getNom())
                .prix(produit.getPrix())
                .dcreation(produit.getDcreation())
                .activation(false)
                .categorie(CategorieDAO.toEntity(produit.getCategorie()))
                .build();
    }*/
