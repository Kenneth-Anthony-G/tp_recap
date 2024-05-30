package glsia.api.tp_recap.repository;

import glsia.api.tp_recap.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
