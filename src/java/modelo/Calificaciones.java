/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenin
 */
@Entity
@Table(name = "calificaciones", catalog = "colegiojjc2", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_calificaciones"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calificaciones.findAll", query = "SELECT c FROM Calificaciones c"),
    @NamedQuery(name = "Calificaciones.findByIdCalificaciones", query = "SELECT c FROM Calificaciones c WHERE c.idCalificaciones = :idCalificaciones"),
    @NamedQuery(name = "Calificaciones.findByTrabajos", query = "SELECT c FROM Calificaciones c WHERE c.trabajos = :trabajos"),
    @NamedQuery(name = "Calificaciones.findByActuacionIndividual", query = "SELECT c FROM Calificaciones c WHERE c.actuacionIndividual = :actuacionIndividual"),
    @NamedQuery(name = "Calificaciones.findByActividadGrupo", query = "SELECT c FROM Calificaciones c WHERE c.actividadGrupo = :actividadGrupo"),
    @NamedQuery(name = "Calificaciones.findByLecciones", query = "SELECT c FROM Calificaciones c WHERE c.lecciones = :lecciones"),
    @NamedQuery(name = "Calificaciones.findBySuma", query = "SELECT c FROM Calificaciones c WHERE c.suma = :suma"),
    @NamedQuery(name = "Calificaciones.findByFinal1", query = "SELECT c FROM Calificaciones c WHERE c.final1 = :final1")})
public class Calificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_calificaciones", nullable = false)
    private Integer idCalificaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trabajos", nullable = false)
    private float trabajos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actuacion_individual", nullable = false)
    private float actuacionIndividual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actividad_grupo", nullable = false)
    private float actividadGrupo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lecciones", nullable = false)
    private float lecciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "suma", nullable = false)
    private float suma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "final", nullable = false)
    private float final1;
    @JoinColumn(name = "parcial_id_parcial", referencedColumnName = "id_parcial", nullable = false)
    @ManyToOne(optional = false)
    private Parcial parcialIdParcial;
    @JoinColumn(name = "curso_id_curso", referencedColumnName = "id_curso", nullable = false)
    @ManyToOne(optional = false)
    private Curso cursoIdCurso;
    @JoinColumn(name = "paralelo_id_paralelo", referencedColumnName = "id_paralelo", nullable = false)
    @ManyToOne(optional = false)
    private Paralelo paraleloIdParalelo;
    @JoinColumn(name = "periodo_id_periodo", referencedColumnName = "id_periodo", nullable = false)
    @ManyToOne(optional = false)
    private Periodo periodoIdPeriodo;
    @JoinColumn(name = "profesor_id_profesor", referencedColumnName = "id_profesor", nullable = false)
    @ManyToOne(optional = false)
    private Profesor profesorIdProfesor;
    @JoinColumn(name = "asignatura_id_asignatura", referencedColumnName = "id_asignatura", nullable = false)
    @ManyToOne(optional = false)
    private Asignaturas asignaturaIdAsignatura;
    @JoinColumn(name = "estudiante_id_estudiante", referencedColumnName = "id_estudiante", nullable = false)
    @ManyToOne(optional = false)
    private Estudiante estudianteIdEstudiante;

    public Calificaciones() {
    }

    public Calificaciones(Integer idCalificaciones) {
        this.idCalificaciones = idCalificaciones;
    }

    public Calificaciones(Integer idCalificaciones, float trabajos, float actuacionIndividual, float actividadGrupo, float lecciones, float suma, float final1) {
        this.idCalificaciones = idCalificaciones;
        this.trabajos = trabajos;
        this.actuacionIndividual = actuacionIndividual;
        this.actividadGrupo = actividadGrupo;
        this.lecciones = lecciones;
        this.suma = suma;
        this.final1 = final1;
    }

    public Integer getIdCalificaciones() {
        return idCalificaciones;
    }

    public void setIdCalificaciones(Integer idCalificaciones) {
        this.idCalificaciones = idCalificaciones;
    }

    public float getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(float trabajos) {
        this.trabajos = trabajos;
    }

    public float getActuacionIndividual() {
        return actuacionIndividual;
    }

    public void setActuacionIndividual(float actuacionIndividual) {
        this.actuacionIndividual = actuacionIndividual;
    }

    public float getActividadGrupo() {
        return actividadGrupo;
    }

    public void setActividadGrupo(float actividadGrupo) {
        this.actividadGrupo = actividadGrupo;
    }

    public float getLecciones() {
        return lecciones;
    }

    public void setLecciones(float lecciones) {
        this.lecciones = lecciones;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public float getFinal1() {
        return final1;
    }

    public void setFinal1(float final1) {
        this.final1 = final1;
    }

    public Parcial getParcialIdParcial() {
        return parcialIdParcial;
    }

    public void setParcialIdParcial(Parcial parcialIdParcial) {
        this.parcialIdParcial = parcialIdParcial;
    }

    public Curso getCursoIdCurso() {
        return cursoIdCurso;
    }

    public void setCursoIdCurso(Curso cursoIdCurso) {
        this.cursoIdCurso = cursoIdCurso;
    }

    public Paralelo getParaleloIdParalelo() {
        return paraleloIdParalelo;
    }

    public void setParaleloIdParalelo(Paralelo paraleloIdParalelo) {
        this.paraleloIdParalelo = paraleloIdParalelo;
    }

    public Periodo getPeriodoIdPeriodo() {
        return periodoIdPeriodo;
    }

    public void setPeriodoIdPeriodo(Periodo periodoIdPeriodo) {
        this.periodoIdPeriodo = periodoIdPeriodo;
    }

    public Profesor getProfesorIdProfesor() {
        return profesorIdProfesor;
    }

    public void setProfesorIdProfesor(Profesor profesorIdProfesor) {
        this.profesorIdProfesor = profesorIdProfesor;
    }

    public Asignaturas getAsignaturaIdAsignatura() {
        return asignaturaIdAsignatura;
    }

    public void setAsignaturaIdAsignatura(Asignaturas asignaturaIdAsignatura) {
        this.asignaturaIdAsignatura = asignaturaIdAsignatura;
    }

    public Estudiante getEstudianteIdEstudiante() {
        return estudianteIdEstudiante;
    }

    public void setEstudianteIdEstudiante(Estudiante estudianteIdEstudiante) {
        this.estudianteIdEstudiante = estudianteIdEstudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCalificaciones != null ? idCalificaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calificaciones)) {
            return false;
        }
        Calificaciones other = (Calificaciones) object;
        if ((this.idCalificaciones == null && other.idCalificaciones != null) || (this.idCalificaciones != null && !this.idCalificaciones.equals(other.idCalificaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Calificaciones[ idCalificaciones=" + idCalificaciones + " ]";
    }
    
}
