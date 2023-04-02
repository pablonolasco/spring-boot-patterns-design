package creacionales.factory;

public class App {

	public static void main(String [] args) {
		FactoryConexion conexion= new FactoryConexion();
		IConexion c1= conexion.getConexion("mysql");
		c1.conectar();
		
		IConexion c2=conexion.getConexion("oracle");
		c2.conectar();
		
		IConexion c3= conexion.getConexion("sql server");
		c3.conectar();
	}
}
