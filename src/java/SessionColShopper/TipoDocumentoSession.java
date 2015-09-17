/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionColShopper;

import ModeloColShopper.Pais;
import ModeloColShopper.TipoDocumento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author adsi
 */
@Stateless
public class TipoDocumentoSession {
@PersistenceContext
    private EntityManager entityManager;
    
    public void create(TipoDocumento tipodocumento) {
        entityManager.persist(tipodocumento);
    }
    
    private void edit (TipoDocumento tipodocumento){
        entityManager.merge(tipodocumento);
    }
    private void remove (TipoDocumento tipodocumento){
        entityManager.remove(tipodocumento);
    }
    
    public List<TipoDocumento> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(TipoDocumento.class));
        return entityManager.createQuery (cq).getResultList();
    }
}
