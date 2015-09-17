/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerColShopper;




import ModeloColShopper.Pais;
import SessionColShopper.PaisSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author USUARIO1
 */
@Named
@ViewScoped
public class PaisController implements Serializable {

   @EJB //Enterprise Java Beans
   private PaisSession paisSession;
   
   private Pais currentPais;
   private List<Pais> itemsPais = null;
   
   
    public PaisController() {
    }

    public Pais getCurrentPais() {
        if (currentPais == null) {
            currentPais = new Pais();
        }
        return currentPais;
    }

    public void setCurrentPais(Pais currentPais) {
        this.currentPais = currentPais;
    }

    public PaisSession getPaisSession() {
        return paisSession;
    }

    public List<Pais> getItemsPais() {
        if (itemsPais == null) {
            try {
                itemsPais = getPaisSession().findAll();
            } catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        }
        return itemsPais;
    }    
        public void create(){
            try {
                getPaisSession().create(currentPais);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    
    
    
    
}
