package main.java.list.exercicios.Pesquisa.bookCatalog;

public class Book {
	private String title;
	private String author;
	private int year;
	
	// constructor
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	// get methods

	public String getTitle() {
		return title;
	}
	
	public void setAutor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	// generate toString
	@Override
	public String toString() {
		return "Livro:\n " + "[Título: " + title + ", Autor: " + author + ", Ano: " + year +"]";
	}
	
}
