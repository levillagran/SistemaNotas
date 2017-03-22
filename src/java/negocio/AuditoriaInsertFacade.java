/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.AuditoriaInsert;

/**
 *
 * @author Lenin
 */
@Stateless
public class AuditoriaInsertFacade extends AbstractFacade<AuditoriaInsert> {

    @PersistenceContext(unitName = "SistemaNotasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuditoriaInsertFacade() {
        super(AuditoriaInsert.class);
    }
    
}
