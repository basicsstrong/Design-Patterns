package com.basicsstrong.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class FlyWeightDemo {
	
	public static void main(String[] args) {
		
		InventorySystem inventory = new InventorySystem();
		inventory.executeOrder("AlienWare laptop", 2500);
		inventory.executeOrder("SkullCandy HeadPhones", 150);
		inventory.executeOrder("Playstation 5", 500);
		inventory.executeOrder("SkullCandy HeadPhones", 130);
		inventory.executeOrder("AlienWare laptop", 3000);
		inventory.executeOrder("Playstation 5", 600);
		inventory.process();
		System.out.println(inventory.getTotalProducts());
	}

}

class Product {
	private final String name;
	public Product(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

class Order{
	
	private final int orderNumber;
	private final Product product;
	
	Order(int orderNumber, Product product) {
		this.orderNumber = orderNumber;
		this.product = product;
	}
	void processOrder() {
		System.out.println("Ordering " + product +
				" for order number " + orderNumber);
	}
}

class Portfolio {
	private Map<String, Product> products = new HashMap<String, Product>();
	/**
	 * Factory method Pattern
	 */
	public Product lookup(String productName) {
		if (!products.containsKey(productName))
			products.put(productName, new Product(productName));
		return products.get(productName);
	}
	public int totalProductsMade() {
		return products.size();
	}
}

class InventorySystem {
	private final Portfolio portfolio = new Portfolio();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	void executeOrder(String productName, int orderNumber) {
		Product product = portfolio.lookup(productName);
		Order order = new Order(orderNumber, product);
		orders.add(order);
	}
	void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}
	int getTotalProducts() {
		return portfolio.totalProductsMade();
	}
}
