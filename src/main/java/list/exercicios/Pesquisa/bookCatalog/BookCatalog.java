package main.java.list.exercicios.Pesquisa.bookCatalog;

import java.util.ArrayList;
import java.util.List;



public class BookCatalog {
	private List<Book> booksList;

	public BookCatalog() {
//		super();
		this.booksList = new ArrayList<>();
	}
	
	public void addBook(String title, String author, int year) {
		booksList.add(new Book(title, author, year));
	}
	
	public List<Book> searchByAuthor(String author){
		List<Book> booksByAuthor = new ArrayList<>();
		
		if(!booksList.isEmpty()) {
			for(Book book : booksList) {
				if (book.getAuthor().equalsIgnoreCase(author)) {
					booksByAuthor.add(book);
				}
			}			
			return booksByAuthor;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public List<Book> searchByYearInterval(int initialYear, int finalYear) {
		List<Book> booksByYearInterval = new ArrayList<>();
		
		if(!booksList.isEmpty()) {
			for(Book book : booksList) {
				if(book.getYear() >= initialYear && book.getYear() <= finalYear) {
					booksByYearInterval.add(book);
				}
			}
		}
		return booksByYearInterval;
	}
	
	public Book searchByTitle(String title) {
		Book bookByTitle = null;
	
		if(!booksList.isEmpty()) {
			for(Book book : booksList) {
				if (book.getTitle().equalsIgnoreCase(title)) {
					// Vai recuperar o primeiro livro identificado na lista
					bookByTitle = book;
				}
			}
		} 
		return bookByTitle;
	} 
	
	public static void main(String[] args) {
		BookCatalog catalogo = new BookCatalog();
		
		catalogo.addBook("Uma aprendizagem ou o Livro dos Prazeres", "Clarice Lispector", 1969);
		catalogo.addBook("Uma aprendizagem ou o Livro dos Prazeres", "Clarice Lispector", 1969);
		catalogo.addBook("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
		catalogo.addBook("Java Guia do Programador", "Peter Jandl Junior", 2021);
		catalogo.addBook("Código Limpo", "Robert C. Martin", 2009);
		catalogo.addBook("O Codificador Limpo", "Robert C. Martin", 2012);
		
		/*
		 * Ao tentar fazer a busca catalogo.searchByAuthor("Clarice Lispector"), 
		 * o valor não foi impresso. Foi necessário utilizar o print, porque os dados do Book
		 * são retornados no método, mas não foram tratados para exibição
		 */
		System.out.println(catalogo.searchByAuthor("Clarice Lispector"));
		
		System.out.println(catalogo.searchByTitle("Código Limpo"));
		
		System.out.println(catalogo.searchByYearInterval(1969, 2009));
		
		System.out.println(catalogo.searchByTitle("Uma aprendizagem ou o Livro dos Prazeres"));
	}
}
