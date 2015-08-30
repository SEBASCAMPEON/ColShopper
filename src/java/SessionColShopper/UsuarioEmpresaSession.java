/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionColShopper;

import ModeloColShopper.UsuarioEmpresa;
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
public class UsuarioEmpresaSession {
@PersistenceContext
    private EntityManager entityManager;

    public void create(UsuarioEmpresa usuarioEmpresa) {
        entityManager.persist(usuarioEmpresa);
    }

    public void edit(UsuarioEmpresa usuarioEmpresa) {
        entityManager.merge(usuarioEmpresa);
    }

    public void remove(UsuarioEmpresa usuarioEmpresa) {
        entityManager.remove(usuarioEmpresa);
    }

    public List<UsuarioEmpresa> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(UsuarioEmpresa.class));
        return entityManager.createQuery (cq).getResultList();
    }
}