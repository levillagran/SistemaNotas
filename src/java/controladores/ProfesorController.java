package controladores;

import controladores.util.MobilePageController;
import modelo.Profesor;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "profesorController")
@ViewScoped
public class ProfesorController extends AbstractController<Profesor> {

    @Inject
    private MobilePageController mobilePageController;

    public ProfesorController() {
        // Inform the Abstract parent controller of the concrete Profesor Entity
        super(Profesor.class);
    }

    /**
     * Sets the "items" attribute with a collection of Usuarios entities that
     * are retrieved from Profesor?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Usuarios page
     */
    public String navigateUsuariosCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Usuarios_items", this.getSelected().getUsuariosCollection());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/paginasJSP/usuarios/index";
    }

    /**
     * Sets the "items" attribute with a collection of Calificaciones entities
     * that are retrieved from Profesor?cap_first and returns the navigation
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
