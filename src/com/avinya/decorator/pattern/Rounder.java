package com.avinya.decorator.pattern;

public class Rounder implements TaxCalculator {

  private final TaxCalculator calculator;

  public Rounder(final TaxCalculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public Item getItem() {
    return calculator.getItem();
  }

  @Override
  public float calc() {
    final int val = 2 + (int) (calculator.calc() * 100);
    final int remainder = val % 5;
    return (val - remainder) / 100f;
  }
}
