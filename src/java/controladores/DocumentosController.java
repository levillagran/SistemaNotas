package controladores;

import controladores.util.MobilePageController;
import modelo.Documentos;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "documentosController")
@ViewScoped
public class DocumentosController extends AbstractController<Documentos> {

    @Inject
    private MobilePageController mobilePageController;

    public DocumentosController() {
        // Inform the Abstract parent controller of the concrete Documentos Entity
        super(Documentos.class);
    }

    /**
     * Sets the "items" attribute with a collection of Estudiante entities that
     * are retrieved from Documentos?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Estudiante page
     */
    public String navigateEstudianteCollection() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Estudiante_items", this.getSelected().getEstudianteCollection());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/paginasJSP/estudiante/index";
    }

}
