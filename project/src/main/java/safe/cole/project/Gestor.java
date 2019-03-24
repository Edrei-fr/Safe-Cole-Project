package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the gestor database table.
 * 
 */
@Entity
@NamedQuery(name="Gestor.findAll", query="SELECT g FROM Gestor g")
public class Gestor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idgestor;

	private String empresa;

	private String nombre;

	//bi-directional many-to-one association to Empresa
	@OneToMany(mappedBy="gestorBean")
	private List<Empresa> empresas;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuarioBean;

	public Gestor() {
	}

	public int getIdgestor() {
		return this.idgestor;
	}

	public void setIdgestor(int idgestor) {
		this.idgestor = idgestor;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empresa> getEmpresas() {
		return this.empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public Empresa addEmpresa(Empresa empresa) {
		getEmpresas().add(empresa);
		empresa.setGestorBean(this);

		return empresa;
	}

	public Empresa removeEmpresa(Empresa empresa) {
		getEmpresas().remove(empresa);
		empresa.setGestorBean(null);

		return empresa;
	}

	public Usuario getUsuarioBean() {
		return this.usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

}