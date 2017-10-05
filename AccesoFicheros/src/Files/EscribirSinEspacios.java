package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirSinEspacios {

	public static void main(String[] args) throws IOException {
		
		File ruta = new File ("C:\\Users\\alumno\\Documents\\Clase\\Eclipse\\GITAccesoDatos\\AccesoFicheros\\Ficheros");
		File fichero = new File (ruta, "SinEspacios.txt");
		try {
			fichero.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter(fichero);
			fw.write("Esto es una prueba");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader(fichero);
			int valor = fr.read();
			while(valor != -1) {
				if(valor!=32) //Quita los espacios
					System.out.print((char)valor);
				valor = fr.read();
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
