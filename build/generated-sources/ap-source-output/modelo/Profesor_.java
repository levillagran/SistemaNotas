package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Calificaciones;
import modelo.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile SingularAttribute<Profesor, Integer> idProfesor;
    public static volatile CollectionAttribute<Profesor, Usuarios> usuariosCollection;
    public static volatile CollectionAttribute<Profesor, Calificaciones> calificacionesCollection;
    public static volatile SingularAttribute<Profesor, String> nomProfesor;

}