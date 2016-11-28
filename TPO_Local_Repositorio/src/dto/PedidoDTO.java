package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PedidoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idPedido;
	private DireccionDTO direccionCarga;
	private DireccionDTO direccionDestino;
	private Date fechaCarga;
	private int horaInicio;
	private int horaFin;
	private Date fechaMaxima;
	private List<CargaDTO> cargas;
	private float precio;
	private int sucursalOrigenId;
	private int sucursalDestinoId;
	private int sucursalActualId;
	private boolean solicitaTransporteDirecto;
	private boolean solicitaAvionetaParticular;
	private String estado;
	private ClienteDTO cliente;

	public PedidoDTO() {
	}

	public PedidoDTO(int idPedido, DireccionDTO direccionCarga, DireccionDTO direccionDestino, Date fechaCargaDate,
			int horaInicio, int horaFin, Date fechaMaximaDate, List<CargaDTO> cargas, float precio,
			int sucursalDestinoId, int sucursalOrigenId, int sucursalActualId, boolean solicitaTransporteDirecto,
			boolean solicitaAvionetaParticular, ClienteDTO cliente, String estado) {
		super();
		this.idPedido = idPedido;
		this.direccionCarga = direccionCarga;
		this.direccionDestino = direccionDestino;
		this.fechaCarga = fechaCargaDate;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.fechaMaxima = fechaMaximaDate;
		this.cargas = cargas;
		this.precio = precio;
		this.sucursalDestinoId = sucursalDestinoId;
		this.sucursalOrigenId = sucursalOrigenId;
		this.sucursalActualId = sucursalActualId;
		this.solicitaTransporteDirecto = solicitaTransporteDirecto;
		this.solicitaAvionetaParticular = solicitaAvionetaParticular;
		this.cliente = cliente;
		this.estado = estado;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public DireccionDTO getDireccionCarga() {
		return direccionCarga;
	}

	public void setDireccionCarga(DireccionDTO direccionCarga) {
		this.direccionCarga = direccionCarga;
	}

	public DireccionDTO getDireccionDestino() {
		return direccionDestino;
	}

	public void setDireccionDestino(DireccionDTO direccionDestino) {
		this.direccionDestino = direccionDestino;
	}

	public Date getFechaCarga() {
		return fechaCarga;
	}

	public void setFechaCarga(Date fechaCarga) {
		this.fechaCarga = fechaCarga;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}

	public Date getFechaMaxima() {
		return fechaMaxima;
	}

	public void setFechaMaxima(Date fechaMaxima) {
		this.fechaMaxima = fechaMaxima;
	}

	public List<CargaDTO> getCargas() {
		return cargas;
	}

	public void setCargas(List<CargaDTO> cargas) {
		this.cargas = cargas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isSolicitaTransporteDirecto() {
		return solicitaTransporteDirecto;
	}

	public void setSolicitaTransporteDirecto(boolean solicitaTransporteDirecto) {
		this.solicitaTransporteDirecto = solicitaTransporteDirecto;
	}

	public boolean isSolicitaAvionetaParticular() {
		return solicitaAvionetaParticular;
	}

	public void setSolicitaAvionetaParticular(boolean solicitaAvionetaParticular) {
		this.solicitaAvionetaParticular = solicitaAvionetaParticular;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public int getSucursalDestinoId() {
		return sucursalDestinoId;
	}

	public void setSucursalDestinoId(int sucursalDestinoId) {
		this.sucursalDestinoId = sucursalDestinoId;
	}

	public int getSucursalOrigenId() {
		return sucursalOrigenId;
	}

	public void setSucursalOrigenId(int sucursalOrigenId) {
		this.sucursalOrigenId = sucursalOrigenId;
	}

	public int getSucursalActualId() {
		return sucursalActualId;
	}

	public void setSucursalActualId(int sucursalActualId) {
		this.sucursalActualId = sucursalActualId;
	}

	public float getVolumenoTotalCargas() {
		float volumenCargaTotal = 0;
		for (CargaDTO carga : getCargas()) {
			volumenCargaTotal = carga.getVolumen() + volumenCargaTotal;
		}
		return volumenCargaTotal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
