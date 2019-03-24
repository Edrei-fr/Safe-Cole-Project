package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the indicacion database table.
 * 
 */
@Entity
@NamedQuery(name="Indicacion.findAll", query="SELECT i FROM Indicacion i")
public class Indicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	//bi-directional many-to-one association to Alumno
	@ManyToOne
	@JoinColumn(name="alumno")
	private Alumno alumnoBean;

	//bi-directional many-to-one association to Alimento
	@ManyToOne
	@JoinColumn(name="alergia")
	private Alimento alimento1;

	//bi-directional many-to-one association to Alimento
	@ManyToOne
	@JoinColumn(name="intolerancia")
	private Alimento alimento2;

	//bi-directional many-to-one association to Justificante
	@ManyToOne
	@JoinColumn(name="justificante")
	private Justificante justificanteBean;

	//bi-directional many-to-one association to MenuP
	@ManyToOne
	@JoinColumn(name="menu_p")
	private MenuP menuPBean;

	public Indicacion() {
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Alumno getAlumnoBean() {
		return this.alumnoBean;
	}

	public void setAlumnoBean(Alumno alumnoBean) {
		this.alumnoBean = alumnoBean;
	}

	public Alimento getAlimento1() {
		return this.alimento1;
	}

	public void setAlimento1(Alimento alimento1) {
		this.alimento1 = alimento1;
	}

	public Alimento getAlimento2() {
		return this.alimento2;
	}

	public void setAlimento2(Alimento alimento2) {
		this.alimento2 = alimento2;
	}

	public Justificante getJustificanteBean() {
		return this.justificanteBean;
	}

	public void setJustificanteBean(Justificante justificanteBean) {
		this.justificanteBean = justificanteBean;
	}

	public MenuP getMenuPBean() {
		return this.menuPBean;
	}

	public void setMenuPBean(MenuP menuPBean) {
		this.menuPBean = menuPBean;
	}

}