package org.wonder;

public class LineItem {
	private final String description;
	private final double price;
	private final int quantity;

	public LineItem(String description , double price , int quantity) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	double salesTax() {
		return totalAmount() * .10;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

    double totalAmount() {
        return price * quantity;
    }
}