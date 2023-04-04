package creacionales.fabrica.abstrac;

public class RestFabrica implements FabricaAbstract{

	@Override
	public IConexion getBD(String motor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConexionRest getREST(String area) {
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}
		
		return null;
	}

}
