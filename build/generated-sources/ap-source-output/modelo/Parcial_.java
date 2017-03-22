package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Calificaciones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(Parcial.class)
public class Parcial_ { 

    public static volatile SingularAttribute<Parcial, Integer> idParcial;
    public static volatile CollectionAttribute<Parcial, Calificaciones> calificacionesCollection;
    public static volatile SingularAttribute<Parcial, String> nomParcial;

}