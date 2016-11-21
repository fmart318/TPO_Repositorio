package dto;

import java.io.Serializable;

public class HabilitadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private String dniHabilitado;
	private String nombre;

	public HabilitadoDTO() {
		super();
	}

	public HabilitadoDTO(String nombre, String dniHabilitado) {
		super();
		this.nombre = nombre;
		this.dniHabilitado = dniHabilitado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDniHabilitado() {
		return dniHabilitado;
	}

	public void setDniHabilitado(String dniHabilitado) {
		this.dniHabilitado = dniHabilitado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
