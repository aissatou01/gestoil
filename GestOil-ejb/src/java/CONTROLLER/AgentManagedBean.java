/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import JPA.Agent;
import JPA.Roleagent;
import JPA.Station;
import SESSION.AgentFacade;
import SESSION.RoleagentFacade;
import SESSION.StationFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author aissatou
 */
@ManagedBean
@SessionScoped
public class AgentManagedBean {
    
    @EJB
    private AgentFacade agentFacade;
    @EJB
    private RoleagentFacade roleFacade;
    @EJB
    private StationFacade stationFacade;
    
    private Agent agent = new Agent();
    private List<Agent> agents = new ArrayList<Agent>();
    private String code;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private Station stationCode;
    private Roleagent roleagentCode;
    
    public String AJouterAgent() {
        agent.setCode(code);
        agent.setNom(nom);
        agent.setPrenom(prenom);
        agent.setTelephone(telephone);
        agent.setEmail(email);
        agent.setRoleagentCode(roleFacade.find(roleagentCode.getCode()));
        agent.setStationCode(stationFacade.find(stationCode.getCode()));
        agentFacade.create(agent);
        agents = agentFacade.listAgents();
        return " ";
    }
    
}
