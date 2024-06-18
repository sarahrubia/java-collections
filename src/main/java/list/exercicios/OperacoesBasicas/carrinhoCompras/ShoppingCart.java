package main.java.list.exercicios.OperacoesBasicas.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<ShoppingItem> shoppingCart;
	
	// constructor creates an empty ArrayList
	public ShoppingCart() {
		this.shoppingCart = new ArrayList<>();
	}

	// get method
	public List<ShoppingItem> getShoppingCart() {
		return shoppingCart;
	}
	
	public void addItemsToShoppingCart(String itemName, double itemPrice, int itemQuantity) {
		shoppingCart.add(new ShoppingItem(itemName, itemPrice, itemQuantity));
	}
	
	public void removeItemsFromShoppingCart(String itemName) {
		List<ShoppingItem> listToRemove = new ArrayList<>();
		
		if (!shoppingCart.isEmpty()) {
			for (ShoppingItem i : shoppingCart) {
				if (i.getItemName().equalsIgnoreCase(itemName)) {
					listToRemove.add(i);				
				}
			}
			shoppingCart.removeAll(listToRemove);
			System.out.println("Removido(s) do carrinho: " + listToRemove);
			
		} else {
			System.out.println("A lista está vazia.");
		}
		
	}
	
	public Double shoppingCartTotalAmout() {
		Double totalAmount = 0d;
		
		if(!shoppingCart.isEmpty()) {
			for (ShoppingItem i : shoppingCart) {
				double price = i.getItemPrice() * i.getItemQuantity();
				
				totalAmount += price;
			}
			
			System.out.println("Preço total do carrinho: R$" + totalAmount);
			return totalAmount;
		} else {
		      throw new RuntimeException("A lista está vazia!");
		}
		
	}
	
	public List<ShoppingItem> showShoppingCartItems() {
		System.out.println("Itens no carrinho: " + this.shoppingCart);
		return this.shoppingCart;
	}
	
	public static void main(String[] args) {
		ShoppingCart carrinhoCompras = new ShoppingCart();
		
		carrinhoCompras.showShoppingCartItems();
		carrinhoCompras.addItemsToShoppingCart("Repelente", 22.99, 1);
		carrinhoCompras.addItemsToShoppingCart("Água Mineral", 5.50, 5);
		carrinhoCompras.addItemsToShoppingCart("Xbox Series X", 4999.99, 1);
		carrinhoCompras.showShoppingCartItems();
		carrinhoCompras.shoppingCartTotalAmout();		
		carrinhoCompras.removeItemsFromShoppingCart("repelente");
		carrinhoCompras.showShoppingCartItems();
	}
}

