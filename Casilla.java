/*
 * Programaci�n Interactiva
 * Equipo de trabajo:
 * -Andres Pineda Cortez 1843660-3743
 * -Mateo Obando Gutierrez 1844983-3743
 * Taller # 2 -Juego Crucigrama
 */
package crucigrama;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.Serializable;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/**
 * The Class Casilla.
 */
@SuppressWarnings("serial")
public class Casilla extends JTextField implements Serializable{
	
	private char letraReal;
	
	/**
	 * Instantiates a new casilla.
	 *
	 * @param a the a
	 */
	public Casilla(char a) {
		letraReal = a;
		this.setPreferredSize(new Dimension(27,27));
		this.setBackground(Color.WHITE);
		this.setForeground(Color.BLACK);
		Font font = new Font(Font.DIALOG,Font.BOLD,26);
		this.setFont(font);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setOpaque(true);
		this.setVisible(true);
		
		if(	letraReal == '1'||
			letraReal == '2'||
			letraReal == '3'||
			letraReal == '4'||
			letraReal == '5'||
			letraReal == '6'||
			letraReal == '7'||
			letraReal == '8') {
			this.setText(String.valueOf(letraReal));
			this.setFocusable(false);
			this.setEditable(false);
			this.setEnabled(false);
		}
		if(letraReal == '0') {
			this.setEditable(false);
			this.setFocusable(false);
			this.setEnabled(false);
		}
	}
	
	
	public char getLetraReal() {
		return letraReal;
	}
	
	/**
	 * Sets the letra.
	 *
	 * @param letra the new letra
	 */
	public void setLetra(char letra) {
		if(this.isEnabled() == true){
			this.setText(String.valueOf(letra));
			if(letra != letraReal) {
				this.setForeground(Color.RED);
			}else {
				this.setForeground(Color.BLUE);
				this.setEnabled(false);
			}
		}
	}
	
	/**
	 * Mostrar letra.
	 */
}