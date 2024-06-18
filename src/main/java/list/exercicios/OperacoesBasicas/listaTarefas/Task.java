package main.java.list.exercicios.OperacoesBasicas.listaTarefas;

public class Task {
	private String description;

	// constructor (use it so you can instantiate new Task(description).
	public Task(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	/*
	 * When trying to return the item, the memory address of the item is returned
	 * For this reason, it is necessary to create the toString() method
	 */
	@Override
	public String toString() {
		return ("Tarefa: " + description);
	}	

	
}
