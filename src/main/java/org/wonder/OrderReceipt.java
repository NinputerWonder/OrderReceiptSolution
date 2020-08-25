package org.wonder;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 * 
 */
public class OrderReceipt {
    private final Order order;

    public OrderReceipt(Order order) {
        this.order = order;
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();

		// print headers
		output.append("======Printing Orders======\n");

        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());

		for (LineItem lineItem : order.getLineItems()) {
			output.append(lineItem.toString());
		}

		output.append("Sales Tax").append('\t').append(order.totalSalesTax());
		output.append("Total Amount").append('\t').append(order.totalAmountOfLineItems());
		return output.toString();
	}

}