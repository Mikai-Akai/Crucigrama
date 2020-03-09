package crucigrama;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
@SuppressWarnings("serial")
public class Pistas extends JTextArea {
	private String[] pistas = {"Horizontales:\n"
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
			+"	6. lugar de oracion.\n"};
	
	Pistas(){
		this.setBorder(new TitledBorder(""));
		this.setForeground(Color.BLACK);
		this.setBackground(Color.WHITE);
		this.setOpaque(true);
		this.setEditable(false);
		this.setText(pistas[0]);
	}
}
