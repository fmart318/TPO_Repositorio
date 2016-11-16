package dto;

import java.io.Serializable;

public class TransporteDTO extends ProveedorDTO implements Serializable {

	private String tipoTransporte;

	private static final long serialVersionUID = 1L;

	public TransporteDTO() {
		super();
	}

	public TransporteDTO(int idProveedor, String compania,
			String tipoMercaderia, String tipoTransporte) {
		super(idProveedor, compania, tipoMercaderia);
		this.tipoTransporte = tipoTransporte;
	}

	public String getTipoTransporte() {
		return tipoTransporte;
	}

	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

}
