/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionColShopper;

import ModeloColShopper.Roles;
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
public class RolesSession {
@PersistenceContext
    private EntityManager entityManager;

    public void create(Roles roles) {
        entityManager.persist(roles);
    }

    public void edit(Roles roles) {
        entityManager.merge(roles);
    }

    public void remove(Roles roles) {
        entityManager.remove(roles);
    }

    public List<Roles> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Roles.class));
        return entityManager.createQuery (cq).getResultList();
    }
}