package creacionales.fabrica.abstrac;

public class FabricaProductor {

	public static FabricaAbstract getFactory(String factory) {
		
		if (factory.equalsIgnoreCase("db")) {
			return new ConexionFabrica();
		} else if(factory.equalsIgnoreCase("rest")){
			return new RestFabrica();
		}
		
		return null;
	}
}
