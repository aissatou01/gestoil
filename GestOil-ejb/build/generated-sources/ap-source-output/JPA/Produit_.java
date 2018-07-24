package JPA;

import JPA.Categorieproduit;
import JPA.Station;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-21T18:41:07")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, Station> stationCode;
    public static volatile SingularAttribute<Produit, Double> indexarrive;
    public static volatile SingularAttribute<Produit, String> code;
    public static volatile SingularAttribute<Produit, String> responsable;
    public static volatile SingularAttribute<Produit, Double> indexdepart;
    public static volatile SingularAttribute<Produit, Date> dateajout;
    public static volatile SingularAttribute<Produit, Double> montant;
    public static volatile SingularAttribute<Produit, Double> quantite;
    public static volatile ListAttribute<Produit, Categorieproduit> categorieproduitList;

}