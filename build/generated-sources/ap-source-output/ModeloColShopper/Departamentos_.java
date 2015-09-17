package ModeloColShopper;

import ModeloColShopper.Ciudad;
import ModeloColShopper.Pais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-15T17:58:12")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, Integer> idDepartamento;
    public static volatile SingularAttribute<Departamentos, String> nombreDepartamento;
    public static volatile SingularAttribute<Departamentos, Pais> idPais;
    public static volatile ListAttribute<Departamentos, Ciudad> ciudad;

}