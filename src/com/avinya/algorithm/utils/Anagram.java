package com.avinya.algorithm.utils;

import java.util.Arrays;

public class Anagram {

  public static void main(final String[] args) {
    final String s1 = "";
    final String s2 = "";

    System.out.println("Check for Anagram by sorting " + isAnagramSort(s1, s2));

    System.out.println("Check for Anagram by counting " + isAnagramCounting(s1, s2));
  }

  /**
   * overall running time O(n log n) because sorting an array of n characters
   * takes O(n log n) time
   *
   * @param string1
   * @param string2
   * @return
   */
  private static boolean isAnagramSort(final String string1, final String string2) {
    if (string1.length() != string2.length()) {
      return false;
    }
    final char[] a1 = string1.toCharArray();
    final char[] a2 = string2.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
  }

  private static int CHARACTER_RANGE = 256;

  /**
   * This solution is faster with the time complexity of O(n). However, it needs
   * extra space for the counting array. At 256 integers, for ASCII that's not too
   * bad
   *
   * @param string1
   * @param string2
   * @return
   */
  public static boolean isAnagramCounting(final String string1, final String string2) {
    if (string1.length() != string2.length()) {
      return false;
    }
    final int count[] = new int[CHARACTER_RANGE];
    for (int i = 0; i < string1.length(); i++) {
      count[string1.charAt(i)]++;
      count[string2.charAt(i)]--;
    }
    for (int i = 0; i < CHARACTER_RANGE; i++) {
      if (count[i] != 0) {
        return false;
      }
    }
    return true;
  }

}
