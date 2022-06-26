package com.avinya.submitted;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemAdapter {

  private static final String ITEM_ENTRY_REGEX = "(\\d+) ([\\w\\s]* )at (\\d+.\\d{2})";

  public static Item createItemFromString(final String input) {
    final Pattern pattern = Pattern.compile(ITEM_ENTRY_REGEX);
    final Matcher matcher = pattern.matcher(input);
    matcher.find();

    return new Item(matcher.group(1), matcher.group(2), matcher.group(3));
  }
}
