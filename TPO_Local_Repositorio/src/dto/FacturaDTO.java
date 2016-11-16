package dto;

import java.io.Serializable;

public class FacturaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idFactura;
	private PedidoDTO pedido;
	private float precio;

	public FacturaDTO() {
	}

	public FacturaDTO(int idFactura, PedidoDTO pedido, float precio) {
		super();
		this.idFactura = idFactura;
		this.pedido = pedido;
		this.precio = precio;
	}

	public PedidoDTO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getIdFactura() {

		return idFactura;
	}
}
