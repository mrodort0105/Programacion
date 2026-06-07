package ejercicio9;

import java.util.Objects;

public class Libro {

	// Atributos
	private String titulo;
	private String autor;
	private int isbn;
	private int anioPublicacion;
	
	// Constructor
	public Libro(String titulo, String autor, int isbn, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + ", Autor:" + autor + ", isbn:" + isbn + ", Año:"
				+ anioPublicacion;
	}
	
	@Override
	public boolean equals(Object obj) {
	    Libro otro = (Libro) obj;
	    return this.isbn == otro.isbn &&
	           this.anioPublicacion == otro.anioPublicacion &&
	           this.titulo.equals(otro.titulo) &&
	           this.autor.equals(otro.autor);
	}
}
