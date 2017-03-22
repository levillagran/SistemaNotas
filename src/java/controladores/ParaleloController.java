package controladores;

import controladores.util.MobilePageController;
import modelo.Paralelo;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "paraleloController")
@ViewScoped
public class ParaleloController extends AbstractController<Paralelo> {

    @Inject
    private MobilePageController mobilePageController;

    public ParaleloController() {
        // Inform the Abstract parent controller of the concrete Paralelo Entity
        super(Paralelo.class);
    }

    /**
     * Sets the "items" attribute with a collection of Calificaciones entities
     * that are retrieved from Paralelo?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Calificaciones page
     */
    public String navigateCalificacionesCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Calificaciones_items", this.getSelected().getCalificacionesCollection());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/paginasJSP/calificaciones/index";
    }

}
