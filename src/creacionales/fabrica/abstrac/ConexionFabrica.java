package creacionales.fabrica.abstrac;

/**
 * 
 * @author pnolasco Factory Method es un patrón de diseño creacional que
 *         proporciona una interfaz para crear objetos en una superclase,
 *         mientras permite a las subclases alterar el tipo de objetos que se
 *         crearán.
 * 
 */
public class ConexionFabrica implements FabricaAbstract {


	@Override
	public IConexion getBD(String motor) {
		// TODO Auto-generated method stub
		switch (motor) {
		case "mysql":
			return new ConexionMySql();

		case "oracle":
			return new ConexionOracle();

		case "sql server":
			return new ConexionSQLServer();

		default:
			return null;

		}
	}

	@Override
	public IConexionRest getREST(String area) {
		// TODO Auto-generated method stub
		return null;
	}
}
