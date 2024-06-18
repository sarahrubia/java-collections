package main.java.list.exercicios.OperacoesBasicas.carrinhoCompras;

public class ShoppingItem {
	private String itemName;
	private double itemPrice;
	private int itemQuantity;
	
	public ShoppingItem(String itemName, double itemPrice, int itemQuantity) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}

	public String getItemName() {
		return itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}
	
	/*
	 * When trying to return the item, the memory address of the item is returned
	 * For this reason, it is necessary to create the toString() method
	 */
	@Override
	public String toString() {
		return "\n Nome do produto: " + itemName + ", Preço: " + itemPrice + ", Quantidade: " + itemQuantity;
	}
	
	
	
}
