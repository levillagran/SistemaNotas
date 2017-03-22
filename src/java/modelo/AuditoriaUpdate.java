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
@Table(name = "auditoria_update", catalog = "colegiojjc2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuditoriaUpdate.findAll", query = "SELECT a FROM AuditoriaUpdate a"),
    @NamedQuery(name = "AuditoriaUpdate.findByIdAuditoria", query = "SELECT a FROM AuditoriaUpdate a WHERE a.idAuditoria = :idAuditoria"),
    @NamedQuery(name = "AuditoriaUpdate.findByIdCalificacion", query = "SELECT a FROM AuditoriaUpdate a WHERE a.idCalificacion = :idCalificacion"),
    @NamedQuery(name = "AuditoriaUpdate.findByFechaUpdate", query = "SELECT a FROM AuditoriaUpdate a WHERE a.fechaUpdate = :fechaUpdate"),
    @NamedQuery(name = "AuditoriaUpdate.findByHora", query = "SELECT a FROM AuditoriaUpdate a WHERE a.hora = :hora"),
    @NamedQuery(name = "AuditoriaUpdate.findByUsuario", query = "SELECT a FROM AuditoriaUpdate a WHERE a.usuario = :usuario")})
public class AuditoriaUpdate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_auditoria", nullable = false)
    private Integer idAuditoria;
    @Column(name = "id_calificacion")
    private Integer idCalificacion;
    @Column(name = "fecha_update")
    @Temporal(TemporalType.DATE)
    private Date fechaUpdate;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Size(max = 15)
    @Column(name = "usuario", length = 15)
    private String usuario;

    public AuditoriaUpdate() {
    }

    public AuditoriaUpdate(Integer idAuditoria) {
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

    public Date getFechaUpdate() {
        return fechaUpdate;
    }

    public void setFechaUpdate(Date fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
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
        if (!(object instanceof AuditoriaUpdate)) {
            return false;
        }
        AuditoriaUpdate other = (AuditoriaUpdate) object;
        if ((this.idAuditoria == null && other.idAuditoria != null) || (this.idAuditoria != null && !this.idAuditoria.equals(other.idAuditoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.AuditoriaUpdate[ idAuditoria=" + idAuditoria + " ]";
    }
    
}
