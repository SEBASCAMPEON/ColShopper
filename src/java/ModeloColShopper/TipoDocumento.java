/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloColShopper;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_DOCUMENTO")
public class TipoDocumento {

    @Id
    @Column(name = "id_tipo_documento")
    private int idTipoDocumento;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "idTipoDocumento")
    private List<UsuarioEmpresa> usuarioEmpresa;

    public TipoDocumento() {
    }

    public TipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    public List<UsuarioEmpresa> getUsuarioEmpresa() {
        return usuarioEmpresa;
    }

    public void setUsuarioEmpresa(List<UsuarioEmpresa> usuarioEmpresa) {
        this.usuarioEmpresa = usuarioEmpresa;
    }

}
