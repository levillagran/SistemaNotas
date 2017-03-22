package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T10:22:58")
@StaticMetamodel(AuditoriaDelete.class)
public class AuditoriaDelete_ { 

    public static volatile SingularAttribute<AuditoriaDelete, Integer> idAuditoria;
    public static volatile SingularAttribute<AuditoriaDelete, Date> hora;
    public static volatile SingularAttribute<AuditoriaDelete, Integer> idCalificacion;
    public static volatile SingularAttribute<AuditoriaDelete, Date> fechaDelete;
    public static volatile SingularAttribute<AuditoriaDelete, String> usuario;

}