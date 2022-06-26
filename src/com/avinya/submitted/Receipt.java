package com.avinya.submitted;

import java.util.List;

public class Receipt {

  private double totalSalesTax = 0.0;

  private double totalAmount = 0.0;

  private final String itemDetails;

  public Receipt(final List<Item> items) {

    final StringBuilder itemDetails = new StringBuilder();

    for (final Item item : items) {
      itemDetails.append(item.toString())
        .append("\n");
      totalSalesTax += item.getTaxAmount();
      totalAmount += item.getFinalPrice();
    }
    totalAmount = MathUtils.roundOffAmount(totalAmount);
    totalSalesTax = MathUtils.roundOffAmount(totalSalesTax);

    this.itemDetails = itemDetails.toString();
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  public double getTotalSalesTax() {
    return totalSalesTax;
  }

  @Override
  public String toString() {
    return "Receipt" + "\n" + itemDetails + "Sales Taxes: " + totalSalesTax + "\n" + "Total: " + totalAmount
        + "\n*******************************\n";
  }
}
