package com.avinya.decorator.pattern;

import java.util.ArrayList;
import java.util.List;

public class Receipt {

  private final List<Item> items;

  public Receipt() {
    items = new ArrayList<>();
  }

  public Receipt addItem(final Item item) {
    items.add(item);
    return this;
  }

  public void print() {
    for (final Item item : items) {
      TaxCalculator calc = new BaseTaxCalculator(item);
      if (item.cat == Category.OTHER) {
        calc = new SalesTaxCalculator(calc);
      }
      if (item.isImported) {
        calc = new ImportTaxCalculator(calc);
      }
      calc = new Rounder(calc);
      final float salesTax = calc.calc();
      System.out.println(item.name + " " + item.basePrice + " " + salesTax);
    }
  }
}
