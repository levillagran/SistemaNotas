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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lenin
 */
@Entity
@Table(name = "documentos", catalog = "colegiojjc2", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_documentos"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documentos.findAll", query = "SELECT d FROM Documentos d"),
    @NamedQuery(name = "Documentos.findByIdDocumentos", query = "SELECT d FROM Documentos d WHERE d.idDocumentos = :idDocumentos"),
    @NamedQuery(name = "Documentos.findByCertificadoMedico", query = "SELECT d FROM Documentos d WHERE d.certificadoMedico = :certificadoMedico"),
    @NamedQuery(name = "Documentos.findByLibretaCalificaciones", query = "SELECT d FROM Documentos d WHERE d.libretaCalificaciones = :libretaCalificaciones"),
    @NamedQuery(name = "Documentos.findByComprobanteDeposito", query = "SELECT d FROM Documentos d WHERE d.comprobanteDeposito = :comprobanteDeposito"),
    @NamedQuery(name = "Documentos.findByPromocionesLegalizadas", query = "SELECT d FROM Documentos d WHERE d.promocionesLegalizadas = :promocionesLegalizadas"),
    @NamedQuery(name = "Documentos.findByCopiaCedula", query = "SELECT d FROM Documentos d WHERE d.copiaCedula = :copiaCedula"),
    @NamedQuery(name = "Documentos.findByFoto", query = "SELECT d FROM Documentos d WHERE d.foto = :foto")})
public class Documentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_documentos", nullable = false)
    private Integer idDocumentos;
    @Size(max = 150)
    @Column(name = "certificado_medico", length = 150)
    private String certificadoMedico;
    @Size(max = 150)
    @Column(name = "libreta_calificaciones", length = 150)
    private String libretaCalificaciones;
    @Size(max = 150)
    @Column(name = "comprobante_deposito", length = 150)
    private String comprobanteDeposito;
    @Size(max = 150)
    @Column(name = "promociones_legalizadas", length = 150)
    private String promocionesLegalizadas;
    @Size(max = 150)
    @Column(name = "copia_cedula", length = 150)
    private String copiaCedula;
    @Size(max = 150)
    @Column(name = "foto", length = 150)
    private String foto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "documentosIdDocumento")
    private Collection<Estudiante> estudianteCollection;

    public Documentos() {
    }

    public Documentos(Integer idDocumentos) {
        this.idDocumentos = idDocumentos;
    }

    public Integer getIdDocumentos() {
        return idDocumentos;
    }

    public void setIdDocumentos(Integer idDocumentos) {
        this.idDocumentos = idDocumentos;
    }

    public String getCertificadoMedico() {
        return certificadoMedico;
    }

    public void setCertificadoMedico(String certificadoMedico) {
        this.certificadoMedico = certificadoMedico;
    }

    public String getLibretaCalificaciones() {
        return libretaCalificaciones;
    }

    public void setLibretaCalificaciones(String libretaCalificaciones) {
        this.libretaCalificaciones = libretaCalificaciones;
    }

    public String getComprobanteDeposito() {
        return comprobanteDeposito;
    }

    public void setComprobanteDeposito(String comprobanteDeposito) {
        this.comprobanteDeposito = comprobanteDeposito;
    }

    public String getPromocionesLegalizadas() {
        return promocionesLegalizadas;
    }

    public void setPromocionesLegalizadas(String promocionesLegalizadas) {
        this.promocionesLegalizadas = promocionesLegalizadas;
    }

    public String getCopiaCedula() {
        return copiaCedula;
    }

    public void setCopiaCedula(String copiaCedula) {
        this.copiaCedula = copiaCedula;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @XmlTransient
    public Collection<Estudiante> getEstudianteCollection() {
        return estudianteCollection;
    }

    public void setEstudianteCollection(Collection<Estudiante> estudianteCollection) {
        this.estudianteCollection = estudianteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocumentos != null ? idDocumentos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentos)) {
            return false;
        }
        Documentos other = (Documentos) object;
        if ((this.idDocumentos == null && other.idDocumentos != null) || (this.idDocumentos != null && !this.idDocumentos.equals(other.idDocumentos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Documentos[ idDocumentos=" + idDocumentos + " ]";
    }
    
}
