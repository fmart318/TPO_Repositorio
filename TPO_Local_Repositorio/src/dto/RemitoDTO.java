package dto;

import java.io.Serializable;

public class RemitoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idRemito;
	private PedidoDTO pedido;

	public RemitoDTO() {
	}

	public RemitoDTO(int idRemito, PedidoDTO pedido) {
		super();
		this.idRemito = idRemito;
		this.pedido = pedido;
	}

	public int getIdRemito() {
		return idRemito;
	}

	public void setIdRemito(int idRemito) {
		this.idRemito = idRemito;
	}

	public PedidoDTO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}
}
