package creacionales.fabrica.abstrac;

import creacionales.Imprimir;

public class ConexionRESTVentas implements IConexionRest{

	@Override
	public void obtenerUrl(String url) {
		Imprimir.imprimir("http://"+url);
		
	}
}
