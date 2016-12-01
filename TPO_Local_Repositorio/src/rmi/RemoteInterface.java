package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.CargaDTO;
import dto.DireccionDTO;
import dto.EmpresaDTO;
import dto.EnvioDTO;
import dto.FacturaDTO;
import dto.ParticularDTO;
import dto.PedidoDTO;
import dto.PlanDeMantenimientoDTO;
import dto.RemitoDTO;
import dto.RutaDTO;
import dto.SucursalDTO;
import dto.TrayectoDTO;
import dto.VehiculoAMantenerDTO;
import dto.VehiculoDTO;
import dto.VehiculoTerceroDTO;

public interface RemoteInterface extends Remote {
	
	// Funciones de Negocio
	
	public void cargarDatosIniciales() throws RemoteException;
	public boolean controlarVehiculo(VehiculoDTO vehiculoDTO)
			throws RemoteException;
	public void controlarEstadoDeEnvios() throws RemoteException;
	public void crearEnvioDirecto(int idPedido) throws RemoteException;
	
	// Cliente Empresa
	
	public List<EmpresaDTO> obtenerClientesEmpresa() throws RemoteException;
	public void altaClienteEmpresa(EmpresaDTO empresaDto) throws RemoteException;
	public void deleteClienteEmpresa(int idCliente) throws RemoteException;
	public void updateClienteEmpresa(EmpresaDTO empresaDto) throws RemoteException;
	
	// Cliente Particular
	
	public List<ParticularDTO> obtenerClientesParticular() throws RemoteException;
	public void altaClienteParticular(ParticularDTO particularDto) throws RemoteException;
	public void updateClienteParticular(ParticularDTO particularDto) throws RemoteException;
	public void deleteClienteParticular(int idCliente) throws RemoteException;
	
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
	
	public List<PedidoDTO> obtenerPedidos() throws RemoteException;
	public void crearPedido(PedidoDTO p) throws RemoteException;
	
	//Carga
	
	public CargaDTO buscarCargaPorId(int idCarga) throws RemoteException;
	public List<CargaDTO> listarCargas() throws RemoteException;
	public List<CargaDTO> listarCargasSinDespachar() throws RemoteException;	
	
	//Vehiculo
	
	public List<VehiculoDTO> obtenerVehiculos() throws RemoteException;
	public void crearVehiculo(VehiculoDTO v) throws RemoteException;
	public void modificarVehiculo(VehiculoDTO v) throws RemoteException;
	public void eliminarVehiculo(VehiculoDTO v) throws RemoteException;
	
	//Direcciones
	
	public List<DireccionDTO> listarDirecciones() throws RemoteException;
	public DireccionDTO obtenerDireccionPorId(int idDireccion) throws RemoteException;
	public void crearDireccion(DireccionDTO d) throws RemoteException;
	public void modificarDireccion(DireccionDTO d) throws RemoteException;
	public void eliminarDireccion(DireccionDTO d) throws RemoteException;
	
	//Envio
	
	public List<EnvioDTO> obtenerEnvios() throws RemoteException;
	
	//Plan de mantenimiento
	
	public List<PlanDeMantenimientoDTO> listarPlanesDeMantenimiento() throws RemoteException;
	public void altaPlanMantenimiento(PlanDeMantenimientoDTO plan) throws RemoteException;
	public void deletePlanDeMantenimiento(int idPlan) throws RemoteException;
	public void updatePlanDeMantenimiento(PlanDeMantenimientoDTO plan) throws RemoteException;
	public List<VehiculoAMantenerDTO> getVehiculosAMantener() throws RemoteException;

	//Vehiculo Tercero
	
	public List<VehiculoTerceroDTO> listarVTerceros() throws RemoteException;
	public void crearVTerceros(VehiculoTerceroDTO v) throws RemoteException;
	public void modificarVTerceros(VehiculoTerceroDTO v) throws RemoteException;
	public void eliminarVTerceros(VehiculoTerceroDTO v) throws RemoteException;
	public VehiculoTerceroDTO buscarVehiculoTerceroDTO(int idVehiculoTerceroDTO) throws RemoteException;
	
	//Facturas
	
	public List<FacturaDTO> listarFacturas() throws RemoteException;
	public void altaFactura(FacturaDTO factura) throws RemoteException;
	public void deleteFactura(int idFactura) throws RemoteException;
	
	//Remitos
	
	public List<RemitoDTO> listarRemitos() throws RemoteException;
	public void altaRemito(RemitoDTO remito) throws RemoteException;
	public void deleteRemito(int idRemito) throws RemoteException;
}
