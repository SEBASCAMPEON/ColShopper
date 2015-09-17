/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerColShopper;


import ModeloColShopper.Roles;
import SessionColShopper.RolesSession;
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
public class RolesController implements Serializable {

   @EJB //Enterprise Java Beans
   private RolesSession rolesSession;
   
   private Roles currentRoles;
   private List<Roles> itemsRoles = null;
   
   
    public RolesController() {
    }

    public Roles getCurrentRoles() {
        if (currentRoles == null) {
            currentRoles = new Roles();
        }
        return currentRoles;
    }

    public void setCurrentRoles(Roles currentRoles) {
        this.currentRoles = currentRoles;
    }

    public RolesSession getRolesSession() {
        return rolesSession;
    }

    public List<Roles> getItemsRoles() {
        if (itemsRoles == null) {
            try {
                itemsRoles = getRolesSession().findAll();
            } catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        }
        return itemsRoles;
    }    
        public void create(){
            try {
                getRolesSession().create(currentRoles);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    
    
    
    
}
