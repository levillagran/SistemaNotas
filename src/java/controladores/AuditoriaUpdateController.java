package controladores;

import controladores.util.MobilePageController;
import modelo.AuditoriaUpdate;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "auditoriaUpdateController")
@ViewScoped
public class AuditoriaUpdateController extends AbstractController<AuditoriaUpdate> {

    @Inject
    private MobilePageController mobilePageController;

    public AuditoriaUpdateController() {
        // Inform the Abstract parent controller of the concrete AuditoriaUpdate Entity
        super(AuditoriaUpdate.class);
    }

}
