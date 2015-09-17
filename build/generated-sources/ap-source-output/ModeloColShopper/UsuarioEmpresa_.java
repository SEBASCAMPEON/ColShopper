package ModeloColShopper;

import ModeloColShopper.Ciudad;
import ModeloColShopper.Roles;
import ModeloColShopper.TipoDocumento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-15T17:58:11")
@StaticMetamodel(UsuarioEmpresa.class)
public class UsuarioEmpresa_ { 

    public static volatile SingularAttribute<UsuarioEmpresa, Long> idUsuarioEmpresa;
    public static volatile SingularAttribute<UsuarioEmpresa, String> apellidoUser;
    public static volatile SingularAttribute<UsuarioEmpresa, String> direccion;
    public static volatile ListAttribute<UsuarioEmpresa, Roles> idRoles;
    public static volatile SingularAttribute<UsuarioEmpresa, String> nombreUsuario;
    public static volatile SingularAttribute<UsuarioEmpresa, String> password;
    public static volatile SingularAttribute<UsuarioEmpresa, String> razonSocial;
    public static volatile SingularAttribute<UsuarioEmpresa, Ciudad> ciudad;
    public static volatile SingularAttribute<UsuarioEmpresa, String> numeroDoc;
    public static volatile SingularAttribute<UsuarioEmpresa, TipoDocumento> idTipoDocumento;
    public static volatile SingularAttribute<UsuarioEmpresa, String> telefono;
    public static volatile SingularAttribute<UsuarioEmpresa, Character> sexo;
    public static volatile SingularAttribute<UsuarioEmpresa, String> email;

}