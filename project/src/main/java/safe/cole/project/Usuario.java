package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nombre;

	private String password;

	//bi-directional many-to-one association to Familiar
	@OneToMany(mappedBy="usuarioBean")
	private List<Familiar> familiars;

	//bi-directional many-to-one association to Gestor
	@OneToMany(mappedBy="usuarioBean")
	private List<Gestor> gestors;

	//bi-directional many-to-one association to Responsable
	@OneToMany(mappedBy="usuarioBean")
	private List<Responsable> responsables;

	public Usuario() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Familiar> getFamiliars() {
		return this.familiars;
	}

	public void setFamiliars(List<Familiar> familiars) {
		this.familiars = familiars;
	}

	public Familiar addFamiliar(Familiar familiar) {
		getFamiliars().add(familiar);
		familiar.setUsuarioBean(this);

		return familiar;
	}

	public Familiar removeFamiliar(Familiar familiar) {
		getFamiliars().remove(familiar);
		familiar.setUsuarioBean(null);

		return familiar;
	}

	public List<Gestor> getGestors() {
		return this.gestors;
	}

	public void setGestors(List<Gestor> gestors) {
		this.gestors = gestors;
	}

	public Gestor addGestor(Gestor gestor) {
		getGestors().add(gestor);
		gestor.setUsuarioBean(this);

		return gestor;
	}

	public Gestor removeGestor(Gestor gestor) {
		getGestors().remove(gestor);
		gestor.setUsuarioBean(null);

		return gestor;
	}

	public List<Responsable> getResponsables() {
		return this.responsables;
	}

	public void setResponsables(List<Responsable> responsables) {
		this.responsables = responsables;
	}

	public Responsable addResponsable(Responsable responsable) {
		getResponsables().add(responsable);
		responsable.setUsuarioBean(this);

		return responsable;
	}

	public Responsable removeResponsable(Responsable responsable) {
		getResponsables().remove(responsable);
		responsable.setUsuarioBean(null);

		return responsable;
	}

}