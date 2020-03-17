/*
 * Programación Interactiva
 * Equipo de trabajo:
 * -Andres Pineda Cortez 1843660-3743
 * -Mateo Obando Gutierrez 1844983-3743
 * Taller # 2 -Juego Crucigrama
 */
package crucigrama;

import java.awt.EventQueue;

import javax.swing.UIManager;

// TODO: Auto-generated Javadoc
/**
 * The Class Principal.
 */
public class PrincipalCrucigrama {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
		      String className = UIManager.getCrossPlatformLookAndFeelClassName();
		      UIManager.setLookAndFeel(className);
		    }
		catch (Exception e) {}
		 
		EventQueue.invokeLater(new Runnable() {
		                           public void run() {
		                           @SuppressWarnings("unused")
								GUICrucigrama miVentana = new GUICrucigrama();
		                           }
		});


	}

}