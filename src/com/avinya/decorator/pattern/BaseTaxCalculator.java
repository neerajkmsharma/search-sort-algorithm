package com.avinya.decorator.pattern;

public class BaseTaxCalculator implements TaxCalculator {

  protected Item item;

  public BaseTaxCalculator(final Item item) {
    this.item = item;
  }

  @Override
  public Item getItem() {
    return item;
  }

  @Override
  public float calc() {
    return 0;
  }
}
