package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the menu_p database table.
 * 
 */
@Entity
@Table(name="menu_p")
@NamedQuery(name="MenuP.findAll", query="SELECT m FROM MenuP m")
public class MenuP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String tipo;

	//bi-directional many-to-one association to Indicacion
	@OneToMany(mappedBy="menuPBean")
	private List<Indicacion> indicacions;

	//bi-directional many-to-one association to Alimento
	@ManyToOne
	@JoinColumn(name="alergia")
	private Alimento alimento1;

	//bi-directional many-to-one association to Alimento
	@ManyToOne
	@JoinColumn(name="intolerancia")
	private Alimento alimento2;

	public MenuP() {
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Indicacion> getIndicacions() {
		return this.indicacions;
	}

	public void setIndicacions(List<Indicacion> indicacions) {
		this.indicacions = indicacions;
	}

	public Indicacion addIndicacion(Indicacion indicacion) {
		getIndicacions().add(indicacion);
		indicacion.setMenuPBean(this);

		return indicacion;
	}

	public Indicacion removeIndicacion(Indicacion indicacion) {
		getIndicacions().remove(indicacion);
		indicacion.setMenuPBean(null);

		return indicacion;
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

}