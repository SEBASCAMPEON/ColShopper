/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionColShopper;

import ModeloColShopper.Pais;
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
public class PaisSession {
@PersistenceContext
    private EntityManager entityManager;
    
    public void create(Pais pais) {
        entityManager.persist(pais);
    }
    
    private void edit (Pais pais){
        entityManager.merge(pais);
    }
    private void remove (Pais paises){
        entityManager.remove(paises);
    }
    
    public List<Pais> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Pais.class));
        return entityManager.createQuery (cq).getResultList();
    }
}
