package com.avinya.algorithm.utils;

public class Palindrome {

  public static void main(final String[] args) {

    final String s = "madam";

    int i = 0;
    int j = s.length() - 1;

    final char[] c = s.toCharArray();

    while (i < j) {
      if (c[i] != c[j]) {
        // return false;
        System.out.println("Return False and break");
        break;
      }
      i++;
      j--;
    }
    System.out.println("Return true");
    // return true;

  }

}
