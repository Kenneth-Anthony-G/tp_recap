package glsia.api.tp_recap.repository;

import glsia.api.tp_recap.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
}
