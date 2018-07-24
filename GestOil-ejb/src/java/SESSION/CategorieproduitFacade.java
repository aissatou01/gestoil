/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SESSION;

import JPA.Categorieproduit;
import JPA.Produit;
import gestoil.exception.GestoilException;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aissatou
 */
@Stateless
public class CategorieproduitFacade extends AbstractFacade<Categorieproduit> {
    @PersistenceContext(unitName = "GestOil-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategorieproduitFacade() {
        super(Categorieproduit.class);
    }
    
    public List<Categorieproduit> listCategoriesproduit() {
      try {
            return em.createNamedQuery("Categorieproduit.findAll").getResultList();
        } catch (Throwable th) {
            throw new GestoilException(th, 1);
        }  
    }

    
    public Categorieproduit addCateorieproduit(String code, String type, Produit produitcode) {
      try {
            Categorieproduit categorieproduit = new Categorieproduit();
            em.persist(categorieproduit);
            return categorieproduit;
        } catch (Throwable th) {
            throw new GestoilException(th, 5);
        }  
    }

    
    public void deleteCategorieproduit(Categorieproduit categorieproduit) {
      try {
            em.remove(em.merge(categorieproduit));
        } catch (Throwable th) {
            throw new GestoilException(th, 6);
        }  
    }
}
