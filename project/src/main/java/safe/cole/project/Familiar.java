package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the familiar database table.
 * 
 */
@Entity
@NamedQuery(name="Familiar.findAll", query="SELECT f FROM Familiar f")
public class Familiar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String dni;

	private String email;

	private String nombre;

	private String telefono;

	//bi-directional many-to-one association to Alumno
	@OneToMany(mappedBy="familiarBean")
	private List<Alumno> alumnos;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuarioBean;

	public Familiar() {
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Alumno> getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Alumno addAlumno(Alumno alumno) {
		getAlumnos().add(alumno);
		alumno.setFamiliarBean(this);

		return alumno;
	}

	public Alumno removeAlumno(Alumno alumno) {
		getAlumnos().remove(alumno);
		alumno.setFamiliarBean(null);

		return alumno;
	}

	public Usuario getUsuarioBean() {
		return this.usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

}