package creacionales.fabrica.abstrac;

import creacionales.Imprimir;

public class ConexionSQLServer implements IConexion{

	@Override
	public void conectar() {
		Imprimir.imprimir("sql server");
		
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		
	}

}
