package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the responsable database table.
 * 
 */
@Entity
@NamedQuery(name="Responsable.findAll", query="SELECT r FROM Responsable r")
public class Responsable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idresponsable;

	private String nombre;

	//bi-directional many-to-one association to Colegio
	@ManyToOne
	@JoinColumn(name="colegio")
	private Colegio colegioBean;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuarioBean;

	public Responsable() {
	}

	public int getIdresponsable() {
		return this.idresponsable;
	}

	public void setIdresponsable(int idresponsable) {
		this.idresponsable = idresponsable;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Colegio getColegioBean() {
		return this.colegioBean;
	}

	public void setColegioBean(Colegio colegioBean) {
		this.colegioBean = colegioBean;
	}

	public Usuario getUsuarioBean() {
		return this.usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

}