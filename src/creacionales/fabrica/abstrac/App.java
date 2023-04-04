package creacionales.fabrica.abstrac;

public class App {

	public static void main(String [] args) {
		FabricaAbstract conexion= FabricaProductor.getFactory("db");
		IConexion c1= conexion.getBD("mysql");
		c1.conectar();
		
		IConexionRest c2=conexion.getREST("compras");
		c2.obtenerUrl("");
		
		
	}
}
