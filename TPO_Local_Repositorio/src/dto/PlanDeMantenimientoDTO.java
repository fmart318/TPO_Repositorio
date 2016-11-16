package dto;

import java.io.Serializable;

public class PlanDeMantenimientoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idPlanDeMantenimiento;
	private int diasProxControl;
	private int diasDemora;
	private int kmProxControl;

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
		// TODO Auto-generated method stub
		return idPlanDeMantenimiento;
	}
}
