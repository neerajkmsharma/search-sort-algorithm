package com.avinya.submitted;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

  public static void main(final String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    final int lineItemsCount = Integer.parseInt(bufferedReader.readLine()
      .trim());

    final List<String> lineItems = IntStream.range(0, lineItemsCount)
      .mapToObj(i -> {
        try {
          return bufferedReader.readLine();
        }
        catch (final IOException ex) {
          throw new RuntimeException(ex);
        }
      })
      .collect(toList());

    final List<String> result = returnReceipt(lineItems);

    bufferedWriter.write(result.stream()
      .collect(joining("\n")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }

  public static List<String> returnReceipt(final List<String> lineItems) {

    final String[] inputs = lineItems.toArray(new String[lineItems.size()]);

    final List<Item> items = ItemFactory.from(inputs);
    final DecimalFormat df = new DecimalFormat("0.00");
    double totalSalesTax = 0.00;
    double totalAmount = 0.00;

    final List<String> returnLineItems = new ArrayList<>();

    for (final Item item : items) {
      returnLineItems.add(item.toString());

      totalSalesTax += item.getTaxAmount();
      totalAmount += item.getFinalPrice();
    }
    totalAmount = MathUtils.roundOffAmount(totalAmount);
    totalSalesTax = MathUtils.roundOffAmount(totalSalesTax);
    returnLineItems.add("Sales Taxes: " + df.format(totalSalesTax));
    returnLineItems.add("Total: " + df.format(totalAmount));

    return returnLineItems;

  }

}
