package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_empleado database table.
 * 
 */
@Entity
@Table(name="tbl_empleado")
@NamedQuery(name="TblEmpleado.findAll", query="SELECT t FROM TblEmpleado t")
public class TblEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private String apeempleado;

	private String dniempleado;

	private String emaiempleado;

	private int idempleado;

	private String nomempleado;

	private String telfempleado;

	public TblEmpleado() {
	}

	public String getApeempleado() {
		return this.apeempleado;
	}

	public void setApeempleado(String apeempleado) {
		this.apeempleado = apeempleado;
	}

	public String getDniempleado() {
		return this.dniempleado;
	}

	public void setDniempleado(String dniempleado) {
		this.dniempleado = dniempleado;
	}

	public String getEmaiempleado() {
		return this.emaiempleado;
	}

	public void setEmaiempleado(String emaiempleado) {
		this.emaiempleado = emaiempleado;
	}

	public int getIdempleado() {
		return this.idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getNomempleado() {
		return this.nomempleado;
	}

	public void setNomempleado(String nomempleado) {
		this.nomempleado = nomempleado;
	}

	public String getTelfempleado() {
		return this.telfempleado;
	}

	public void setTelfempleado(String telfempleado) {
		this.telfempleado = telfempleado;
	}

}