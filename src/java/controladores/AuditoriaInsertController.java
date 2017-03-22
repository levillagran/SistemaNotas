package controladores;

import controladores.util.MobilePageController;
import modelo.AuditoriaInsert;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "auditoriaInsertController")
@ViewScoped
public class AuditoriaInsertController extends AbstractController<AuditoriaInsert> {

    @Inject
    private MobilePageController mobilePageController;

    public AuditoriaInsertController() {
        // Inform the Abstract parent controller of the concrete AuditoriaInsert Entity
        super(AuditoriaInsert.class);
    }

}
