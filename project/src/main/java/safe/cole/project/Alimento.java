package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the alimento database table.
 * 
 */
@Entity
@NamedQuery(name="Alimento.findAll", query="SELECT a FROM Alimento a")
public class Alimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idalimento;

	private String nombre;

	//bi-directional many-to-one association to Indicacion
	@OneToMany(mappedBy="alimento1")
	private List<Indicacion> indicacions1;

	//bi-directional many-to-one association to Indicacion
	@OneToMany(mappedBy="alimento2")
	private List<Indicacion> indicacions2;

	//bi-directional many-to-one association to MenuP
	@OneToMany(mappedBy="alimento1")
	private List<MenuP> menuPs1;

	//bi-directional many-to-one association to MenuP
	@OneToMany(mappedBy="alimento2")
	private List<MenuP> menuPs2;

	public Alimento() {
	}

	public int getIdalimento() {
		return this.idalimento;
	}

	public void setIdalimento(int idalimento) {
		this.idalimento = idalimento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Indicacion> getIndicacions1() {
		return this.indicacions1;
	}

	public void setIndicacions1(List<Indicacion> indicacions1) {
		this.indicacions1 = indicacions1;
	}

	public Indicacion addIndicacions1(Indicacion indicacions1) {
		getIndicacions1().add(indicacions1);
		indicacions1.setAlimento1(this);

		return indicacions1;
	}

	public Indicacion removeIndicacions1(Indicacion indicacions1) {
		getIndicacions1().remove(indicacions1);
		indicacions1.setAlimento1(null);

		return indicacions1;
	}

	public List<Indicacion> getIndicacions2() {
		return this.indicacions2;
	}

	public void setIndicacions2(List<Indicacion> indicacions2) {
		this.indicacions2 = indicacions2;
	}

	public Indicacion addIndicacions2(Indicacion indicacions2) {
		getIndicacions2().add(indicacions2);
		indicacions2.setAlimento2(this);

		return indicacions2;
	}

	public Indicacion removeIndicacions2(Indicacion indicacions2) {
		getIndicacions2().remove(indicacions2);
		indicacions2.setAlimento2(null);

		return indicacions2;
	}

	public List<MenuP> getMenuPs1() {
		return this.menuPs1;
	}

	public void setMenuPs1(List<MenuP> menuPs1) {
		this.menuPs1 = menuPs1;
	}

	public MenuP addMenuPs1(MenuP menuPs1) {
		getMenuPs1().add(menuPs1);
		menuPs1.setAlimento1(this);

		return menuPs1;
	}

	public MenuP removeMenuPs1(MenuP menuPs1) {
		getMenuPs1().remove(menuPs1);
		menuPs1.setAlimento1(null);

		return menuPs1;
	}

	public List<MenuP> getMenuPs2() {
		return this.menuPs2;
	}

	public void setMenuPs2(List<MenuP> menuPs2) {
		this.menuPs2 = menuPs2;
	}

	public MenuP addMenuPs2(MenuP menuPs2) {
		getMenuPs2().add(menuPs2);
		menuPs2.setAlimento2(this);

		return menuPs2;
	}

	public MenuP removeMenuPs2(MenuP menuPs2) {
		getMenuPs2().remove(menuPs2);
		menuPs2.setAlimento2(null);

		return menuPs2;
	}

}