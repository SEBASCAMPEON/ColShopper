



package ControllerColShopper;



import ModeloColShopper.Ciudad;
import ModeloColShopper.Departamentos;
import SessionColShopper.CiudadSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;





@Named
@ViewScoped
public class CiudadController implements Serializable {

   @EJB //Enterprise Java Beans
   private CiudadSession ciudadSession;
   
   private Ciudad currentCiudad;
   private int idDepartamento;
   private List<Ciudad> itemsCiudad = null;
   
   
    public CiudadController() {
    }

    public Ciudad getCurrentCiudad() {
        if (currentCiudad == null) {
            currentCiudad = new Ciudad();
        }
        return currentCiudad;
    }

    public void setCurrentCiudad(Ciudad currentCiudad) {
        this.currentCiudad = currentCiudad;
    }

    public CiudadSession getCiudadSession() {
        return ciudadSession;
    }

    public List<Ciudad> getItemsCiudad() {
        if (itemsCiudad == null) {
            try {
                itemsCiudad = getCiudadSession().findAll();
            } catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        }
        return itemsCiudad;
    }    
        public void create(){
            try {
                currentCiudad.setIdDepartamento(new Departamentos(idDepartamento));
                getCiudadSession().create(currentCiudad);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

        

        
    
    
    
    
}
