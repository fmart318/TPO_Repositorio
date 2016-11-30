package dto;

import java.io.Serializable;

public class EmpresaDTO extends ClienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int CUIT;
	private String tipo;
	private String detallePoliticas;
	private float saldoCuentaCorriente;

	public EmpresaDTO() {
		super();
	}

	public EmpresaDTO(int idCliente, String nombre, int CUIT, String tipo, String detallePoliticas,
			float saldoCuentaCorriente) {
		super(idCliente, nombre);
		this.CUIT = CUIT;
		this.tipo = tipo;
		this.detallePoliticas = detallePoliticas;
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public int getCUIT() {
		return CUIT;
	}

	public void setCUIT(int cUIT) {
		CUIT = cUIT;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDetallePoliticas() {
		return detallePoliticas;
	}

	public void setDetallePoliticas(String detallePoliticas) {
		this.detallePoliticas = detallePoliticas;
	}
	public float getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}

	public void setSaldoCuentaCorriente(float saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}
}
