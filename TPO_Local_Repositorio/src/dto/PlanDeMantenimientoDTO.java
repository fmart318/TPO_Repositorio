package dto;

import java.io.Serializable;

public class PlanDeMantenimientoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idPlanDeMantenimiento;
	private int diasProxControl;
	private int diasDemora;
	private int kmProxControl;
	private String puntoAControlar;
	private String tareas;

	public PlanDeMantenimientoDTO() {
		super();
	}

	public PlanDeMantenimientoDTO(int idPlanDeMantenimiento,
			int diasProxControl, int diasDemora, int kmProxControl) {
		super();
		this.idPlanDeMantenimiento = idPlanDeMantenimiento;
		this.diasProxControl = diasProxControl;
		this.diasDemora = diasDemora;
		this.kmProxControl = kmProxControl;
	}
	
	public void setIdPlanDeMantenimiento(int idPlanDeMantenimiento) {
		this.idPlanDeMantenimiento = idPlanDeMantenimiento;
	}

	public int getDiasProxControl() {
		return diasProxControl;
	}

	public void setDiasProxControl(int diasProxControl) {
		this.diasProxControl = diasProxControl;
	}

	public int getDiasDemora() {
		return diasDemora;
	}

	public void setDiasDemora(int diasDemora) {
		this.diasDemora = diasDemora;
	}

	public int getKmProxControl() {
		return kmProxControl;
	}

	public void setKmProxControl(int kmProxControl) {
		this.kmProxControl = kmProxControl;
	}

	public int getIdPlanDeMantenimiento() {
		return idPlanDeMantenimiento;
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
