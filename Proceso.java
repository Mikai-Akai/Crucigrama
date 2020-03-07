/*
 * Programación Interactiva
 * Equipo de trabajo:
 * -Andres Pineda Cortez 1843660-3743
 * -Mateo Obando Gutierrez 1844983-3743
 * Taller # 2 -Juego Crucigrama
 */
package crucigrama;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.border.Border;

// TODO: Auto-generated Javadoc
/**
 * The Class Proceso.
 */
public class Proceso {
	private String[] pistas = {"Horizontales:"
			," "
			,"1. amigos de lo ajeno."
			,"2. el mejor amigo del hombre."
			,"3. por cada taza, dos de agua."
			,"4. lo pone la gallina."
			,"5. transporte publico de cali."
			,"6. convierten el CO2 en O."
			,"7. primer elemento de la tabla periodica."
			,"8. se dice del animal que parlotea."
			," "
			,"Verticales:"
			," "
			,"1. elemento con el simbolo quimico [Au]."
			,"2. aquel que enseña."
			,"3. felino domestico."
			,"4. su picadura contagia el dengue."
			,"5. virus 2020 que ha reducido la contaminacion en china."
			,"6. lugar de oracion."};
	private Tablero crucigrama;
	
	Proceso(){
		crucigrama = new Tablero();
	}
	public void cargarTablero(Tablero a) {
		crucigrama = a;
	}
	public String[] verPistas() {
		return pistas;
	}
	public Tablero gettablero() {
		return crucigrama;
	}
}
