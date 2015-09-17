package ModeloColShopper;

import Controllers.util.JsfUtil;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Basic;

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

import javax.persistence.Table;
import static javax.swing.text.StyleConstants.Size;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USUARIOS_EMPRESA")
public class UsuarioEmpresa implements Serializable {

    @Id
    @Column(name = "id_usuario_empres")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuarioEmpresa;

    @Column(name = "numero_documento")
    @Size(min = 1, max = 30)
    @Basic(optional = false)
    private String numeroDoc;

    @Column(name = "nombre_usuario")
    @Size(min = 1, max = 20)
    @Basic(optional = false)
    private String nombreUsuario;

    @Column(name = "apellidos_usuario")
    @Size(min = 1, max = 20)
    @Basic(optional = false)
    private String apellidoUser;

    @Size(min = 1, max = 15)
    @Basic(optional = false)
    private String telefono;

    @Size(min = 1, max = 30)
    @Basic(optional = false)
    private String direccion;

    @Size(min = 1, max = 30)
    @Basic(optional = false)
    private String email;

    @Basic(optional = false)
    private char sexo;

    @Size(min = 1, max = 30)
    @Basic(optional = false)
    private String password;

    @Column(name = "razonsocial")
    @Size(min = 1, max = 15)
    @Basic(optional = false)
    private String razonSocial;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "id_ciudad", referencedColumnName = "id_ciudad"),
        @JoinColumn(name = "id_departamento", referencedColumnName = "id_departamento")
    })
    private Ciudad ciudad;

    @ManyToMany
    @JoinTable(name = "ROLES_USUARIOS",
            joinColumns = @JoinColumn(name = "id_usuario_empres",
                    referencedColumnName = "id_usuario_empres"),
            inverseJoinColumns = @JoinColumn(name = "id_roles",
                    referencedColumnName = "id_roles"))

    private List<Roles> idRoles;//preguntar

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento idTipoDocumento;

    public UsuarioEmpresa() {
    }

    public UsuarioEmpresa(long idUsuarioEmpresa) {
        this.idUsuarioEmpresa = idUsuarioEmpresa;
    }

    public long getIdUsuarioEmpresa() {
        return idUsuarioEmpresa;
    }

    public void setIdUsuarioEmpresa(long idUsuarioEmpresa) {
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
        try {
            this.password = JsfUtil.generateDigest(password);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad Ciudad) {
        this.ciudad = Ciudad;
    }

    public List<Roles> getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(List<Roles> idRoles) {
        this.idRoles = idRoles;
    }

    public TipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

}
