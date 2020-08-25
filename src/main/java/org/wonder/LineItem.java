package org.wonder;

public class LineItem {
	private final String description;
	private final double price;
	private final int quantity;
	private final double TAX_RATE = .10;

	public LineItem(String description , double price , int quantity) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		StringBuilder lineItemInfo = new StringBuilder();
		lineItemInfo.append(description);
		lineItemInfo.append('\t');
		lineItemInfo.append(price);
		lineItemInfo.append('\t');
		lineItemInfo.append(quantity);
		lineItemInfo.append('\t');
		lineItemInfo.append(totalAmount());
		lineItemInfo.append('\n');
		return lineItemInfo.toString();
	}

	public double salesTax() {
		return totalAmount() * TAX_RATE;
	}

	double totalAmount() {
        return price * quantity;
    }
}