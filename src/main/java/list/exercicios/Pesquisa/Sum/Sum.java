package main.java.list.exercicios.Pesquisa.Sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {
	private List<Integer> sumList;

	public Sum() {
		super();
		sumList = new ArrayList<>();
	}

	public List<Integer> getSumList() {
		return sumList;
	}
	
	public void addNumbers(int numberToAdd) {
		sumList.add(numberToAdd);
	}
	
	public int calculateSum() {
		int resultSum = 0;
		
		for(int num : sumList) {
			resultSum += num;
		}
		System.out.println(resultSum);
		return resultSum;
	}
	
	public int findBiggestNumber() {
		int biggestNumber = Integer.MIN_VALUE;
		if (!sumList.isEmpty()) {
		      for (Integer num : sumList) {
		        if (num >= biggestNumber) {
		          biggestNumber = num;
		        }
		      }
		      System.out.println("Maior número: " + biggestNumber);
		      return biggestNumber;
		    } else {
		      throw new RuntimeException("A lista está vazia!");
		    }
	}
	
	public int findSmallestNumber() {
		int smallestNumber = Integer.MAX_VALUE;
		if (!sumList.isEmpty()) {
		      for (Integer num : sumList) {
		        if (num <= smallestNumber) {
		          smallestNumber = num;
		        }
		      }
		      System.out.println("Menor número: " + smallestNumber);
		      return smallestNumber;
		    } else {
		      throw new RuntimeException("A lista está vazia!");
		    }
	}
	
	public List<Integer> showNumbers() {
	    if (!sumList.isEmpty()) {
	        System.out.println(this.sumList);
	      } else {
	        System.out.println("A lista está vazia!");
	      }
		return this.sumList;
	}
	
	public static void main(String[] args) {
		Sum numberList = new Sum();
		numberList.addNumbers(10);
		numberList.addNumbers(22);
		numberList.addNumbers(13);
		numberList.addNumbers(100);
		
		numberList.calculateSum();
		
		numberList.findBiggestNumber();
		numberList.findSmallestNumber();
	}
}
