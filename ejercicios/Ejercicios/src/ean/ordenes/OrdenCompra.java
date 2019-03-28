package ean.ordenes;

public class OrdenCompra extends Orden implements IOrden {
	public OrdenCompra() {
	}
	
	public void ObtenerValorTotal() {
		System.out.println("paso por ObtenerValorTotal");
	}

	@Override
	public void AsignarEmpleado() {
		System.out.println("paso por ObtenerNitTransportador orden de compra");
		
	}

	@Override
	public void ProcesarValidarContraloria() {
		System.out.println("paso por ProcesarValidarContraloria orden de compra");
	}

}
