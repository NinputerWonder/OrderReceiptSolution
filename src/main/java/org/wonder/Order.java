package org.wonder;

import java.util.List;

public class Order {
    final String customerName;
    final String customerAddress;
    final List<LineItem> lineItems;

    public Order(String customerName, String customerAddress , List<LineItem> lineItems) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.lineItems = lineItems;
    }

    public double totalAmountOfLineItems() {
        double totalAmountOfLineItems = 0d;
        for (LineItem lineItem : getLineItems()) {
            totalAmountOfLineItems += lineItem.totalAmount() + lineItem.salesTax();
        }
        return totalAmountOfLineItems;
    }

    public double totalSalesTax() {
        double totalSalesTax = 0d;
        for (LineItem lineItem : getLineItems()) {
            totalSalesTax += lineItem.salesTax();
        }
        return totalSalesTax;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
