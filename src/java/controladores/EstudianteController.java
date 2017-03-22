package controladores;

import controladores.util.MobilePageController;
import modelo.Estudiante;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "estudianteController")
@ViewScoped
public class EstudianteController extends AbstractController<Estudiante> {

    @Inject
    private DocumentosController documentosIdDocumentoController;
    @Inject
    private PadresTutoresController padresTutoresIdPadresTutoresController;
    @Inject
    private MobilePageController mobilePageController;

    public EstudianteController() {
        // Inform the Abstract parent controller of the concrete Estudiante Entity
        super(Estudiante.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        documentosIdDocumentoController.setSelected(null);
        padresTutoresIdPadresTutoresController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Documentos controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareDocumentosIdDocumento(ActionEvent event) {
        if (this.getSelected() != null && documentosIdDocumentoController.getSelected() == null) {
            documentosIdDocumentoController.setSelected(this.getSelected().getDocumentosIdDocumento());
        }
    }

    /**
     * Sets the "selected" attribute of the PadresTutores controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePadresTutoresIdPadresTutores(ActionEvent event) {
        if (this.getSelected() != null && padresTutoresIdPadresTutoresController.getSelected() == null) {
            padresTutoresIdPadresTutoresController.setSelected(this.getSelected().getPadresTutoresIdPadresTutores());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Usuarios entities that
     * are retrieved from Estudiante?cap_first and returns the navigation
     * outcome.
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
     * that are retrieved from Estudiante?cap_first and returns the navigation
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
