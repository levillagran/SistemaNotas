/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenin
 */
@Entity
@Table(name = "auditoria_delete", catalog = "colegiojjc2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuditoriaDelete.findAll", query = "SELECT a FROM AuditoriaDelete a"),
    @NamedQuery(name = "AuditoriaDelete.findByIdAuditoria", query = "SELECT a FROM AuditoriaDelete a WHERE a.idAuditoria = :idAuditoria"),
    @NamedQuery(name = "AuditoriaDelete.findByIdCalificacion", query = "SELECT a FROM AuditoriaDelete a WHERE a.idCalificacion = :idCalificacion"),
    @NamedQuery(name = "AuditoriaDelete.findByFechaDelete", query = "SELECT a FROM AuditoriaDelete a WHERE a.fechaDelete = :fechaDelete"),
    @NamedQuery(name = "AuditoriaDelete.findByHora", query = "SELECT a FROM AuditoriaDelete a WHERE a.hora = :hora"),
    @NamedQuery(name = "AuditoriaDelete.findByUsuario", query = "SELECT a FROM AuditoriaDelete a WHERE a.usuario = :usuario")})
public class AuditoriaDelete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_auditoria", nullable = false)
    private Integer idAuditoria;
    @Column(name = "id_calificacion")
    private Integer idCalificacion;
    @Column(name = "fecha_delete")
    @Temporal(TemporalType.DATE)
    private Date fechaDelete;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Size(max = 15)
    @Column(name = "usuario", length = 15)
    private String usuario;

    public AuditoriaDelete() {
    }

    public AuditoriaDelete(Integer idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public Integer getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Integer idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public Integer getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public Date getFechaDelete() {
        return fechaDelete;
    }

    public void setFechaDelete(Date fechaDelete) {
        this.fechaDelete = fechaDelete;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAuditoria != null ? idAuditoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuditoriaDelete)) {
            return false;
        }
        AuditoriaDelete other = (AuditoriaDelete) object;
        if ((this.idAuditoria == null && other.idAuditoria != null) || (this.idAuditoria != null && !this.idAuditoria.equals(other.idAuditoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.AuditoriaDelete[ idAuditoria=" + idAuditoria + " ]";
    }
    
}
