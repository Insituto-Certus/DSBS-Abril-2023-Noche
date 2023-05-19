package certus.edu.pe.modelo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cine")

@NamedQueries({
    @NamedQuery(name = "Cine.findAll", query = "SELECT c FROM Cine c")
    , @NamedQuery(name = "Cine.findByIdCine", query = "SELECT c FROM Cine c WHERE c.idCine = :idCine")
    , @NamedQuery(name = "Cine.findByRazonSocial", query = "SELECT c FROM Cine c WHERE c.razonSocial = :razonSocial")
    , @NamedQuery(name = "Cine.findByNombre", query = "SELECT c FROM Cine c WHERE c.nombre = :nombre")})
public class Cine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCine")
    private Integer idCine;
    @Basic(optional = false)
    @Column(name = "razonSocial")
    private String razonSocial;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cine")
    @JsonBackReference(value="cine_sede")
    private List<Sede> sedeList;

    public Cine() {
    }

    public Cine(Integer idCine) {
        this.idCine = idCine;
    }

    public Cine(Integer idCine, String razonSocial, String nombre) {
        this.idCine = idCine;
        this.razonSocial = razonSocial;
        this.nombre = nombre;
    }

    public Integer getIdCine() {
        return idCine;
    }

    public void setIdCine(Integer idCine) {
        this.idCine = idCine;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   // @XmlTransient
    public List<Sede> getSedeList() {
        return sedeList;
    }

    public void setSedeList(List<Sede> sedeList) {
        this.sedeList = sedeList;
    }
}
