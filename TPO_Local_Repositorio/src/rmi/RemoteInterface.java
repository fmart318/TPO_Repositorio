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
import dto.PedidoDTO;
import dto.PlanDeMantenimientoDTO;
import dto.PrecioVehiculoDTO;
import dto.ProductoDTO;
import dto.RemitoDTO;
import dto.RutaDTO;
import dto.SucursalDTO;
import dto.TransporteDTO;
import dto.TrayectoDTO;
import dto.VehiculoAMantenerDTO;
import dto.VehiculoDTO;

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

	public List<TransporteDTO> obtenerTransportesDeTerceros(CargaDTO c,
			TransporteDTO tr) throws RemoteException;

	public List<PedidoDTO> obtenerPedidos() throws RemoteException;

	public void actualizarPedido(PedidoDTO pedido) throws RemoteException;

	public ClienteDTO obtenerClientePorID(int id) throws RemoteException;

	public List<ClienteDTO> obtenerClientes() throws RemoteException;
	public List<EmpresaDTO> obtenerClientesEmpresa() throws RemoteException;
	public List<ParticularDTO> obtenerClientesParticular() throws RemoteException;

	public String validarCredenciales(String username, String password)
			throws RemoteException;


	public PedidoDTO obtenerPedido(int idPedido) throws RemoteException;


	public List<HabilitadoDTO> obtenerHabilitados() throws RemoteException;

	public List<TransporteDTO> obtenerTransportes() throws RemoteException;


	public boolean ControlarVehiculo(VehiculoDTO vehiculoDTO)
			throws RemoteException;

	public void controlarEstadoDeEnvios() throws RemoteException;

	
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
	public PedidoDTO buscarPedidoPorId(int idPedido) throws RemoteException;
	
	//Carga
	public CargaDTO buscarCargaPorId(int idCarga) throws RemoteException;
	public List<CargaDTO> obtenerCargasDeUnPedido(PedidoDTO pedido) throws RemoteException;
	public List<CargaDTO> listarCargas() throws RemoteException;
	public List<CargaDTO> listarCargasSinDespachar() throws RemoteException;	
	
	//Veh�culo
	public VehiculoDTO obtenerVehiculo(VehiculoDTO v) throws RemoteException;
	public List<VehiculoDTO> obtenerVehiculos() throws RemoteException;
	public void crearVehiculo(VehiculoDTO v) throws RemoteException;
	public void modificarVehiculo(VehiculoDTO v) throws RemoteException;
	public void eliminarVehiculo(VehiculoDTO v) throws RemoteException;
	
	//Direcciones
	public List<DireccionDTO> listarDirecciones() throws RemoteException;
	public void crearDireccion(DireccionDTO d) throws RemoteException;
	public void modificarDireccion(DireccionDTO d) throws RemoteException;
	public void eliminarDireccion(DireccionDTO d) throws RemoteException;
	
	//Envio
	public List<EnvioDTO> listarEnvios() throws RemoteException;
	
	//Plan de mantenimiento
	public List<PlanDeMantenimientoDTO> listarPlanesDeMantenimiento() throws RemoteException;
	public void altaPlanMantenimiento(PlanDeMantenimientoDTO plan) throws RemoteException;
	public void deletePlanDeMantenimiento(int idPlan) throws RemoteException;
	public void updatePlanDeMantenimiento(PlanDeMantenimientoDTO plan) throws RemoteException;
	public List<VehiculoAMantenerDTO> getVehiculosAMantener() throws RemoteException;

	//PrecioVehiculo
	public List<PrecioVehiculoDTO> listarVTerceros() throws RemoteException;
	public void crearVTerceros(PrecioVehiculoDTO v) throws RemoteException;
	public void modificarVTerceros(PrecioVehiculoDTO v) throws RemoteException;
	public void eliminarVTerceros(PrecioVehiculoDTO v) throws RemoteException;
	public void crearEnvioDirecto(int idPedido, int idPrecioVehiculo) throws RemoteException;
	public PrecioVehiculoDTO buscarPrecioVehiculoDTO(int idPrecioVehiculoDTO) throws RemoteException;
	
	//Habilitado
	public List<HabilitadoDTO> listarHabilitados() throws RemoteException;
	public void crearHabilitacion(HabilitadoDTO v) throws RemoteException;
	public void modificarHabilitacion(HabilitadoDTO v) throws RemoteException;
	public void eliminarHabilitacion(HabilitadoDTO v) throws RemoteException;
	
	//productos
	public List<ProductoDTO> listarProductos() throws RemoteException;
	public void crearProducto(ProductoDTO v) throws RemoteException;
	public void modificarProducto(ProductoDTO v) throws RemoteException;
	public void eliminarProduct(ProductoDTO v) throws RemoteException;
	public void crearEnvioDirecto(PedidoDTO p) throws RemoteException;
	

	//Facturas
	public List<FacturaDTO> listarFacturas() throws RemoteException;
	public void altaFactura(FacturaDTO factura) throws RemoteException;
	public void deleteFactura(int idFactura) throws RemoteException;
	
	//Remitos
	public List<RemitoDTO> listarRemitos() throws RemoteException;
	public void altaRemito(RemitoDTO remito) throws RemoteException;
	public void deleteRemito(int idRemito) throws RemoteException;
}
