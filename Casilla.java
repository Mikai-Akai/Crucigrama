/*
 * Programación Interactiva
 * Equipo de trabajo:
 * -Andres Pineda Cortez 1843660-3743
 * -Mateo Obando Gutierrez 1844983-3743
 * Taller # 2 -Juego Crucigrama
 */
package crucigrama;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * The Class Casilla.
 */
public class Casilla extends JLabel{
	
	/** The letra. */
	private char letraUsuario = ' ';
	private char letraReal;
	/**
	 * Instantiates a new casilla.
	 */
	public Casilla(char a) {
		letraReal = a;
		this.setPreferredSize(new Dimension(50,50));
		this.setBackground(Color.WHITE);
		this.setForeground(Color.BLACK);
		Font font = new Font(Font.DIALOG,Font.BOLD,26);
		this.setFont(font);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setOpaque(true);
		this.setVisible(true);
	}
	
	
	public char getLetraReal() {
		return letraReal;
	}
	/**
	 * Gets the letra.
	 *
	 * @return the letra
	 */
	public char getLetraUsuario() {
		return letraUsuario;
	}
	
	/**
	 * Sets the letra.
	 *
	 * @param letra the new letra
	 */
	public void setLetra(char letra) {
		this.letraUsuario = letra;
		this.setText(String.valueOf(letraUsuario));
	}
	
	/**
	 * Mostrar letra.
	 */
}
