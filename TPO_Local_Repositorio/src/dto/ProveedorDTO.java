package dto;

import java.io.Serializable;

public class ProveedorDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	protected int idProveedor;
	protected String compania;
	protected String tipoMercaderia;

	public ProveedorDTO() {
		super();
	}

	public ProveedorDTO(int idProveedor, String compania, String tipoMercaderia) {
		super();
		this.idProveedor = idProveedor;
		this.compania = compania;
		this.tipoMercaderia = tipoMercaderia;
	}

	public String getTipoMercaderia() {
		return tipoMercaderia;
	}

	public void setTipoMercaderia(String tipoMercaderia) {
		this.tipoMercaderia = tipoMercaderia;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
}
