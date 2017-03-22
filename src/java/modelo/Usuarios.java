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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenin
 */
@Entity
@Table(name = "usuarios", catalog = "colegiojjc2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findById", query = "SELECT u FROM Usuarios u WHERE u.id = :id"),
    @NamedQuery(name = "Usuarios.findByUsuario", query = "SELECT u FROM Usuarios u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuarios.findByClave", query = "SELECT u FROM Usuarios u WHERE u.clave = :clave"),
    @NamedQuery(name = "Usuarios.findByNivelAcceso", query = "SELECT u FROM Usuarios u WHERE u.nivelAcceso = :nivelAcceso"),
    @NamedQuery(name = "Usuarios.findByFechaEgistro", query = "SELECT u FROM Usuarios u WHERE u.fechaEgistro = :fechaEgistro")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "usuario", nullable = false, length = 45)
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "clave", nullable = false, length = 45)
    private String clave;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nivel_acceso", nullable = false)
    private int nivelAcceso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_egistro", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaEgistro;
    @JoinColumn(name = "estudiante_id_estudiante", referencedColumnName = "id_estudiante")
    @ManyToOne
    private Estudiante estudianteIdEstudiante;
    @JoinColumn(name = "profesor_id_profesor", referencedColumnName = "id_profesor")
    @ManyToOne
    private Profesor profesorIdProfesor;

    public Usuarios() {
    }

    public Usuarios(Integer id) {
        this.id = id;
    }

    public Usuarios(Integer id, String usuario, String clave, int nivelAcceso, Date fechaEgistro) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.nivelAcceso = nivelAcceso;
        this.fechaEgistro = fechaEgistro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public Date getFechaEgistro() {
        return fechaEgistro;
    }

    public void setFechaEgistro(Date fechaEgistro) {
        this.fechaEgistro = fechaEgistro;
    }

    public Estudiante getEstudianteIdEstudiante() {
        return estudianteIdEstudiante;
    }

    public void setEstudianteIdEstudiante(Estudiante estudianteIdEstudiante) {
        this.estudianteIdEstudiante = estudianteIdEstudiante;
    }

    public Profesor getProfesorIdProfesor() {
        return profesorIdProfesor;
    }

    public void setProfesorIdProfesor(Profesor profesorIdProfesor) {
        this.profesorIdProfesor = profesorIdProfesor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Usuarios[ id=" + id + " ]";
    }
    
}
