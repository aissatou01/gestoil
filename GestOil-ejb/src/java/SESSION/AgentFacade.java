/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SESSION;

import JPA.Agent;
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
public class AgentFacade extends AbstractFacade<Agent> {
    @PersistenceContext(unitName = "GestOil-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgentFacade() {
        super(Agent.class);
    }
    
     public List<Agent> listAgents() {
        try {
            return em.createNamedQuery("Agent.findAll").getResultList();
        } catch (Throwable th) {
            throw new GestoilException(th, 1);
        }
    }



    
    public void deleteAgent(Agent agent) {
        try {
            em.remove(em.merge(agent));
        } catch (Throwable th) {
            throw new GestoilException(th, 6);
        }
    }

}
