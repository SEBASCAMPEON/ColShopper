/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionColShopper;

import ModeloColShopper.Departamentos;
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
public class DepartamentosSession {
@PersistenceContext
    private EntityManager entityManager;

    public void create(Departamentos departamentos) {
        entityManager.persist(departamentos);
    }

    public void edit(Departamentos departamentos) {
        entityManager.merge(departamentos);
    }

    public void remove(Departamentos departamentos) {
        entityManager.remove(departamentos);
    }

    public List<Departamentos> findAll() {
        CriteriaQuery cq
                = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Departamentos.class));
        return entityManager.createQuery(cq).getResultList();
    }
}