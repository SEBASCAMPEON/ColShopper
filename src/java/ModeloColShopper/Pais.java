package ModeloColShopper;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PAIS")
public class Pais implements Serializable {

    @Id
    @Column(name = "id_pais")
    private int idPais;

    @Column(name = "nombre_pais")
    private String nombrePais;

    @OneToMany(mappedBy = "idPais")
    private List<Departamentos> departamento;

    public Pais() {
    }

    public Pais(int idPais) {
        this.idPais = idPais;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public List<Departamentos> getDepartamento() {
        return departamento;
    }

    public void setDepartamento(List<Departamentos> departamento) {
        this.departamento = departamento;
    }

}
