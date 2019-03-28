package ean.terceros;

public abstract class Tercero {
	public abstract void liquidar();
	
	public void validarSarglaft() {
		System.out.println("paso por validarSarglaft");
	}
	
	public static Tercero crearTercero(TipoTerceros opcion) {
		switch (opcion) {
		case CLIENTE: //Cliente
			return (new Cliente());
		case PROVEEDOR: //Proveedor
			return (new Proveedor());
		case EMPLEADO: //Empleado
			return (new Empleado());
		default:
			return null;
		}
	}
}
