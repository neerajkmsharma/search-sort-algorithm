package com.avinya.decorator.pattern;

public class Item {

  public final String name;

  public final Category cat;

  public final boolean isImported;

  public final float basePrice;

  public Item(final String name, final Category cat, final boolean isImported, final float basePrice) {
    this.name = name;
    this.cat = cat;
    this.isImported = isImported;
    this.basePrice = basePrice;
  }
}
