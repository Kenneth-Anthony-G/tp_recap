package glsia.api.tp_recap.service;

import glsia.api.tp_recap.DAO.CategorieDAO;
import glsia.api.tp_recap.DTO.CategorieDTO;
import glsia.api.tp_recap.entity.Categorie;

import java.util.List;

public interface ICategorieService {
    public List<CategorieDTO> showAllCategorie();
    public CategorieDTO getOneCategorie(int id);
    public Categorie saveCategorie(Categorie categorie);
    public void deleteCategorie(int id);

    public CategorieDTO convertToDto(Categorie categorie);
    public Categorie convertToEntity(CategorieDTO categorieDTO);



}
