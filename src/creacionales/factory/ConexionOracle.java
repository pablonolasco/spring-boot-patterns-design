package creacionales.factory;

import creacionales.Imprimir;

public class ConexionOracle implements IConexion{

	@Override
	public void conectar() {
		Imprimir.imprimir("conexion oracle");
		
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		
	}

}
