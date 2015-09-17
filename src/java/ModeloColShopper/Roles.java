/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloColShopper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author adsi
 */
@Entity
@Table(name = "ROLES")
public class Roles implements Serializable {

    @Id
    @Column(name = "id_roles")
    private int idRol;

    @Column(name = "nombre_rol")
    private String nombreRol;

    @ManyToMany(mappedBy = "idRoles")
    private List<UsuarioEmpresa> usuarioempresa;

    public Roles() {
    }

    public Roles(int idRol) {
        this.idRol = idRol;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public List<UsuarioEmpresa> getUsuarioempresa() {
        return usuarioempresa;
    }

    public void setUsuarioempresa(List<UsuarioEmpresa> usuarioempresa) {
        this.usuarioempresa = usuarioempresa;
    }

   
}
