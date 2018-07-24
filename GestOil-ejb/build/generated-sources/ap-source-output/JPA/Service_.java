package JPA;

import JPA.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-21T18:41:07")
@StaticMetamodel(Service.class)
public class Service_ { 

    public static volatile SingularAttribute<Service, Station> stationCode;
    public static volatile SingularAttribute<Service, String> code;
    public static volatile SingularAttribute<Service, String> responsable;
    public static volatile SingularAttribute<Service, Double> montant;
    public static volatile SingularAttribute<Service, String> nom;
    public static volatile SingularAttribute<Service, Integer> nombre;

}