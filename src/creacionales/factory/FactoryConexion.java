package creacionales.factory;

/**
 * 
 * @author pnolasco 
 * Factory Method es un patrón de diseño creacional que
 * proporciona una interfaz para crear objetos en una superclase,
 * mientras permite a las subclases alterar el tipo de objetos que se
 * crearán.
 * 
 */
public class FactoryConexion {

	public IConexion getConexion(String e) {

		switch (e) {
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
}
