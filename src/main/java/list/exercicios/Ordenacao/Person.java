package main.java.list.exercicios.Ordenacao;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private double height;
	
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public int compareTo(Person person) {
		return Integer.compare(age, person.getAge());
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Person [Nome: " + name + ", Idade: " + age + ", Altura (cm): " + height + "]";
	}	
	
	static class ComparatorByHeight implements Comparator<Person>{

		@Override
		public int compare(Person p1, Person p2) {
			return Double.compare(p1.getHeight(), p2.getHeight());
		}
		
	}
}

