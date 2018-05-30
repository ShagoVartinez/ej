package models;

public class Item {

	private String name;
	private int totalCost, payment;

	public Item(String name, int totalCost, int payment) {
		this.name = name;
		this.totalCost = totalCost;
		this.payment = payment;
	}

	public String getName() {
		return name;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public int getPayment() {
		return payment;
	}
}