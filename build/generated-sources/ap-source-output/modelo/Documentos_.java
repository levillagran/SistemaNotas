package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Estudiante;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(Documentos.class)
public class Documentos_ { 

    public static volatile SingularAttribute<Documentos, String> copiaCedula;
    public static volatile CollectionAttribute<Documentos, Estudiante> estudianteCollection;
    public static volatile SingularAttribute<Documentos, String> foto;
    public static volatile SingularAttribute<Documentos, String> comprobanteDeposito;
    public static volatile SingularAttribute<Documentos, String> promocionesLegalizadas;
    public static volatile SingularAttribute<Documentos, Integer> idDocumentos;
    public static volatile SingularAttribute<Documentos, String> certificadoMedico;
    public static volatile SingularAttribute<Documentos, String> libretaCalificaciones;

}