package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the alumno database table.
 * 
 */
@Entity
@NamedQuery(name="Alumno.findAll", query="SELECT a FROM Alumno a")
public class Alumno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idalumno;

	private String curso;

	private String nombre;

	//bi-directional many-to-one association to Familiar
	@ManyToOne
	@JoinColumn(name="familiar")
	private Familiar familiarBean;

	//bi-directional many-to-one association to Indicacion
	@OneToMany(mappedBy="alumnoBean")
	private List<Indicacion> indicacions;

	//bi-directional many-to-one association to Justificante
	@OneToMany(mappedBy="alumnoBean")
	private List<Justificante> justificantes;

	public Alumno() {
	}

	public int getIdalumno() {
		return this.idalumno;
	}

	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Familiar getFamiliarBean() {
		return this.familiarBean;
	}

	public void setFamiliarBean(Familiar familiarBean) {
		this.familiarBean = familiarBean;
	}

	public List<Indicacion> getIndicacions() {
		return this.indicacions;
	}

	public void setIndicacions(List<Indicacion> indicacions) {
		this.indicacions = indicacions;
	}

	public Indicacion addIndicacion(Indicacion indicacion) {
		getIndicacions().add(indicacion);
		indicacion.setAlumnoBean(this);

		return indicacion;
	}

	public Indicacion removeIndicacion(Indicacion indicacion) {
		getIndicacions().remove(indicacion);
		indicacion.setAlumnoBean(null);

		return indicacion;
	}

	public List<Justificante> getJustificantes() {
		return this.justificantes;
	}

	public void setJustificantes(List<Justificante> justificantes) {
		this.justificantes = justificantes;
	}

	public Justificante addJustificante(Justificante justificante) {
		getJustificantes().add(justificante);
		justificante.setAlumnoBean(this);

		return justificante;
	}

	public Justificante removeJustificante(Justificante justificante) {
		getJustificantes().remove(justificante);
		justificante.setAlumnoBean(null);

		return justificante;
	}

}