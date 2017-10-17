package lecturaJABX;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="libreria") //Definir libreria como la raiz del elemento xml
@XmlType(propOrder= {"nombre", "libros"}) //Definir los elementos que contiene libreria y su orden
public class Libreria {

	private String nombre;
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	
	/*
	public Libreria() {
	}
	*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElementWrapper(name="libros") //Definirlo como envoltorio, es decir, contiene mas elementos libros
	@XmlElement(name="libro") //Cada elemento que contiene el ArrayList se corresponde con un elemento libro
	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
}
