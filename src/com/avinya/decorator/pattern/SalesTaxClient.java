package com.avinya.decorator.pattern;

public class SalesTaxClient {

  public static void main(final String[] args) {

    final Item book = new Item("book", Category.BOOK, false, 12.49f);
    final Item cd = new Item("Music CD", Category.OTHER, true, 14.99f);
    final Item bar = new Item("Chocolate Bar", Category.FOOD, true, 0.85f);

    final Receipt receipt = new Receipt();
    receipt.addItem(book)
      .addItem(cd)
      .addItem(bar);

    receipt.print();
  }
}
