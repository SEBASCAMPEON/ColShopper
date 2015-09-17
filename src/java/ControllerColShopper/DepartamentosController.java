



package ControllerColShopper;




import ModeloColShopper.Departamentos;
import ModeloColShopper.Pais;
import SessionColShopper.DepartamentosSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;





@Named
@ViewScoped
public class DepartamentosController implements Serializable {

   @EJB //Enterprise Java Beans
   private DepartamentosSession departamentosSession;
   
   private Departamentos currentDepartamentos;
   private int idPais;
   private List<Departamentos> itemsDepartamentos = null;
   
   
    public DepartamentosController() {
    }

    public Departamentos getCurrentDepartamentos() {
        if (currentDepartamentos == null) {
            currentDepartamentos = new Departamentos();
        }
        return currentDepartamentos;
    }

    public void setCurrentDepartamentos(Departamentos currentDepartamentos) {
        this.currentDepartamentos = currentDepartamentos;
    }

    public DepartamentosSession getDepartamentosSession() {
        return departamentosSession;
    }

    public List<Departamentos> getItemsDepartamentos() {
        if (itemsDepartamentos == null) {
            try {
                itemsDepartamentos = getDepartamentosSession().findAll();
            } catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        }
        return itemsDepartamentos;
    }    
        public void create(){
            try {
                currentDepartamentos.setIdPais(new Pais(idPais));
                getDepartamentosSession().create(currentDepartamentos);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    
    
    
    
}
