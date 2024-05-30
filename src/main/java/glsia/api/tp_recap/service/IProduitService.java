package glsia.api.tp_recap.service;

import glsia.api.tp_recap.DAO.ProduitDAO;
import glsia.api.tp_recap.DTO.ProduitDTO;
import glsia.api.tp_recap.entity.Produit;

import java.util.List;

public interface IProduitService {
    public List<ProduitDTO> showProduit();

    Produit saveProduit(ProduitDTO produitDTO);

    public ProduitDTO getOneProduit(int id);
    public void deleteProduit(int id);

    public ProduitDTO convertToDto(Produit produit);
    public Produit convertToEntity(ProduitDTO produitDTO);

}
