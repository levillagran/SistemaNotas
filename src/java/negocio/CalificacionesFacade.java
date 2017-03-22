/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Calificaciones;

/**
 *
 * @author Lenin
 */
@Stateless
public class CalificacionesFacade extends AbstractFacade<Calificaciones> {

    @PersistenceContext(unitName = "SistemaNotasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalificacionesFacade() {
        super(Calificaciones.class);
    }
    
}
