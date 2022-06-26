package com.avinya.submitted;

import java.util.List;

class TaxCalculatorApplication {

  Receipt generateReceipt(final String[] inputs) {
    final List<Item> items = ItemFactory.from(inputs);
    return new Receipt(items);
  }
}
