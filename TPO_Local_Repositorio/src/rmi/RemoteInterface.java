package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.CargaDTO;
import dto.ClienteDTO;
import dto.DireccionDTO;
import dto.EmpresaDTO;
import dto.EnvioDTO;
import dto.FacturaDTO;
import dto.HabilitadoDTO;
import dto.ParticularDTO;
import dto.SucursalDTO;
import dto.PedidoDTO;
import dto.RutaDTO;
import dto.TransporteDTO;
import dto.TrayectoDTO;
import dto.VehiculoDTO;
import dto.ViajeDTO;

public interface RemoteInterface extends Remote {
	
	public void cargarDatosIniciales() throws RemoteException;
	
	public void altaPedido(PedidoDTO pedidoDTO) throws RemoteException;
	
	public void altaCliente(ClienteDTO clienteDto) throws RemoteException;
	public void altaClienteEmpresa(EmpresaDTO empresaDto) throws RemoteException;
	public void altaClienteParticular(ParticularDTO particularDto) throws RemoteException;
	public void updateClienteEmpresa(EmpresaDTO empresaDto) throws RemoteException;
	public void updateClienteParticular(ParticularDTO particularDto) throws RemoteException;
	public void deleteClienteParticular(int idCliente) throws RemoteException;
	public void deleteClienteEmpresa(int idCliente) throws RemoteException;
	
	public List<ViajeDTO> obtenerViajes() throws RemoteException;

	public VehiculoDTO obtenerVehiculo(VehiculoDTO v) throws RemoteException;

	public ViajeDTO obtenerViajePorVehiculo(VehiculoDTO vehiculo)
			throws RemoteException;

	public void actualiarViaje(ViajeDTO viaje) throws RemoteException;

	public List<ViajeDTO> controlarPedidosDeCliente(ClienteDTO c)
			throws RemoteException;

	public ViajeDTO obtenerViaje(ViajeDTO viajeDTO) throws RemoteException;

	public void demorarViaje(ViajeDTO viajeDTO, int m) throws RemoteException;

	public void actualizarViajes(TrayectoDTO trayDTO, SucursalDTO sucursalDTO)
			throws RemoteException;

	public List<TransporteDTO> obtenerTransportesDeTerceros(CargaDTO c,
			TransporteDTO tr) throws RemoteException;

	public void altaFactura(FacturaDTO f) throws RemoteException;

	public List<PedidoDTO> obtenerPedidos() throws RemoteException;

	public void actualizarPedido(PedidoDTO pedido) throws RemoteException;

	public ClienteDTO obtenerClientePorID(int id) throws RemoteException;

	public List<ClienteDTO> obtenerClientes() throws RemoteException;
	public List<EmpresaDTO> obtenerClientesEmpresa() throws RemoteException;
	public List<ParticularDTO> obtenerClientesParticular() throws RemoteException;

	public String validarCredenciales(String username, String password)
			throws RemoteException;

	public void recibir(ViajeDTO v) throws RemoteException;

	public PedidoDTO obtenerPedido(int idPedido) throws RemoteException;

	public List<CargaDTO> obtenerCargasDeUnPedido(PedidoDTO pedido)
			throws RemoteException;

	public List<HabilitadoDTO> obtenerHabilitados() throws RemoteException;

	public List<EnvioDTO> obtenerEnvios(String nombre) throws RemoteException;

	public List<TransporteDTO> obtenerTransportes() throws RemoteException;

	public List<VehiculoDTO> obtenerVehiculos() throws RemoteException;

	public boolean ControlarVehiculo(VehiculoDTO vehiculoDTO)
			throws RemoteException;

	public void controlarEstadoDeEnvios() throws RemoteException;
	public List<CargaDTO> listarCargas() throws RemoteException;
	
	// Sucursal
	public List<SucursalDTO> obtenerSucursales() throws RemoteException;
	public void altaSucursal(SucursalDTO sucursalDto) throws RemoteException;
	public void updateSucursal(SucursalDTO sucursalDto) throws RemoteException;
	public void deleteSucursal(int idSucursal) throws RemoteException;
	
	// Trayecto
	public List<TrayectoDTO> obtenerTrayectos() throws RemoteException;
	public void altaTrayecto(TrayectoDTO trayectoDto) throws RemoteException;
	public void updateTrayecto(TrayectoDTO trayectoDto) throws RemoteException;
	public void deleteTrayecto(int idTrayecto) throws RemoteException;
	
	// Ruta
	public void actualizarMapaDeRutas(TrayectoDTO t) throws RemoteException; // TODO Ojo con esto
	public List<RutaDTO> obtenerRutas() throws RemoteException;
	public void altaRuta(RutaDTO rutaDto) throws RemoteException;
	public void updateRuta(RutaDTO rutaDto) throws RemoteException;
	public void deleteRuta(int idRuta) throws RemoteException;
	
	//Carga
	public void createCarga(CargaDTO cargaDto) throws RemoteException;
	public void updateCarga(CargaDTO cargaDto) throws RemoteException;
	public void deleteCarga(int idCarga) throws RemoteException;
	
	//Pedido
	public void crearPedido(PedidoDTO p) throws RemoteException;
	
}
