package controladores;

import controladores.util.MobilePageController;
import modelo.Usuarios;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "usuariosController")
@ViewScoped
public class UsuariosController extends AbstractController<Usuarios> {

    @Inject
    private EstudianteController estudianteIdEstudianteController;
    @Inject
    private ProfesorController profesorIdProfesorController;
    @Inject
    private MobilePageController mobilePageController;

    public UsuariosController() {
        // Inform the Abstract parent controller of the concrete Usuarios Entity
        super(Usuarios.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        estudianteIdEstudianteController.setSelected(null);
        profesorIdProfesorController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Estudiante controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareEstudianteIdEstudiante(ActionEvent event) {
        if (this.getSelected() != null && estudianteIdEstudianteController.getSelected() == null) {
            estudianteIdEstudianteController.setSelected(this.getSelected().getEstudianteIdEstudiante());
        }
    }

    /**
     * Sets the "selected" attribute of the Profesor controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareProfesorIdProfesor(ActionEvent event) {
        if (this.getSelected() != null && profesorIdProfesorController.getSelected() == null) {
            profesorIdProfesorController.setSelected(this.getSelected().getProfesorIdProfesor());
        }
    }
}
