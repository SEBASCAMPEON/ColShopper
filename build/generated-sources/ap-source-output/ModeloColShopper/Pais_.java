package ModeloColShopper;

import ModeloColShopper.Departamentos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-15T17:58:12")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile SingularAttribute<Pais, Integer> idPais;
    public static volatile ListAttribute<Pais, Departamentos> departamento;
    public static volatile SingularAttribute<Pais, String> nombrePais;

}