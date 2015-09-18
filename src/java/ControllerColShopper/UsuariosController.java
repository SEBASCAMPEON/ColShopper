package ControllerColShopper;


import ModeloColShopper.Ciudad;
import ModeloColShopper.Departamentos;
import ModeloColShopper.Roles;
import ModeloColShopper.TipoDocumento;
import ModeloColShopper.UsuarioEmpresa;
import SessionColShopper.UsuarioEmpresaSession;
import java.io.Serializable;
import java.util.List;
import java.util.StringTokenizer;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class UsuariosController implements Serializable {

    @EJB //Enterprise Java Beans
    private UsuarioEmpresaSession usuariosSession;

    private UsuarioEmpresa currentUsuarios;
    private int idCiudad;
    private int idDepartamento;
    private String ciudad;
    private List<Roles> listaRoles;
    private int idTipoDocumento;
    private List<UsuarioEmpresa> itemsUsuarios = null;

    public UsuariosController() {
    }

    public UsuarioEmpresa getCurrentUsuarios() {
        if (currentUsuarios == null) {
            currentUsuarios = new UsuarioEmpresa();
        }
        return currentUsuarios;
    }

    public void setCurrentUsuarios(UsuarioEmpresa currentUsuarios) {
        this.currentUsuarios = currentUsuarios;
    }
    
  public String getCiudad() {
        return idCiudad + "," + idDepartamento;
    }

    public void setCiudad(String ciudad) {
        StringTokenizer tokens = new StringTokenizer(ciudad, ",");
        idCiudad = Integer.parseInt(tokens.nextToken());
        idDepartamento = Integer.parseInt(tokens.nextToken());
    }

    public UsuarioEmpresaSession getUsuarioEmpresaSession() {
        return usuariosSession;
    }

    public List<UsuarioEmpresa> getItemsUsuarios() {
        if (itemsUsuarios == null) {
            try {
                itemsUsuarios = getUsuarioEmpresaSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsUsuarios;
    }

    public void create() {
        try {
            currentUsuarios.setCiudad(new Ciudad(idCiudad, new Departamentos(idDepartamento)));
            /*currentUsuarios.setIdRoles(listaRoles);*/
            currentUsuarios.setIdTipoDocumento(new TipoDocumento(idTipoDocumento));
            getUsuarioEmpresaSession().create(currentUsuarios);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public List<Roles> getListaRoles() {
        return listaRoles;
    }

    public void setListaRoles(List<Roles> listaRoles) {
        this.listaRoles = listaRoles;
    }



    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

  

}
