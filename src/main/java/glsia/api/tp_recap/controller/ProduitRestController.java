package glsia.api.tp_recap.controller;

import glsia.api.tp_recap.DAO.ProduitDAO;
import glsia.api.tp_recap.DTO.ProduitDTO;
import glsia.api.tp_recap.entity.Produit;
import glsia.api.tp_recap.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produit")
@RestController
public class ProduitRestController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/")
    public List<ProduitDTO> showProduit(){
        return produitService.showProduit();
    }
    @GetMapping("/{id}")
    public ProduitDTO getOneProduit(@PathVariable int id){
        return produitService.getOneProduit(id);
    }
    @PostMapping("/")
    public Produit saveProduit(@RequestBody ProduitDTO produit){
        return produitService.saveProduit(produit);
    }
    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable int id){
        produitService.deleteProduit(id);
    }
}
