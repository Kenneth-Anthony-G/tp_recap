package glsia.api.tp_recap.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProduitDTO {
    private int id;
    private String nom;
    private float prix;

    private int category_id;

}
