/*
 * Programación Interactiva
 * Equipo de trabajo:
 * -Andres Pineda Cortez 1843660-3743
 * -Mateo Obando Gutierrez 1844983-3743
 * Taller # 2 -Juego Crucigrama
 */
package crucigrama;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
// TODO: Auto-generated Javadoc

/**
 * The Class Pistas.
 */
@SuppressWarnings("serial")
public class Pistas extends JTextArea {
	
	private FileReader fileRead;
	private BufferedReader input;
	
	/** The pistas. */
	//private String[] pistas;
		
		/*{"Horizontales:\n"
			+" \n"
			+"	1. amigos de lo ajeno.\n"
			+"	2. el mejor amigo del hombre.\n"
			+"	3. por cada taza, dos de agua.\n"
			+"	4. lo pone la gallina.\n"
			+"	5. transporte publico de cali.\n"
			+"	6. convierten el CO2 en O.\n"
			+"	7. primer elemento de la tabla periodica.\n"
			+"	8. se dice del animal que parlotea.\n"
			+" \n"
			+"Verticales:\n"
			+" \n"
			+"	1. elemento con el simbolo quimico [Au].\n"
			+"	2. aquel que enseña.\n"
			+"	3. felino domestico.\n"
			+"	4. su picadura contagia el dengue.\n"
			+"	5. virus 2020 que ha reducido la contaminacion en china.\n"
			+"	6. lugar de oracion.\n"};*/
		
	public String lecturaFile() {
		String texto="";
		try {
			fileRead = new FileReader("src/Guardado/Pistas.txt");
			input = new BufferedReader(fileRead);
			
			String linea =input.readLine();
			while(linea!=null) {
				texto+=linea;
				texto+="\n";
				linea=input.readLine();
			}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 return texto;
	}
	
	/**
	 * Instantiates a new pistas.
	 */
	    Pistas(){
		this.setBorder(new TitledBorder(""));
		this.setForeground(Color.BLACK);
		this.setBackground(Color.WHITE);
		this.setOpaque(true);
		this.setEditable(false);
		lecturaFile();	
		this.setText(lecturaFile());
		//this.setText(pistas[0]);
		Font font = new Font(Font.DIALOG,Font.ITALIC,12);
		this.setFont(font);
	}
}
