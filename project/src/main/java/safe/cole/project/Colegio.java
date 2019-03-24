package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the colegio database table.
 * 
 */
@Entity
@NamedQuery(name="Colegio.findAll", query="SELECT c FROM Colegio c")
public class Colegio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String direccion;

	private String nombre;

	private int responsable;

	//bi-directional many-to-one association to Responsable
	@OneToMany(mappedBy="colegioBean")
	private List<Responsable> responsables;

	public Colegio() {
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

	public int getResponsable() {
		return this.responsable;
	}

	public void setResponsable(int responsable) {
		this.responsable = responsable;
	}

	public List<Responsable> getResponsables() {
		return this.responsables;
	}

	public void setResponsables(List<Responsable> responsables) {
		this.responsables = responsables;
	}

	public Responsable addResponsable(Responsable responsable) {
		getResponsables().add(responsable);
		responsable.setColegioBean(this);

		return responsable;
	}

	public Responsable removeResponsable(Responsable responsable) {
		getResponsables().remove(responsable);
		responsable.setColegioBean(null);

		return responsable;
	}

}