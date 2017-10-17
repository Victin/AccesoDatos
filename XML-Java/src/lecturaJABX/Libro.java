package lecturaJABX;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="libro")
@XmlType(propOrder={"ISBN", "titulo", "autor"}) //Definir los elementos que contiene libro y su orden
public class Libro {

	private String ISBN;
	private String autor;
	private String titulo;
	
	/*
	public Libro() {
		
	}
	*/

	@XmlAttribute(name="isbn") //Definir que el ISBN es un atributo de libro
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@XmlElement(name="autor")
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@XmlElement(name="titulo")
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
