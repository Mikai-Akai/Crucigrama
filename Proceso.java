/*
 * Programaci�n Interactiva
 * Equipo de trabajo:
 * -Andres Pineda Cortez 1843660-3743
 * -Mateo Obando Gutierrez 1844983-3743
 * Taller # 2 -Juego Crucigrama
 */
package crucigrama;

// TODO: Auto-generated Javadoc
/**
 * The Class Proceso.
 */
public class Proceso {
	
	/** The crucigrama. */
	private Tablero crucigrama;
	
	/**
	 * Instantiates a new proceso.
	 */
	Proceso(){
		crucigrama = new Tablero();
	}
	
	/**
	 * Cargar tablero.
	 *
	 * @param a the a
	 */
	public void cargarTablero(Tablero a) {
		crucigrama = a;
	}
	
	/**
	 * Gets the tablero.
	 *
	 * @return the tablero
	 */
	public Tablero gettablero() {
		return crucigrama;
	}
}
