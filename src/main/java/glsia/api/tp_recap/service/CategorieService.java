package glsia.api.tp_recap.service;

import glsia.api.tp_recap.DAO.CategorieDAO;
import glsia.api.tp_recap.DAO.ProduitDAO;
import glsia.api.tp_recap.DTO.CategorieDTO;
import glsia.api.tp_recap.entity.Categorie;
import glsia.api.tp_recap.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategorieService implements ICategorieService{

    @Autowired
    private CategorieRepository categorieRepository;
    @Override
    public List<CategorieDTO> showAllCategorie() {
        return categorieRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    public CategorieDTO getOneCategorie(int id) {
        return convertToDto(categorieRepository.getOne(id));
    }

    @Override
    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public void deleteCategorie(int id) {
        categorieRepository.deleteById(id);
    }

    @Override
    public CategorieDTO convertToDto(Categorie categorie) {
        return CategorieDTO.builder()
                .id(categorie.getId())
                .designation(categorie.getDesignation())
                .build();
    }

    @Override
    public Categorie convertToEntity(CategorieDTO categorieDTO) {
        return Categorie.builder()
                .id(categorieDTO.getId())
                .designation(categorieDTO.getDesignation())
                .build();
    }
}
