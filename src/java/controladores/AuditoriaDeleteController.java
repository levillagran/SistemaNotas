package controladores;

import controladores.util.MobilePageController;
import modelo.AuditoriaDelete;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "auditoriaDeleteController")
@ViewScoped
public class AuditoriaDeleteController extends AbstractController<AuditoriaDelete> {

    @Inject
    private MobilePageController mobilePageController;

    public AuditoriaDeleteController() {
        // Inform the Abstract parent controller of the concrete AuditoriaDelete Entity
        super(AuditoriaDelete.class);
    }

}
