/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lenin
 */
@Entity
@Table(name = "paralelo", catalog = "colegiojjc2", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_paralelo"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paralelo.findAll", query = "SELECT p FROM Paralelo p"),
    @NamedQuery(name = "Paralelo.findByIdParalelo", query = "SELECT p FROM Paralelo p WHERE p.idParalelo = :idParalelo"),
    @NamedQuery(name = "Paralelo.findByParalelo", query = "SELECT p FROM Paralelo p WHERE p.paralelo = :paralelo")})
public class Paralelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paralelo", nullable = false)
    private Integer idParalelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "paralelo", nullable = false, length = 2)
    private String paralelo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paraleloIdParalelo")
    private Collection<Calificaciones> calificacionesCollection;

    public Paralelo() {
    }

    public Paralelo(Integer idParalelo) {
        this.idParalelo = idParalelo;
    }

    public Paralelo(Integer idParalelo, String paralelo) {
        this.idParalelo = idParalelo;
        this.paralelo = paralelo;
    }

    public Integer getIdParalelo() {
        return idParalelo;
    }

    public void setIdParalelo(Integer idParalelo) {
        this.idParalelo = idParalelo;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    @XmlTransient
    public Collection<Calificaciones> getCalificacionesCollection() {
        return calificacionesCollection;
    }

    public void setCalificacionesCollection(Collection<Calificaciones> calificacionesCollection) {
        this.calificacionesCollection = calificacionesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParalelo != null ? idParalelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paralelo)) {
            return false;
        }
        Paralelo other = (Paralelo) object;
        if ((this.idParalelo == null && other.idParalelo != null) || (this.idParalelo != null && !this.idParalelo.equals(other.idParalelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Paralelo[ idParalelo=" + idParalelo + " ]";
    }
    
}
