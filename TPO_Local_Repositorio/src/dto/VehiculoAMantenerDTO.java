package dto;

import java.io.Serializable;

public class VehiculoAMantenerDTO implements Serializable {

	private static final long serialVersionUID = 7557853164842885672L;
	
	private int idVehiculo;
	private String hayQueMantener;
	private String tipoDeTrabajo;
	private String puntoAControlar;
	private String tareas;
	
	public int getIdVehiculo() {
		return idVehiculo;
	}
	
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	
	public String isHayQueMantener() {
		return hayQueMantener;
	}
	
	public void setHayQueMantener(String hayQueMantener) {
		this.hayQueMantener = hayQueMantener;
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
	
}
