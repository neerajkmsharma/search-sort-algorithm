package com.avinya.submitted;

import java.util.stream.Stream;

public class Item {

  private final String name;

  private final int quantity;

  private final double basePrice;

  private double basicSalesTaxAmount;

  private double additionalSalesTaxAmount;

  public Item(final String quantity, final String name, final String basePrice) {
    this.name = name;
    this.quantity = Integer.valueOf(quantity);
    this.basePrice = Double.valueOf(basePrice);
  }

  public double getFinalPrice() {
    return MathUtils.roundOffAmount(quantity * basePrice + getTaxAmount());
  }

  public double getTaxAmount() {
    return quantity * (basicSalesTaxAmount + additionalSalesTaxAmount);
  }

  public boolean isImported() {
    return name.contains("imported");
  }

  public boolean isExempted() {
    return Stream.of("book", "chocolate", "pill")
      .anyMatch(exemptedItem -> name.contains(exemptedItem));
  }

  public void setBasicSalesTaxAmount(final double factor) {
    basicSalesTaxAmount = basePrice * factor;
  }

  public void setAdditionalSalesTax(final double additionalSalesTaxPercent) {
    additionalSalesTaxAmount = MathUtils.roundOffTax(basePrice * additionalSalesTaxPercent);
  }

  @Override
  public String toString() {
    return String.valueOf(quantity) + " " + name + " : " + getFinalPrice();
  }
}
