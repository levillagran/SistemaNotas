package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Estudiante;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(PadresTutores.class)
public class PadresTutores_ { 

    public static volatile CollectionAttribute<PadresTutores, Estudiante> estudianteCollection;
    public static volatile SingularAttribute<PadresTutores, Integer> idPadresTutores;
    public static volatile SingularAttribute<PadresTutores, Integer> numTelefono;
    public static volatile SingularAttribute<PadresTutores, Integer> numCedula;
    public static volatile SingularAttribute<PadresTutores, String> genero;
    public static volatile SingularAttribute<PadresTutores, String> profecion;
    public static volatile SingularAttribute<PadresTutores, String> lugarTrabajo;
    public static volatile SingularAttribute<PadresTutores, String> direccionDomicilio;
    public static volatile SingularAttribute<PadresTutores, String> nombre;
    public static volatile SingularAttribute<PadresTutores, String> email;

}