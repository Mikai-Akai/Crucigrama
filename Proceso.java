/*
 * Programación Interactiva
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
	
	private Tablero crucigrama;
	
	Proceso(){
		crucigrama = new Tablero();
	}
	public void cargarTablero(Tablero a) {
		crucigrama = a;
	}
	public Tablero gettablero() {
		return crucigrama;
	}
}
