package controladores;

import controladores.util.MobilePageController;
import modelo.Calificaciones;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "calificacionesController")
@ViewScoped
public class CalificacionesController extends AbstractController<Calificaciones> {

    @Inject
    private ParcialController parcialIdParcialController;
    @Inject
    private CursoController cursoIdCursoController;
    @Inject
    private ParaleloController paraleloIdParaleloController;
    @Inject
    private PeriodoController periodoIdPeriodoController;
    @Inject
    private ProfesorController profesorIdProfesorController;
    @Inject
    private AsignaturasController asignaturaIdAsignaturaController;
    @Inject
    private EstudianteController estudianteIdEstudianteController;
    @Inject
    private MobilePageController mobilePageController;

    public CalificacionesController() {
        // Inform the Abstract parent controller of the concrete Calificaciones Entity
        super(Calificaciones.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        parcialIdParcialController.setSelected(null);
        cursoIdCursoController.setSelected(null);
        paraleloIdParaleloController.setSelected(null);
        periodoIdPeriodoController.setSelected(null);
        profesorIdProfesorController.setSelected(null);
        asignaturaIdAsignaturaController.setSelected(null);
        estudianteIdEstudianteController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Parcial controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareParcialIdParcial(ActionEvent event) {
        if (this.getSelected() != null && parcialIdParcialController.getSelected() == null) {
            parcialIdParcialController.setSelected(this.getSelected().getParcialIdParcial());
        }
    }

    /**
     * Sets the "selected" attribute of the Curso controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCursoIdCurso(ActionEvent event) {
        if (this.getSelected() != null && cursoIdCursoController.getSelected() == null) {
            cursoIdCursoController.setSelected(this.getSelected().getCursoIdCurso());
        }
    }

    /**
     * Sets the "selected" attribute of the Paralelo controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareParaleloIdParalelo(ActionEvent event) {
        if (this.getSelected() != null && paraleloIdParaleloController.getSelected() == null) {
            paraleloIdParaleloController.setSelected(this.getSelected().getParaleloIdParalelo());
        }
    }

    /**
     * Sets the "selected" attribute of the Periodo controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePeriodoIdPeriodo(ActionEvent event) {
        if (this.getSelected() != null && periodoIdPeriodoController.getSelected() == null) {
            periodoIdPeriodoController.setSelected(this.getSelected().getPeriodoIdPeriodo());
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

    /**
     * Sets the "selected" attribute of the Asignaturas controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareAsignaturaIdAsignatura(ActionEvent event) {
        if (this.getSelected() != null && asignaturaIdAsignaturaController.getSelected() == null) {
            asignaturaIdAsignaturaController.setSelected(this.getSelected().getAsignaturaIdAsignatura());
        }
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
}
