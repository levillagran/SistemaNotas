package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(AuditoriaUpdate.class)
public class AuditoriaUpdate_ { 

    public static volatile SingularAttribute<AuditoriaUpdate, Integer> idAuditoria;
    public static volatile SingularAttribute<AuditoriaUpdate, Date> hora;
    public static volatile SingularAttribute<AuditoriaUpdate, Integer> idCalificacion;
    public static volatile SingularAttribute<AuditoriaUpdate, String> usuario;
    public static volatile SingularAttribute<AuditoriaUpdate, Date> fechaUpdate;

}