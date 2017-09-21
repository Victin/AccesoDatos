package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileRandom {

	public static void main(String[] args) throws IOException {

		RandomAccessFile fichero = new RandomAccessFile("C:\\Users\\alumno\\Documents\\Clase\\IDE\\Archivos\\archivo1.txt", "rw");
		FileReader fr = new FileReader("C:\\Users\\alumno\\Documents\\Clase\\IDE\\Archivos\\archivo1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("Longitud del archivo: " + fichero.length());
		
		//fichero.seek(fichero.length());
		fichero.seek(0);
		
		String cadena = "/RandomAccesFile/";
		fichero.writeBytes(cadena);
		
		fichero.seek(4);
		String cadena2="(Prueba)";
		fichero.writeBytes(cadena2);
		
		int c;
		while((c=br.read())!=-1) {
			System.out.print((char)c);
		}
		fr.close();
		
		System.out.println("\n-----------------------");
		
		fichero.seek(0);
		while(fichero.read() !=-1) {
			fichero.seek(0);
			String texto = fichero.readLine();
			System.out.print(texto);
		}
		
	}

}
