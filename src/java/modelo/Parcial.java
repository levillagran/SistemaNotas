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
@Table(name = "parcial", catalog = "colegiojjc2", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_parcial"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parcial.findAll", query = "SELECT p FROM Parcial p"),
    @NamedQuery(name = "Parcial.findByIdParcial", query = "SELECT p FROM Parcial p WHERE p.idParcial = :idParcial"),
    @NamedQuery(name = "Parcial.findByNomParcial", query = "SELECT p FROM Parcial p WHERE p.nomParcial = :nomParcial")})
public class Parcial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_parcial", nullable = false)
    private Integer idParcial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nom_parcial", nullable = false, length = 15)
    private String nomParcial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parcialIdParcial")
    private Collection<Calificaciones> calificacionesCollection;

    public Parcial() {
    }

    public Parcial(Integer idParcial) {
        this.idParcial = idParcial;
    }

    public Parcial(Integer idParcial, String nomParcial) {
        this.idParcial = idParcial;
        this.nomParcial = nomParcial;
    }

    public Integer getIdParcial() {
        return idParcial;
    }

    public void setIdParcial(Integer idParcial) {
        this.idParcial = idParcial;
    }

    public String getNomParcial() {
        return nomParcial;
    }

    public void setNomParcial(String nomParcial) {
        this.nomParcial = nomParcial;
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
        hash += (idParcial != null ? idParcial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcial)) {
            return false;
        }
        Parcial other = (Parcial) object;
        if ((this.idParcial == null && other.idParcial != null) || (this.idParcial != null && !this.idParcial.equals(other.idParcial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Parcial[ idParcial=" + idParcial + " ]";
    }
    
}
