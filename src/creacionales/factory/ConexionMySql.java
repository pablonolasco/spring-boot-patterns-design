package creacionales.factory;

import creacionales.Imprimir;

public class ConexionMySql implements IConexion{

	@Override
	public void conectar() {
		Imprimir.imprimir("conexion mysql");
		
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		
	}

}
