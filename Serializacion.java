/*
 * Programaci�n Interactiva
 * Equipo de trabajo:
 * -Andres Pineda Cortez 1843660-3743
 * -Mateo Obando Gutierrez 1844983-3743
 * Taller # 2 -Juego Crucigrama
 */
package crucigrama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// TODO: Auto-generated Javadoc
/**
 * The Class Serializacion.
 * @param <Char>
 */
public class Serializacion<Char> {
	
	/** The archivo entrada. */
	private FileInputStream archivoEntrada;
	
	/** The archivo salida. */
	private FileOutputStream archivoSalida;
	
	/** The Objeto entrada. */
	private ObjectInputStream ObjetoEntrada;
	
	/** The Objeto salida. */
	private ObjectOutputStream ObjetoSalida;
	
	/**
	 * Serializar crucigrama.
	 *
	 * @param tablero the matriz
	 */
	public void serializarCrucigrama(Tablero tablero) {
		try {
			archivoSalida = new FileOutputStream("src/Guardado/ultimaPartida");
			ObjetoSalida = new ObjectOutputStream(archivoSalida);
			ObjetoSalida.writeObject(tablero.getMatriz());
			System.out.print("serializado");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Des serializar objeto.
	 *
	 * @return the casilla[][]
	 */
	@SuppressWarnings("finally")
	public Tablero desSerializarObjeto(){
		Tablero matriz = new Tablero();
		try {
			archivoEntrada = new FileInputStream("src/Guardado/ultimaPartida");
			ObjetoEntrada = new ObjectInputStream(archivoEntrada);
			matriz = (Tablero) (ObjetoEntrada.readObject());
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			return matriz;
		}
	}
}