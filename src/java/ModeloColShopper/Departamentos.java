package ModeloColShopper;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTAMENTO")
public class Departamentos implements Serializable {

    @Id
    @Column(name = "id_departamento")
    private int idDepartamento;

    @Column(name = "nombre_departamento")
    private String nombreDepartamento;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais idPais;/*Llave foranea de Pais*/

    @OneToMany(mappedBy = "idDepartamento")
    private List<Ciudad> ciudad;

    public Departamentos() {
    }

    public Departamentos(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Pais getIdPais() {
        return idPais;
    }

    public void setIdPais(Pais idPais) {
        this.idPais = idPais;
    }

    public List<Ciudad> getCiudad() {
        return ciudad;
    }

    public void setCiudad(List<Ciudad> ciudad) {
        this.ciudad = ciudad;
    }

}
