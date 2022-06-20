package com.avinya.algorithm.utils;

public class CyclicString {

  public static void main(final String[] args) {
    final String original = "abcd";
    generateCyclicString(original);

    final String s1 = "abcd";
    final String s2 = "bcdxa";

    System.out.print("Neeraj :-" + isCyclicString(s1, s2));
  }

  private static void generateCyclicString(final String s) {

    String d = s;
    do {
      System.out.print(d + " ");
    } while (!(d = (d.substring(1) + d.charAt(0))).equals(s));

  }

  public static boolean isCyclicString(final String s1, final String s2) {

    return (s1.length() == s2.length() && (s1 + s2).indexOf(s1) != -1);

  }

}
