package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the justificante database table.
 * 
 */
@Entity
@NamedQuery(name="Justificante.findAll", query="SELECT j FROM Justificante j")
public class Justificante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idjustificante;

	private String archivo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	//bi-directional many-to-one association to Indicacion
	@OneToMany(mappedBy="justificanteBean")
	private List<Indicacion> indicacions;

	//bi-directional many-to-one association to Alumno
	@ManyToOne
	@JoinColumn(name="alumno")
	private Alumno alumnoBean;

	public Justificante() {
	}

	public int getIdjustificante() {
		return this.idjustificante;
	}

	public void setIdjustificante(int idjustificante) {
		this.idjustificante = idjustificante;
	}

	public String getArchivo() {
		return this.archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Indicacion> getIndicacions() {
		return this.indicacions;
	}

	public void setIndicacions(List<Indicacion> indicacions) {
		this.indicacions = indicacions;
	}

	public Indicacion addIndicacion(Indicacion indicacion) {
		getIndicacions().add(indicacion);
		indicacion.setJustificanteBean(this);

		return indicacion;
	}

	public Indicacion removeIndicacion(Indicacion indicacion) {
		getIndicacions().remove(indicacion);
		indicacion.setJustificanteBean(null);

		return indicacion;
	}

	public Alumno getAlumnoBean() {
		return this.alumnoBean;
	}

	public void setAlumnoBean(Alumno alumnoBean) {
		this.alumnoBean = alumnoBean;
	}

}