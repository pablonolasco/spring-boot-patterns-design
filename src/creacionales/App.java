package creacionales;

import creacionales.singlenton.Conexion;

public class App {

	public static void main(String [] args) {
		Conexion conexion=Conexion.getInstancia();
		
		conexion.conectar();
		
		conexion.desconectar();
	}
}
