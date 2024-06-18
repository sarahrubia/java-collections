package main.java.list.exercicios.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.list.exercicios.Ordenacao.Person.ComparatorByHeight;

public class OrderPerson {
	private List<Person> personList;

	public OrderPerson() {
//		super();
		this.personList = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "OrderPerson [personList: " + personList + "]";
	}

	public void addPerson(String name, int age, double height) {
		personList.add(new Person(name, age, height));
	}
	
	
	public List<Person> orderByAge() {
		List<Person> personOrderedByAge = new ArrayList<Person>(personList);
		Collections.sort(personOrderedByAge);
		System.out.println("Ordenado por idade: " + personOrderedByAge);
		return personOrderedByAge;
	}
	
	public List<Person> orderByHeight() {
		List<Person> personOrderedByHeight = new ArrayList<>(personList);
		Collections.sort(personOrderedByHeight, new ComparatorByHeight());
		System.out.println("Ordenado por altura: " + personOrderedByHeight);
		return personOrderedByHeight;
	}
	
	public static void main(String[] args) {
		OrderPerson personList = new OrderPerson();
		personList.addPerson("Sarah Rúbia", 30, 1.68);
		personList.addPerson("Renise Silva", 557, 1.68);
		personList.addPerson("Isadora Cardoso", 31, 1.66);
		personList.addPerson("Raquel Regina", 30, 1.70);
		
		personList.orderByAge();
		personList.orderByHeight();
		
	}
}
