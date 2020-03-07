package crucigrama;
import java.io.Serializable;
import java.util.ArrayList;

import crucigrama.Casilla;

@SuppressWarnings("serial")
public class Tablero implements Serializable{
	private Casilla[][] tableroPartida = new Casilla[12][22];
	private char[] H1 = {'1','L','A','D','R','O','N','E','S'};
	private char[] H2 = {'2','P','E','R','R','O'};
	private char[] H3 = {'3','A','R','R','O','Z'};
	private char[] H4 = {'4','H','U','E','V','O'};
	private char[] H5 = {'5','M','I','O'};
	private char[] H6 = {'6','P','L','A','N','T','A','S'};
	private char[] H7 = {'7','H','I','D','R','O','G','E','N','O'};
	private char[] H8 = {'8','L','O','R','O'};
	private char[] V1 = {'1','O','R','O'};
	private char[] V2 = {'2','P','R','O','F','E','S','O','R'};
	private char[] V3 = {'3','G','A','T','O'};
	private char[] V4 = {'4','Z','A','N','C','U','D','O'};
	private char[] V5 = {'5','C','O','R','O','N','A','V','I','R','U','S'};
	private char[] V6 = {'6','I','G','L','E','S','I','A'};
	public void crearTableroNuevo(){
		for(int i = 0;i < H1.length; i++) {
			tableroPartida[2+i][3] = new Casilla(H1[i]);
		}
		for(int i = 0;i < H2.length; i++) {
			tableroPartida[2+i][5] = new Casilla(H2[i]);
		}
		for(int i = 0;i < H3.length; i++) {
			tableroPartida[0+i][12] = new Casilla(H3[i]);
		}
		for(int i = 0;i < H4.length; i++) {
			tableroPartida[0+i][9] = new Casilla(H4[i]);
		}
		for(int i = 0;i < H5.length; i++) {
			tableroPartida[0+i][7] = new Casilla(H5[i]);
		}
		for(int i = 0;i < H6.length; i++) {
			tableroPartida[1+i][16] = new Casilla(H6[i]);
		}
		for(int i = 0;i < H7.length; i++) {
			tableroPartida[2+i][i] = new Casilla(H7[i]);
		}
		for(int i = 0;i < H8.length; i++) {
			tableroPartida[2+i][14] = new Casilla(H8[i]);
		}
		
		for(int i = 0;i < V1.length; i++) {
			tableroPartida[7][2+i] = new Casilla(V1[i]);
		}
		for(int i = 0;i < V2.length; i++) {
			tableroPartida[3][4+i] = new Casilla(V2[i]);
		}
		for(int i = 0;i < V3.length; i++) {
			tableroPartida[1][10+i] = new Casilla(V3[i]);
		}
		for(int i = 0;i < V4.length; i++) {
			tableroPartida[8][0+i] = new Casilla(V4[i]);
		}
		for(int i = 0;i < V5.length; i++) {
			tableroPartida[4][10+i] = new Casilla(V5[i]);
		}
		for(int i = 0;i < V6.length; i++) {
			tableroPartida[9][14+i] = new Casilla(V6[i]);
		}
		
		for(int i = 0; i < 12;i++) {
			for (int j = 0; j < 22; j++) {
				if(tableroPartida[i][j] == null) {
					tableroPartida[i][j] = new Casilla('}');
					
				}
			}
		}
	}
	
	public Casilla getcasilla(int x, int y) {
		return tableroPartida[x][y];
	}
}
