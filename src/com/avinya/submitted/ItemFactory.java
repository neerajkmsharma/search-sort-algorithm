package com.avinya.submitted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItemFactory {

  public static List<Item> from(final String[] inputs) {
    return Arrays.stream(inputs)
      .map(ItemFactory::from)
      .collect(Collectors.toList());
  }

  private static Item from(final String input) {
    final Item item = ItemAdapter.createItemFromString(input);
    ItemTaxCalculator.applyTaxes(item);
    return item;
  }

}
