package main.java.list.exercicios.OperacoesBasicas.listaTarefas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskList {
	// taskList attribute
	private List<Task> taskList;
	
	// get method 
	public List<Task> getTaskList(){
		return taskList;
	}

	// Constructor
	public TaskList() {
		// super();
		// When creating a taskList, an empty list will be generated
		this.taskList = new ArrayList<>();
	}
	
	
	public void addTask(String description) {
		taskList.add(new Task(description));
	}
	
	public void removeTask(String description) {
		List<Task> tasksToRemove = new ArrayList<>();
		for (Task t : taskList) {
			if (t.getDescription().equalsIgnoreCase(description)) {
				tasksToRemove.add(t);
			}	
		}
		taskList.removeAll(tasksToRemove);
		System.out.println("Tarefa(s) removida(s): " + tasksToRemove);
	}
	
	public int getTotalTasks() {
		System.out.println("A lista contém " + taskList.size() + " tarefa(s).");
		return taskList.size();
	}
	
	public void getTasksDescriptions() {
		System.out.println(taskList);
	}
	
	public static void main(String[] args) {
		TaskList listaTarefas = new TaskList();
		
		listaTarefas.getTotalTasks();
		listaTarefas.addTask("Comprar água");
		listaTarefas.getTotalTasks();
		listaTarefas.getTasksDescriptions();
		listaTarefas.addTask("Jogar Gears of War 2");
		listaTarefas.getTotalTasks();
		listaTarefas.getTasksDescriptions();
		listaTarefas.removeTask("Comprar Água");
		listaTarefas.getTotalTasks();
		listaTarefas.getTasksDescriptions();
	}

}
