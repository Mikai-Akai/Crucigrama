package crucigrama;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.Serializable;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Tablero extends JPanel implements Serializable{
	private int columnas = 12;
	private int filas = 22;
	private char[][] palabras = new char[14][];
	Tablero(){
		this.setVisible(true);
		this.setBorder(new TitledBorder(""));
		this.setForeground(Color.BLACK);
		this.setBackground(Color.WHITE);
		Container container = this.getRootPane();
		container = new Container();
		container.setLayout(new GridLayout(columnas,filas));
		Casilla prueba =new Casilla('a');
		prueba.setVisible(true);
		prueba.setOpaque(true);
		this.add(prueba);
	}
}
