/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Paralelo;

/**
 *
 * @author Lenin
 */
@Stateless
public class ParaleloFacade extends AbstractFacade<Paralelo> {

    @PersistenceContext(unitName = "SistemaNotasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParaleloFacade() {
        super(Paralelo.class);
    }
    
}
