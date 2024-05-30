package glsia.api.tp_recap.service;

import glsia.api.tp_recap.DAO.ProduitDAO;
import glsia.api.tp_recap.DTO.ProduitDTO;
import glsia.api.tp_recap.entity.Produit;
import glsia.api.tp_recap.repository.CategorieRepository;
import glsia.api.tp_recap.repository.ProduitRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProduitService implements IProduitService{
    @Autowired
    private ProduitRepository produitRepository;
    private CategorieRepository categorieRepository;

    @Autowired
    public ProduitService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public List<ProduitDTO> showProduit() {
        return produitRepository.findAll()
                .stream()
                .map(this::convertToDto).
                collect(Collectors.toList());
    }

    @Override
    public Produit saveProduit(ProduitDTO produitDTO) {
        return produitRepository.save(convertToEntity(produitDTO));
    }

    @Override
    public ProduitDTO getOneProduit(int id) {
        return convertToDto(produitRepository.getOne(id));
    }

    @Override
    public void deleteProduit(int id) {
        produitRepository.deleteById(id);

    }

    @Override
    public ProduitDTO convertToDto(Produit produit) {
        return ProduitDTO.builder()
                .id(produit.getId())
                .prix(produit.getPrix())
                .nom(produit.getNom())
                .build();
    }

    @Override
    public Produit convertToEntity(ProduitDTO produitDTO) {
        return Produit.builder()
                .id(produitDTO.getId())
                .prix(produitDTO.getPrix())
                .nom(produitDTO.getNom())
                .build();
    }
}
