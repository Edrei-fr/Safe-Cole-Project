package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the empresa database table.
 * 
 */
@Entity
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nif;

	private String direccion;

	private String nombre;

	//bi-directional many-to-one association to Gestor
	@ManyToOne
	@JoinColumn(name="gestor")
	private Gestor gestorBean;

	public Empresa() {
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Gestor getGestorBean() {
		return this.gestorBean;
	}

	public void setGestorBean(Gestor gestorBean) {
		this.gestorBean = gestorBean;
	}

}