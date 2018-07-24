/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SESSION;

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
public class StationFacade extends AbstractFacade<Station> {
    @PersistenceContext(unitName = "GestOil-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StationFacade() {
        super(Station.class);
    }
    
    public List<Station> listStations() {
        try {
            return em.createNamedQuery("Station.findAll").getResultList();
        } catch (Throwable th) {
            throw new GestoilException(th, 1);
        }
    }

    
    public Station addStation(String code, String nom, String telephone, String email, String type) {
        try {
            Station station = new Station();
            em.persist(station);
            return station;
        } catch (Throwable th) {
            throw new GestoilException(th, 5);
        }
    }

    
    public void deleteStation(Station station) {
        try {
            em.remove(em.merge(station));
        } catch (Throwable th) {
            throw new GestoilException(th, 6);
        }
    }
    
}
