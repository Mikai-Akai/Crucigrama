/*
 * Programación Interactiva
 * Equipo de trabajo:
 * -Andres Pineda Cortez 1843660-3743
 * -Mateo Obando Gutierrez 1844983-3743
 * Taller # 2 -Juego Crucigrama
 */
package crucigrama;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * The Class GUICrucigrama.
 */
@SuppressWarnings("serial")
public class GUICrucigrama extends JFrame{
	private Proceso proceso = new Proceso();
	private Pistas pistas = new Pistas();
	private Tablero crucigrama = proceso.gettablero();
	private Escucha escucha = new Escucha();
	private JPanel panelJuego = new JPanel();
	private Serializacion serializar = new Serializacion();
	
	public GUICrucigrama() {
		initGUI();
		this.setTitle("Crucigrama: Conocimiento general");
		this.pack();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void initGUI() {
		definirGUI();
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(1,2));
		container.add(pistas);
		container.add(crucigrama);
	}
	private void definirGUI() {
		String[] opciones = {"Restaurar Juego", "Nuevo Juego"};
		String opcionTomada = (String) JOptionPane.showInputDialog(this, "¿Cómo quieres iniciar la ventana?", "Opciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
		if(opcionTomada != null) {
			if(opcionTomada.equals("Restaurar Juego")) {
				Tablero temporal = serializar.desSerializarObjeto();
				proceso.cargarTablero(temporal);
			}else if(opcionTomada.equals("Nuevo Juego")) {
			}
		}else {
			System.exit(1);
		}
	}
	private class Escucha implements WindowListener{
		private Casilla seleccionada;
		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * Window closing.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			serializar.serializarCrucigrama(proceso.gettablero());
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
