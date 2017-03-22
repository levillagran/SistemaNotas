/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Parcial;

/**
 *
 * @author Lenin
 */
@Stateless
public class ParcialFacade extends AbstractFacade<Parcial> {

    @PersistenceContext(unitName = "SistemaNotasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParcialFacade() {
        super(Parcial.class);
    }
    
}