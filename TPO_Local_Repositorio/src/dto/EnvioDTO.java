package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class EnvioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idEnvio;
	private Date fechaSalida;
	private Date fechaLlegada;
	private boolean cumpleCondicionesCarga;
	private String estado;
	private List<PedidoDTO> pedidos;
	private int prioridad;
	private SucursalDTO sucursalOrigen;
	private SucursalDTO sucursalDestino;
	private int idVehiculo;

	public EnvioDTO(){}

	public EnvioDTO(int idEnvio, Date fechaSalida, Date fechaLlegada,
			boolean cumpleCondicionesCarga, String estado, List<PedidoDTO> pedidos,
			int prioridad, SucursalDTO sucursalOrigen, SucursalDTO sucursalDestino, int idVehiculo) {
		super();
		this.idEnvio = idEnvio;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.cumpleCondicionesCarga = cumpleCondicionesCarga;
		this.estado = estado;
		this.setPedidos(pedidos);
		this.prioridad = prioridad;
		this.setSucursalOrigen(sucursalOrigen);
		this.setSucursalDestino(sucursalDestino);
		this.setVehiculoId(idVehiculo);
	}

	public int getIdEnvio() {
		return idEnvio;
	}

	public void setIdEnvio(int idEnvio) {
		this.idEnvio = idEnvio;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public boolean isCumpleCondicionesCarga() {
		return cumpleCondicionesCarga;
	}

	public void setCumpleCondicionesCarga(boolean cumpleCondicionesCarga) {
		this.cumpleCondicionesCarga = cumpleCondicionesCarga;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public SucursalDTO getSucursalOrigen() {
		return sucursalOrigen;
	}

	public void setSucursalOrigen(SucursalDTO sucursalOrigen) {
		this.sucursalOrigen = sucursalOrigen;
	}

	public SucursalDTO getSucursalDestino() {
		return sucursalDestino;
	}

	public void setSucursalDestino(SucursalDTO sucursalDestino) {
		this.sucursalDestino = sucursalDestino;
	}

	public List<PedidoDTO> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoDTO> pedidos) {
		this.pedidos = pedidos;
	}

	public int getVehiculoId() {
		return idVehiculo;
	}

	public void setVehiculoId(int vehiculoId) {
		this.idVehiculo = vehiculoId;
	}
}
