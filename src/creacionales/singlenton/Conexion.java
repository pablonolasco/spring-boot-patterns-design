package creacionales.singlenton;

import creacionales.Imprimir;

/**
 * 
 * @author pnolasco es un patrón de diseño creacional que nos permite
 *         asegurarnos de que una clase tenga una única instancia, a la vez que
 *         proporciona un punto de acceso global a dicha instancia
 */
public class Conexion {

	// Todas las implementaciones del patrón Singleton tienen estos dos pasos en común
	// Declaracion
	private static Conexion instancia;

	// Para evitar instancia mendiante operador new
	// 1- Hacer privado el constructor por defecto para evitar que otros objetos
	// utilicen el operador new con la clase Singleton
	private Conexion() {

	}

	// Crear un método de creación estático que actúe como constructor. Tras
	// bambalinas, este método invoca al constructor
	// privado para crear un objeto y lo guarda en un campo estático. Las siguientes
	// llamadas a este método devuelven el objeto almacenado en caché.
	public static Conexion getInstancia() {
		if (instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}

	// Metodo prueba
	public void conectar() {
		Imprimir.imprimir("Me conecte a la BD");
	}

	// Metodo prueba
	public void desconectar() {
		Imprimir.imprimir("Me desconecte de la BD");
	}

}
