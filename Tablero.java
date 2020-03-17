/*
 * Programaci�n Interactiva
 * Equipo de trabajo:
 * -Andres Pineda Cortez 1843660-3743
 * -Mateo Obando Gutierrez 1844983-3743
 * Taller # 2 -Juego Crucigrama
 */
package crucigrama;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Tablero extends JPanel implements Serializable{
	private int columnas = 12;
	private int filas = 22;
	private Escucha escucha = new Escucha();
	private Escucha escuchaLetra = new Escucha();
	private Casilla auxiliar;
	private Casilla temporal;
	private FileReader lectorArchivo;
	private BufferedReader entrada;
	private char[][] matriz = new char[22][12];
	
	/**
	 * Instantiates a new tablero.
	 */
	Tablero(){
		String auxLeer = "";
		char subChar;
		try {
			lectorArchivo = new FileReader("src/Guardado/Respuestas");
			entrada = new BufferedReader(lectorArchivo);
			for(int y = 0; y < 22;y++) {
				auxLeer = entrada.readLine();
				for(int x = 0; x < 12;x++) {
					subChar = auxLeer.charAt(x);
					matriz[y][x] = subChar;
				}
			}
			
		} catch (FileNotFoundException e) {
			// 
			e.printStackTrace();
		} catch (IOException e) {
			//
			e.printStackTrace();
		}
		this.setVisible(true);
		this.setPreferredSize(new Dimension(200,700));
		this.setBorder(new TitledBorder(""));
		this.setBackground(Color.WHITE);
		Container container = this.getRootPane();
		container = new Container();
		container.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridheight = 0;
		constraints.gridwidth = 0;
		for(int x = 0;x< filas;x++) {
			for(int y= 0;y < columnas;y++) {
				constraints.gridx = x;
				constraints.gridy = y;
				auxiliar = new Casilla(matriz[x][y]);
				auxiliar.addKeyListener(escuchaLetra);
				auxiliar.addMouseListener(escucha);
				auxiliar.setVisible(true);
				if(auxiliar.getLetraReal() != '0') {
					auxiliar.setBorder(new TitledBorder(""));
				}
				this.add(auxiliar,constraints);
			}
			
		}
		
	}
	public char[][] getMatriz(){
		return matriz;
	}
	private class Escucha implements KeyListener,MouseListener{
		
		public void keyPressed(KeyEvent e) {
			// 
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// 
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// 
			temporal.setLetra(e.getKeyChar());
			
			}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// 
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// 
			temporal = (Casilla) arg0.getComponent();
			if(	temporal.getLetraReal() != '0'&&
				temporal.getLetraReal() != ' '&&
				temporal.getLetraReal() != '1'&&
				temporal.getLetraReal() != '2'&&
				temporal.getLetraReal() != '3'&&
				temporal.getLetraReal() != '4'&&
				temporal.getLetraReal() != '5'&&
				temporal.getLetraReal() != '6'&&
				temporal.getLetraReal() != '7'&&
				temporal.getLetraReal() != '8') {
				arg0.getComponent().setBackground(Color.LIGHT_GRAY);
				
			}
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// 
			arg0.getComponent().setBackground(Color.WHITE);
			arg0.getComponent().setForeground(Color.BLACK);
			arg0.setSource(temporal);
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// 
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// 
			
		}
		
	}
}