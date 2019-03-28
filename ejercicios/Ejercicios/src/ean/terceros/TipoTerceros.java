package ean.terceros;

public enum TipoTerceros {
	CLIENTE(1),
	PROVEEDOR(2),
	EMPLEADO(3);
	
	private int tipoTercero;
	
	private TipoTerceros (int tipoTercero) {
		this.tipoTercero = tipoTercero;
	}
	
	public int getTipoTercero() {
		return tipoTercero;
	}

}
