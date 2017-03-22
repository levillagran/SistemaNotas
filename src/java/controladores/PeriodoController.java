package controladores;

import controladores.util.MobilePageController;
import modelo.Periodo;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "periodoController")
@ViewScoped
public class PeriodoController extends AbstractController<Periodo> {

    @Inject
    private MobilePageController mobilePageController;

    public PeriodoController() {
        // Inform the Abstract parent controller of the concrete Periodo Entity
        super(Periodo.class);
    }

    /**
     * Sets the "items" attribute with a collection of Calificaciones entities
     * that are retrieved from Periodo?cap_first and returns the navigation
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
