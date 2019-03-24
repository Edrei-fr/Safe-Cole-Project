package safe.cole.project;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the menu_g database table.
 * 
 */
@Entity
@Table(name="menu_g")
@NamedQuery(name="MenuG.findAll", query="SELECT m FROM MenuG m")
public class MenuG implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String extra;

	private String postre;

	private String primero;

	private String segundo;

	public MenuG() {
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getPostre() {
		return this.postre;
	}

	public void setPostre(String postre) {
		this.postre = postre;
	}

	public String getPrimero() {
		return this.primero;
	}

	public void setPrimero(String primero) {
		this.primero = primero;
	}

	public String getSegundo() {
		return this.segundo;
	}

	public void setSegundo(String segundo) {
		this.segundo = segundo;
	}

}