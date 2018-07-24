/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SESSION;

import JPA.Service;
import JPA.Station;
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
public class ServiceFacade extends AbstractFacade<Service> {
    @PersistenceContext(unitName = "GestOil-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServiceFacade() {
        super(Service.class);
    }
    
    public List<Service> listServices() {
        try {
            return em.createNamedQuery("Service.findAll").getResultList();
        } catch (Throwable th) {
            throw new GestoilException(th, 1);
        }
    }


    public Service addService(String code, String nom, Double montant, String responsable, Integer nombre, Station stationCode) {
      try {
            Service service = new Service();
            em.persist(service);
            return service;
        } catch (Throwable th) {
            throw new GestoilException(th, 5);
        }  
    }


    public void deleteService(Service service) {
       try {
            em.remove(em.merge(service));
        } catch (Throwable th) {
            throw new GestoilException(th, 6);
        } 
    }

}
