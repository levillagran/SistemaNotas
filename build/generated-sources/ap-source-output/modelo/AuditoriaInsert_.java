package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(AuditoriaInsert.class)
public class AuditoriaInsert_ { 

    public static volatile SingularAttribute<AuditoriaInsert, Integer> idAuditoria;
    public static volatile SingularAttribute<AuditoriaInsert, Date> hora;
    public static volatile SingularAttribute<AuditoriaInsert, Integer> idCalificacion;
    public static volatile SingularAttribute<AuditoriaInsert, Date> fechaInsert;
    public static volatile SingularAttribute<AuditoriaInsert, String> usuario;

}