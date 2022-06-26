package com.avinya.submitted;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

  public static void main(final String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    final int lineItemsCount = Integer.parseInt(bufferedReader.readLine()
      .trim());

    IntStream.range(0, lineItemsCount)
      .mapToObj(i -> {
        try {
          return bufferedReader.readLine();
        }
        catch (final IOException ex) {
          throw new RuntimeException(ex);
        }
      })
      .collect(toList());

    // final Receipt receipt = new Receipt();
    // final List<String> result = new Receipt().returnReceipt(lineItems);
    final List<String> result = new ArrayList<>();

    bufferedWriter.write(result.stream()
      .collect(joining("\n")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }
}
