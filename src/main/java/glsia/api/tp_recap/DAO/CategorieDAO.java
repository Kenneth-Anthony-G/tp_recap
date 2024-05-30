package glsia.api.tp_recap.DAO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import glsia.api.tp_recap.entity.Categorie;
import glsia.api.tp_recap.entity.Produit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data

public class CategorieDAO {

}



/* private int id;
    private String designation;
    @JsonIgnore
    private List<ProduitDAO> Listproduit;

    public static CategorieDAO fromEntity(Categorie  categorie) {
        if(categorie==null){
            return null;
        }
        return CategorieDAO.builder()
                .id(categorie.getId())
                .designation(categorie.getDesignation())
                .build();
    }
    public static Categorie toEntity(CategorieDAO  categorie){
        if(categorie==null){
            return null;
        }
        return Categorie.builder()
                .id(categorie.getId())
                .designation(categorie.getDesignation())
                .build();
    }*/
