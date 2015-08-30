package ModeloColShopper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.mail.FetchProfile.Item;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS_EMPRESA")
public class UsuarioEmpresa implements Serializable {

    @Id
    @Column(name = "id_usuario_empres")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarioEmpresa;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "apellidos_usuario")
    private String apellidoUser;

    private String telefono;

    private String direccion;

    private String email;

    private char sexo;

    private String password;

    private String razonSocial;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "id_ciudad", referencedColumnName = "id_ciudad"),
        @JoinColumn(name = "id_departamento", referencedColumnName = "id_departamento")
    })
    private Ciudad idCiudad;

    @ManyToMany
    @JoinTable(name = "ROLES_USUARIOS",
            joinColumns = @JoinColumn(name = "id_usuario_empres",
                    referencedColumnName = "id_usuario_empres"),
            inverseJoinColumns = @JoinColumn(name = "id_roles",
                    referencedColumnName = "id_roles"))
    private Collection<Roles> idRoles;

    
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento idTipoDocumento;

    public UsuarioEmpresa() {
    }

    public UsuarioEmpresa(int idUsuarioEmpresa) {
        this.idUsuarioEmpresa = idUsuarioEmpresa;
    }

    public int getIdUsuarioEmpresa() {
        return idUsuarioEmpresa;
    }

    public void setIdUsuarioEmpresa(int idUsuarioEmpresa) {
        this.idUsuarioEmpresa = idUsuarioEmpresa;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUser() {
        return apellidoUser;
    }

    public void setApellidoUser(String apellidoUser) {
        this.apellidoUser = apellidoUser;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Ciudad getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Ciudad idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Collection<Roles> getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(Collection<Roles> idRoles) {
        this.idRoles = idRoles;
    }

    public TipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

}
