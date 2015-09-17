/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerColShopper;

import ModeloColShopper.TipoDocumento;
import SessionColShopper.TipoDocumentoSession;
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
public class TipoDocumentoController implements Serializable {

    @EJB //Enterprise Java Beans
    private TipoDocumentoSession tipoDocumentoSession;

    private TipoDocumento currentTipoDocumento;
    private List<TipoDocumento> itemsTipoDocumento = null;

    public TipoDocumentoController() {
    }

    public TipoDocumento getCurrentTipoDocumento() {
        if (currentTipoDocumento == null) {
            currentTipoDocumento = new TipoDocumento();
        }
        return currentTipoDocumento;
    }

    public void setCurrentTipoDocumento(TipoDocumento currentTipoDocumento) {
        this.currentTipoDocumento = currentTipoDocumento;
    }

    public TipoDocumentoSession getTipoDocumentoSession() {
        return tipoDocumentoSession;
    }

    public List<TipoDocumento> getItemsTipoDocumento() {
        if (itemsTipoDocumento == null) {
            try {
                itemsTipoDocumento = getTipoDocumentoSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsTipoDocumento;
    }

    public void create() {
        try {
            getTipoDocumentoSession().create(currentTipoDocumento);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
