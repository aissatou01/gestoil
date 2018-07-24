package JPA;

import JPA.Agent;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-21T18:41:07")
@StaticMetamodel(Roleagent.class)
public class Roleagent_ { 

    public static volatile SingularAttribute<Roleagent, String> code;
    public static volatile SingularAttribute<Roleagent, String> description;
    public static volatile ListAttribute<Roleagent, Agent> agentList;

}