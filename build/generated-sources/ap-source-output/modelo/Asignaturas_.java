package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Calificaciones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(Asignaturas.class)
public class Asignaturas_ { 

    public static volatile CollectionAttribute<Asignaturas, Calificaciones> calificacionesCollection;
    public static volatile SingularAttribute<Asignaturas, String> nomAsignatura;
    public static volatile SingularAttribute<Asignaturas, Integer> idAsignatura;

}