/*
 * Programación Interactiva
 * Equipo de trabajo:
 * -Andres Pineda Cortez 1843660-3743
 * -Mateo Obando Gutierrez 1844983-3743
 * Taller # 2 -Juego Crucigrama
 */
package crucigrama;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
	
	/** The tablero. */
	private Tablero tablero = new Tablero();
	
	private Proceso proceso;
	/** The tab nuevo. */
	private Tablero tabNuevo = new Tablero();
	
	/** The escucha. */
	private Escucha escucha;
	
	/** The juego. */
	private JPanel juego;
	
	/** The pistas. */
	private JPanel pistas;
	
	/** The serializador. */
	private Serializacion serializador;
	
	/**
	 * Instantiates a new GUI crucigrama.
	 */
	public GUICrucigrama() {
		proceso = new Proceso();
		tabNuevo = new Tablero();
		initGUI();
		this.setTitle("Crucigrama-Tema: Conocimientos generales.");
		this.pack();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Inits the GUI.
	 */
	private void initGUI() {
		escucha = new Escucha();
		serializador = new Serializacion();
		JPanel juego = new JPanel();
		JPanel pistas = new JPanel();
		juego.setLayout(new GridLayout(12,22));
		add(juego);
		add(pistas);
		definirGUI();
		for(int y = 0; y < 22;y++) {
			for(int x = 0; x < 12; x++) {
				if(proceso.gettablero().getcasilla(x, y) != new Casilla('}')) {
						proceso.gettablero().getcasilla(x, y).addKeyListener(escucha);
						proceso.gettablero().getcasilla(x, y).setFocusable(true);
					
				}else {
					proceso.gettablero().getcasilla(x, y).setForeground(Color.WHITE);
					proceso.gettablero().getcasilla(x, y).setBackground(Color.WHITE);
				}
				juego.add(proceso.gettablero().getcasilla(x, y));
			}
		}
		this.addWindowListener(escucha);
	}

	/**
	 * Definir GUI.
	 */
	private void definirGUI() {
		
		String[] opciones = {"Abrir ultimo juego", "Juego nuevo"};
		String opcionTomada = (String) JOptionPane.showInputDialog(this, "¿Cómo deseas proceder?", "Opciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
		if(opcionTomada != null) {
			if(opcionTomada.equals("Abrir ultimo juego")) {
				Tablero temporal = serializador.desSerializarObjeto();
				proceso.cargarTablero(temporal);
			}else {
				
			}
		}else {
			System.exit(1);
		}
	}
	/**
	 * The Class Escucha.
	 */
	private class Escucha implements KeyListener, WindowListener{

		/**
		 * Window activated.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void windowActivated(WindowEvent arg0) {
			
			
		}

		/**
		 * Window closed.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void windowClosed(WindowEvent arg0) {
		
			
		}

		/**
		 * Window closing.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void windowClosing(WindowEvent arg0) {
		
			serializador.serializarCrucigrama(tablero);
		}

		/**
		 * Window deactivated.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void windowDeactivated(WindowEvent arg0) {
	
			
		}

		/**
		 * Window deiconified.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void windowDeiconified(WindowEvent arg0) {
	
			
		}

		/**
		 * Window iconified.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void windowIconified(WindowEvent arg0) {
	
			
		}

		/**
		 * Window opened.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void windowOpened(WindowEvent arg0) {

			
		}

		/**
		 * Key pressed.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void keyPressed(KeyEvent arg0) {

			
		}

		/**
		 * Key released.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void keyReleased(KeyEvent arg0) {

			
		}

		/**
		 * Key typed.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void keyTyped(KeyEvent arg0) {
			char letraReal = proceso.gettablero().getcasilla(arg0.getComponent().getX(), arg0.getComponent().getY()).getLetraReal();
			char letraUsuario = arg0.getKeyChar();
			if(letraReal == letraUsuario) {
				arg0.getComponent().setForeground(Color.BLUE);
			}else {
				arg0.getComponent().setForeground(Color.RED);
			}
			
		}
		
	}
}
