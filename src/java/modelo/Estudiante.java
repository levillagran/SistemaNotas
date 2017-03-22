/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "estudiante", catalog = "colegiojjc2", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_estudiante"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e"),
    @NamedQuery(name = "Estudiante.findByIdEstudiante", query = "SELECT e FROM Estudiante e WHERE e.idEstudiante = :idEstudiante"),
    @NamedQuery(name = "Estudiante.findByNomEstudiante", query = "SELECT e FROM Estudiante e WHERE e.nomEstudiante = :nomEstudiante"),
    @NamedQuery(name = "Estudiante.findByNumTelefono", query = "SELECT e FROM Estudiante e WHERE e.numTelefono = :numTelefono"),
    @NamedQuery(name = "Estudiante.findByEmail", query = "SELECT e FROM Estudiante e WHERE e.email = :email"),
    @NamedQuery(name = "Estudiante.findByFechaNacimiento", query = "SELECT e FROM Estudiante e WHERE e.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Estudiante.findByLugarNacimiento", query = "SELECT e FROM Estudiante e WHERE e.lugarNacimiento = :lugarNacimiento"),
    @NamedQuery(name = "Estudiante.findByPlantelAnterior", query = "SELECT e FROM Estudiante e WHERE e.plantelAnterior = :plantelAnterior"),
    @NamedQuery(name = "Estudiante.findByCursoAnterior", query = "SELECT e FROM Estudiante e WHERE e.cursoAnterior = :cursoAnterior"),
    @NamedQuery(name = "Estudiante.findByDireccionDomicilio", query = "SELECT e FROM Estudiante e WHERE e.direccionDomicilio = :direccionDomicilio")})
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estudiante", nullable = false)
    private Integer idEstudiante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_estudiante", nullable = false, length = 45)
    private String nomEstudiante;
    @Column(name = "num_telefono")
    private Integer numTelefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Size(max = 20)
    @Column(name = "lugar_nacimiento", length = 20)
    private String lugarNacimiento;
    @Size(max = 45)
    @Column(name = "plantel_anterior", length = 45)
    private String plantelAnterior;
    @Size(max = 10)
    @Column(name = "curso_anterior", length = 10)
    private String cursoAnterior;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion_domicilio", nullable = false, length = 45)
    private String direccionDomicilio;
    @JoinColumn(name = "documentos_id_documento", referencedColumnName = "id_documentos", nullable = false)
    @ManyToOne(optional = false)
    private Documentos documentosIdDocumento;
    @JoinColumn(name = "padres_tutores_id_padres_tutores", referencedColumnName = "id_padres_tutores", nullable = false)
    @ManyToOne(optional = false)
    private PadresTutores padresTutoresIdPadresTutores;
    @OneToMany(mappedBy = "estudianteIdEstudiante")
    private Collection<Usuarios> usuariosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudianteIdEstudiante")
    private Collection<Calificaciones> calificacionesCollection;

    public Estudiante() {
    }

    public Estudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Estudiante(Integer idEstudiante, String nomEstudiante, Date fechaNacimiento, String direccionDomicilio) {
        this.idEstudiante = idEstudiante;
        this.nomEstudiante = nomEstudiante;
        this.fechaNacimiento = fechaNacimiento;
        this.direccionDomicilio = direccionDomicilio;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNomEstudiante() {
        return nomEstudiante;
    }

    public void setNomEstudiante(String nomEstudiante) {
        this.nomEstudiante = nomEstudiante;
    }

    public Integer getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(Integer numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getPlantelAnterior() {
        return plantelAnterior;
    }

    public void setPlantelAnterior(String plantelAnterior) {
        this.plantelAnterior = plantelAnterior;
    }

    public String getCursoAnterior() {
        return cursoAnterior;
    }

    public void setCursoAnterior(String cursoAnterior) {
        this.cursoAnterior = cursoAnterior;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public Documentos getDocumentosIdDocumento() {
        return documentosIdDocumento;
    }

    public void setDocumentosIdDocumento(Documentos documentosIdDocumento) {
        this.documentosIdDocumento = documentosIdDocumento;
    }

    public PadresTutores getPadresTutoresIdPadresTutores() {
        return padresTutoresIdPadresTutores;
    }

    public void setPadresTutoresIdPadresTutores(PadresTutores padresTutoresIdPadresTutores) {
        this.padresTutoresIdPadresTutores = padresTutoresIdPadresTutores;
    }

    @XmlTransient
    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
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
        hash += (idEstudiante != null ? idEstudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Estudiante[ idEstudiante=" + idEstudiante + " ]";
    }
    
}
