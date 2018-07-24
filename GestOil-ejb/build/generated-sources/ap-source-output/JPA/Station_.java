package JPA;

import JPA.Agent;
import JPA.Produit;
import JPA.Service;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-21T18:41:07")
@StaticMetamodel(Station.class)
public class Station_ { 

    public static volatile SingularAttribute<Station, String> code;
    public static volatile ListAttribute<Station, Produit> produitList;
    public static volatile ListAttribute<Station, Service> serviceList;
    public static volatile SingularAttribute<Station, String> telephone;
    public static volatile ListAttribute<Station, Agent> agentList;
    public static volatile SingularAttribute<Station, String> type;
    public static volatile SingularAttribute<Station, String> nom;
    public static volatile SingularAttribute<Station, String> email;

}