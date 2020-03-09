/*
 * Programación Interactiva
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
 */
public class Serializacion {
	
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
			archivoSalida = new FileOutputStream("src/Guardado/ultimaPartida.dat");
			ObjetoSalida = new ObjectOutputStream(archivoSalida);
			ObjetoSalida.writeObject(tablero);
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
	public Tablero desSerializarObjeto(){
		Tablero matriz = null;
		try {
			archivoEntrada = new FileInputStream("src/Guardado/ultimaPartida.dat");
			ObjetoEntrada = new ObjectInputStream(archivoEntrada);
			matriz = (Tablero) ObjetoEntrada.readObject();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			
		}
		return matriz;
	}
}
