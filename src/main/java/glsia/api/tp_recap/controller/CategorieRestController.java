package glsia.api.tp_recap.controller;

import glsia.api.tp_recap.DAO.CategorieDAO;
import glsia.api.tp_recap.DTO.CategorieDTO;
import glsia.api.tp_recap.entity.Categorie;
import glsia.api.tp_recap.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class CategorieRestController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/")
    public List<CategorieDTO> showCategorie(){
        return categorieService.showAllCategorie();
    }

    @PostMapping("/")
    public Categorie saveCategorie(@RequestBody Categorie categorie){
        return categorieService.saveCategorie(categorie);
    }
    @DeleteMapping("/{id}")
    public void deleteCAtegorie(@PathVariable("id") int id){
        categorieService.deleteCategorie(id) ;
    }
}
