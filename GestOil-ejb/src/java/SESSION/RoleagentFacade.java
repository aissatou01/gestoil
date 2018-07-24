/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SESSION;

import JPA.Roleagent;
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
public class RoleagentFacade extends AbstractFacade<Roleagent> {
    @PersistenceContext(unitName = "GestOil-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RoleagentFacade() {
        super(Roleagent.class);
    }
    
    
     public List<Roleagent> listRolesagent() {
        try {
            return em.createNamedQuery("Roleagent.findAll").getResultList();
        } catch (Throwable th) {
            throw new GestoilException(th, 1);
        }
    }

    public Roleagent addRoleagent(String code, String description, Roleagent roleagentCode) {
        try {
            Roleagent Roleagent = new Roleagent();
            em.persist(Roleagent);
            return Roleagent;
        } catch (Throwable th) {
            throw new GestoilException(th, 5);
        }
    }

    
    public void deleteRoleagent(Roleagent roleagent) {
        try {
            em.remove(em.merge(roleagent));
        } catch (Throwable th) {
            throw new GestoilException(th, 6);
        }
    }

}
