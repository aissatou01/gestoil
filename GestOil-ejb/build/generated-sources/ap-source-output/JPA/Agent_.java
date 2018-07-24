package JPA;

import JPA.Roleagent;
import JPA.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-21T18:41:07")
@StaticMetamodel(Agent.class)
public class Agent_ { 

    public static volatile SingularAttribute<Agent, Station> stationCode;
    public static volatile SingularAttribute<Agent, String> code;
    public static volatile SingularAttribute<Agent, Roleagent> roleagentCode;
    public static volatile SingularAttribute<Agent, String> telephone;
    public static volatile SingularAttribute<Agent, String> nom;
    public static volatile SingularAttribute<Agent, String> prenom;
    public static volatile SingularAttribute<Agent, String> email;

}