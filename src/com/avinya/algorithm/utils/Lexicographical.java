package com.avinya.algorithm.utils;

public class Lexicographical {

  public static void main(final String[] args) {
    // TODO Auto-generated method stub

    final int k = 3;
    final String s = "welcometojava";
    String currStr = s.substring(0, k);
    String lexMin = currStr;
    String lexMax = currStr;

    for (int i = 3; i < s.length(); i++) {
      currStr = currStr.substring(1, k) + s.charAt(i);
      // System.out.println(i + " " + currStr);
      if (lexMax.compareTo(currStr) < 0) {
        lexMax = currStr;
      }
      if (lexMin.compareTo(currStr) > 0) {
        lexMin = currStr;
      }
    }
    System.out.println(lexMin);
    System.out.println(lexMax);
  }
}
