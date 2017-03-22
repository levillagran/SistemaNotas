package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Asignaturas;
import modelo.Curso;
import modelo.Estudiante;
import modelo.Paralelo;
import modelo.Parcial;
import modelo.Periodo;
import modelo.Profesor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(Calificaciones.class)
public class Calificaciones_ { 

    public static volatile SingularAttribute<Calificaciones, Integer> idCalificaciones;
    public static volatile SingularAttribute<Calificaciones, Float> suma;
    public static volatile SingularAttribute<Calificaciones, Float> actuacionIndividual;
    public static volatile SingularAttribute<Calificaciones, Asignaturas> asignaturaIdAsignatura;
    public static volatile SingularAttribute<Calificaciones, Profesor> profesorIdProfesor;
    public static volatile SingularAttribute<Calificaciones, Estudiante> estudianteIdEstudiante;
    public static volatile SingularAttribute<Calificaciones, Float> trabajos;
    public static volatile SingularAttribute<Calificaciones, Paralelo> paraleloIdParalelo;
    public static volatile SingularAttribute<Calificaciones, Float> actividadGrupo;
    public static volatile SingularAttribute<Calificaciones, Parcial> parcialIdParcial;
    public static volatile SingularAttribute<Calificaciones, Periodo> periodoIdPeriodo;
    public static volatile SingularAttribute<Calificaciones, Float> final1;
    public static volatile SingularAttribute<Calificaciones, Float> lecciones;
    public static volatile SingularAttribute<Calificaciones, Curso> cursoIdCurso;

}