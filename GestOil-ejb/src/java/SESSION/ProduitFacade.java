/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SESSION;

import JPA.Produit;
import JPA.Station;
import gestoil.exception.GestoilException;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aissatou
 */
@Stateless
public class ProduitFacade extends AbstractFacade<Produit> {
    @PersistenceContext(unitName = "GestOil-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduitFacade() {
        super(Produit.class);
    }
    
    
        public List<Produit> listProduits() {
      try {
            return em.createNamedQuery("Produit.findAll").getResultList();
        } catch (Throwable th) {
            throw new GestoilException(th, 1);
        }  
    }


    public Produit addProduit(String code, Date dateajout, Double quantite, Double montant, String responsable, Double indexdepart, Double indexarrive, Station stationCode) {
      try {
            Produit produit = new Produit();
            em.persist(produit);
            return produit;
        } catch (Throwable th) {
            throw new GestoilException(th, 5);
        }  
    }


    public void deleteProduit(Produit produit) {
      try {
            em.remove(em.merge(produit));
        } catch (Throwable th) {
            throw new GestoilException(th, 6);
        }  
    }

}
