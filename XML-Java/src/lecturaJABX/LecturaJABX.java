package lecturaJABX;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class LecturaJABX {

	public static void main(String[] args) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(Libreria.class); //Definir la clase que represente la totalidad del XML
			Unmarshaller unmarshaller = context.createUnmarshaller(); //Crear objeto unmarshaller con el objeto context para poder leer
			Libreria libreria = (Libreria) unmarshaller.unmarshal(new File("libreria.xml")); //Recibe un fichero XML
			//Devuelve el objeto con toda la informacion XML(toda la libreria), por eso se crea el objeto Libreria libreria
			
			System.out.println("Nombre: " + libreria.getNombre());
			
			ArrayList<Libro> libros = libreria.getLibros();
			for(Libro e: libros)
				System.out.println("ISBN: " + e.getISBN() + " -Titulo: " + e.getTitulo() + " -Autor: " + e.getAutor());
		} catch (JAXBException e) {
			e.printStackTrace();
		} 
	}
}
