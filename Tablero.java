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
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Tablero extends JPanel implements Serializable{
	private int columnas = 12;
	private int filas = 22;
	private Escucha escucha = new Escucha();
	private Casilla auxiliar;
	Casilla temporal;
	private char[][] matriz = {
			{' ',' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ',' ',' ','z',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ',' ','1','a',' ',' ',' '},
			{' ',' ','1','l','a','d','r','o','n','e','s',' '},
			{' ',' ',' ','2',' ',' ',' ','r','c',' ',' ',' '},
			{' ',' ','2','p','e','r','r','o','u',' ',' ',' '},
			{' ',' ',' ','r',' ',' ',' ',' ','d',' ',' ',' '},
			{'5','m','i','o',' ',' ',' ',' ','o',' ',' ',' '},
			{' ',' ',' ','f',' ',' ',' ',' ',' ',' ',' ',' '},
			{'4','h','u','e','v','o',' ',' ',' ',' ',' ',' '},
			{' ','3',' ','s','5',' ',' ',' ',' ',' ',' ',' '},
			{' ','g',' ','o','c',' ',' ',' ',' ',' ',' ',' '},
			{'3','a','r','r','o','z',' ',' ',' ',' ',' ',' '},
			{' ','t',' ',' ','r',' ',' ',' ',' ',' ',' ',' '},
			{' ','o','8','l','o','r','o',' ',' ','6',' ',' '},
			{' ',' ',' ',' ','n',' ',' ',' ',' ','i',' ',' '},
			{' ','6','p','l','a','n','t','a','s','g',' ',' '},
			{' ',' ',' ',' ','v',' ',' ',' ',' ','l',' ',' '},
			{' ',' ','7','h','i','d','r','o','g','e','n','o'},
			{' ',' ',' ',' ','r',' ',' ',' ',' ','s',' ',' '},
			{' ',' ',' ',' ','u',' ',' ',' ',' ','i',' ',' '},
			{' ',' ',' ',' ','s',' ',' ',' ',' ','a',' ',' '},
	};
	
	/**
	 * Instantiates a new tablero.
	 */
	Tablero(){
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
				auxiliar.addKeyListener(escucha);
				auxiliar.addMouseListener(escucha);
				auxiliar.setVisible(true);
				if(auxiliar.getLetraReal() != ' ') {
					auxiliar.setBorder(new TitledBorder(""));
				}
				this.add(auxiliar,constraints);
			}
			
		}
		
	}
	private class Escucha implements KeyListener,MouseListener{
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			temporal.setLetra(e.getKeyChar());
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			temporal = (Casilla) arg0.getComponent();
			if(temporal.getLetraReal() != ' '&&
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
			// TODO Auto-generated method stub
			arg0.getComponent().setBackground(Color.WHITE);
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
