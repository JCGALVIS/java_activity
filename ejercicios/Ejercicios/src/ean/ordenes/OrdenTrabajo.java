package ean.ordenes;

public class OrdenTrabajo extends Orden implements IOrden, IordenTrabajo {
	@Override
	public void AsignarEmpleado() {
		System.out.println("paso por ObtenerNitTransportador orden de trabajo");
	}

	@Override
	public void ProcesarValidarContraloria() {
		System.out.println("paso por ProcesarValidarContraloria orden de trabajo");
	}

	@Override
	public void ObtenerNitTransportador() {
		System.out.println("paso por ObtenerNitTransportador orden de trabajo");
	}

}
