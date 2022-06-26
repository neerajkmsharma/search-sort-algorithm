package com.avinya.decorator.pattern;

public class ImportTaxCalculator implements TaxCalculator {

  private final TaxCalculator calculator;

  public ImportTaxCalculator(final TaxCalculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public Item getItem() {
    return calculator.getItem();
  }

  @Override
  public float calc() {
    return calculator.calc() + getItem().basePrice * 0.05f;
  }
}
