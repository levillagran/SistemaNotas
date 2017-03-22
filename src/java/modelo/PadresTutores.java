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
@Table(name = "padres_tutores", catalog = "colegiojjc2", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_padres_tutores"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PadresTutores.findAll", query = "SELECT p FROM PadresTutores p"),
    @NamedQuery(name = "PadresTutores.findByIdPadresTutores", query = "SELECT p FROM PadresTutores p WHERE p.idPadresTutores = :idPadresTutores"),
    @NamedQuery(name = "PadresTutores.findByGenero", query = "SELECT p FROM PadresTutores p WHERE p.genero = :genero"),
    @NamedQuery(name = "PadresTutores.findByNumCedula", query = "SELECT p FROM PadresTutores p WHERE p.numCedula = :numCedula"),
    @NamedQuery(name = "PadresTutores.findByNombre", query = "SELECT p FROM PadresTutores p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PadresTutores.findByNumTelefono", query = "SELECT p FROM PadresTutores p WHERE p.numTelefono = :numTelefono"),
    @NamedQuery(name = "PadresTutores.findByEmail", query = "SELECT p FROM PadresTutores p WHERE p.email = :email"),
    @NamedQuery(name = "PadresTutores.findByProfecion", query = "SELECT p FROM PadresTutores p WHERE p.profecion = :profecion"),
    @NamedQuery(name = "PadresTutores.findByLugarTrabajo", query = "SELECT p FROM PadresTutores p WHERE p.lugarTrabajo = :lugarTrabajo"),
    @NamedQuery(name = "PadresTutores.findByDireccionDomicilio", query = "SELECT p FROM PadresTutores p WHERE p.direccionDomicilio = :direccionDomicilio")})
public class PadresTutores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_padres_tutores", nullable = false)
    private Integer idPadresTutores;
    @Size(max = 10)
    @Column(name = "genero", length = 10)
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_cedula", nullable = false)
    private int numCedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_telefono", nullable = false)
    private int numTelefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email", nullable = false, length = 45)
    private String email;
    @Size(max = 15)
    @Column(name = "profecion", length = 15)
    private String profecion;
    @Size(max = 45)
    @Column(name = "lugar_trabajo", length = 45)
    private String lugarTrabajo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "direccion_domicilio", nullable = false, length = 60)
    private String direccionDomicilio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "padresTutoresIdPadresTutores")
    private Collection<Estudiante> estudianteCollection;

    public PadresTutores() {
    }

    public PadresTutores(Integer idPadresTutores) {
        this.idPadresTutores = idPadresTutores;
    }

    public PadresTutores(Integer idPadresTutores, int numCedula, String nombre, int numTelefono, String email, String direccionDomicilio) {
        this.idPadresTutores = idPadresTutores;
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.email = email;
        this.direccionDomicilio = direccionDomicilio;
    }

    public Integer getIdPadresTutores() {
        return idPadresTutores;
    }

    public void setIdPadresTutores(Integer idPadresTutores) {
        this.idPadresTutores = idPadresTutores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfecion() {
        return profecion;
    }

    public void setProfecion(String profecion) {
        this.profecion = profecion;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
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
        hash += (idPadresTutores != null ? idPadresTutores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PadresTutores)) {
            return false;
        }
        PadresTutores other = (PadresTutores) object;
        if ((this.idPadresTutores == null && other.idPadresTutores != null) || (this.idPadresTutores != null && !this.idPadresTutores.equals(other.idPadresTutores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.PadresTutores[ idPadresTutores=" + idPadresTutores + " ]";
    }
    
}
