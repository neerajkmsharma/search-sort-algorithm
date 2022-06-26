package com.avinya.submitted;

public class MathUtils {

  public static double roundOffTax(final double number) {
    return Math.ceil(number * 20) / 20;
  }

  public static double roundOffAmount(final double number) {
    return Math.round(number * 100.0) / 100.0;
  }
}
