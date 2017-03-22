package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Calificaciones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(Periodo.class)
public class Periodo_ { 

    public static volatile SingularAttribute<Periodo, Date> fechaInicio;
    public static volatile CollectionAttribute<Periodo, Calificaciones> calificacionesCollection;
    public static volatile SingularAttribute<Periodo, Integer> idPeriodo;
    public static volatile SingularAttribute<Periodo, String> nomPeriodo;
    public static volatile SingularAttribute<Periodo, Date> fechaFin;

}