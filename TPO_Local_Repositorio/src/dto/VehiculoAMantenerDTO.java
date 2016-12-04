package dto;

import java.io.Serializable;

public class VehiculoAMantenerDTO implements Serializable {

	private static final long serialVersionUID = 7557853164842885672L;
	
	private int idVehiculo;
	private boolean hayQueMantener;
	private String tipoDeTrabajo;
	private String puntoAControlar;
	private String tareas;
	
	public VehiculoAMantenerDTO(int idVehiculo, boolean hayQueMantener, String tipoDeTrabajo, String puntoAControlar,
			String tareas, String estado, VehiculoDTO vehiculo) {
		super();
		this.idVehiculo = idVehiculo;
		this.hayQueMantener = hayQueMantener;
		this.tipoDeTrabajo = tipoDeTrabajo;
		this.puntoAControlar = puntoAControlar;
		this.tareas = tareas;
		this.estado = estado;
		this.vehiculo = vehiculo;
	}

	private String estado;
	private VehiculoDTO vehiculo;
	
	public int getIdVehiculo() {
		return idVehiculo;
	}
	
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	
	public boolean isHayQueMantener() {
		return hayQueMantener;
	}
	
	public void setHayQueMantener() {
		this.hayQueMantener = true;
	}
	
	public String getTipoDeTrabajo() {
		return tipoDeTrabajo;
	}
	
	public void setTipoDeTrabajo(String tipoDeTrabajo) {
		this.tipoDeTrabajo = tipoDeTrabajo;
	}

	public String getPuntoAControlar() {
		return puntoAControlar;
	}

	public void setPuntoAControlar(String puntoAControlar) {
		this.puntoAControlar = puntoAControlar;
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public VehiculoDTO getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoDTO vehiculo) {
		this.vehiculo = vehiculo;
	}
	
}
