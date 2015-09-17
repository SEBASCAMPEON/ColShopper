package ModeloColShopper;

import ModeloColShopper.Departamentos;
import ModeloColShopper.UsuarioEmpresa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-15T17:58:12")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile SingularAttribute<Ciudad, Departamentos> idDepartamento;
    public static volatile SingularAttribute<Ciudad, String> nombreCiudad;
    public static volatile ListAttribute<Ciudad, UsuarioEmpresa> usuarioEmpresa;
    public static volatile SingularAttribute<Ciudad, Integer> idCiudad;

}