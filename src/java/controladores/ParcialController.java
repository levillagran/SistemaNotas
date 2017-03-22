package controladores;

import controladores.util.MobilePageController;
import modelo.Parcial;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "parcialController")
@ViewScoped
public class ParcialController extends AbstractController<Parcial> {

    @Inject
    private MobilePageController mobilePageController;

    public ParcialController() {
        // Inform the Abstract parent controller of the concrete Parcial Entity
        super(Parcial.class);
    }

    /**
     * Sets the "items" attribute with a collection of Calificaciones entities
     * that are retrieved from Parcial?cap_first and returns the navigation
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
