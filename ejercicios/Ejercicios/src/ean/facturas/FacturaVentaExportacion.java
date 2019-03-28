package ean.facturas;

import ean.ordenes.IordenTrabajo;

public class FacturaVentaExportacion extends Factura implements IordenTrabajo {

	public FacturaVentaExportacion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ObtenerNitTransportador() {
		System.out.println("paso por ObtenerNitTransportador factura venta exportación");
	}

}