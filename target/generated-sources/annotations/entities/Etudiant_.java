package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-26T02:57:01")
@StaticMetamodel(Etudiant.class)
public class Etudiant_ { 

    public static volatile SingularAttribute<Etudiant, String> classe;
    public static volatile SingularAttribute<Etudiant, String> matricul;
    public static volatile SingularAttribute<Etudiant, String> lieuNaiass;
    public static volatile SingularAttribute<Etudiant, Date> dateNaiss;
    public static volatile SingularAttribute<Etudiant, Integer> id;
    public static volatile SingularAttribute<Etudiant, String> nom;
    public static volatile SingularAttribute<Etudiant, String> prenom;

}