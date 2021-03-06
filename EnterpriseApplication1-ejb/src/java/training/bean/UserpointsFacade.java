/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import training.entity.Userpoints;

/**
 *
 * @author zr4mbo
 */
@Stateless
public class UserpointsFacade extends AbstractFacade<Userpoints> {

    @PersistenceContext(unitName = "EnterpriseApplication1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserpointsFacade() {
        super(Userpoints.class);
    }
    
}
