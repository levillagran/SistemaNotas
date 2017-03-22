package controladores;

import controladores.util.MobilePageController;
import modelo.Asignaturas;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "asignaturasController")
@ViewScoped
public class AsignaturasController extends AbstractController<Asignaturas> {

    @Inject
    private MobilePageController mobilePageController;

    public AsignaturasController() {
        // Inform the Abstract parent controller of the concrete Asignaturas Entity
        super(Asignaturas.class);
    }

    /**
     * Sets the "items" attribute with a collection of Calificaciones entities
     * that are retrieved from Asignaturas?cap_first and returns the navigation
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
