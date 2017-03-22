package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Calificaciones;
import modelo.Documentos;
import modelo.PadresTutores;
import modelo.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile SingularAttribute<Estudiante, Integer> numTelefono;
    public static volatile SingularAttribute<Estudiante, PadresTutores> padresTutoresIdPadresTutores;
    public static volatile SingularAttribute<Estudiante, Date> fechaNacimiento;
    public static volatile SingularAttribute<Estudiante, String> nomEstudiante;
    public static volatile CollectionAttribute<Estudiante, Calificaciones> calificacionesCollection;
    public static volatile SingularAttribute<Estudiante, String> direccionDomicilio;
    public static volatile SingularAttribute<Estudiante, Documentos> documentosIdDocumento;
    public static volatile CollectionAttribute<Estudiante, Usuarios> usuariosCollection;
    public static volatile SingularAttribute<Estudiante, Integer> idEstudiante;
    public static volatile SingularAttribute<Estudiante, String> cursoAnterior;
    public static volatile SingularAttribute<Estudiante, String> lugarNacimiento;
    public static volatile SingularAttribute<Estudiante, String> email;
    public static volatile SingularAttribute<Estudiante, String> plantelAnterior;

}