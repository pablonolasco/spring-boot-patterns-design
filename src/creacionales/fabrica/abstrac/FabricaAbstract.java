package creacionales.fabrica.abstrac;

public interface FabricaAbstract {
	IConexion getBD(String motor);
	IConexionRest getREST(String area);
}
