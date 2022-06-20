package com.avinya.algorithm.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Matchingbrackets {

  public static void main(final String[] args) {
    // TODO Auto-generated method stub

    // final String s = "[jhhkj{jhjkjk(kjhkj)kljk]lkjjj}";

    final String s = "{k]j{l)}a}[";

    if (isValidExpression(s)) {
      System.out.println("valid");
    }
    else {
      System.out.println("No valid");
    }
  }

  public static boolean isValidExpression(final String expression) {
    final Map<Character, Character> openClosePair = new HashMap<Character, Character>();
    openClosePair.put(')', '(');
    openClosePair.put('}', '{');
    openClosePair.put(']', '[');

    final Stack<Character> stack = new Stack<Character>();
    for (final char ch : expression.toCharArray()) {
      if (openClosePair.containsKey(ch)) {
        if (stack.isEmpty() || stack.pop() != openClosePair.get(ch)) {
          return false;
        }
      }
      else if (openClosePair.values()
        .contains(ch)) {
        stack.push(ch);
      }
    }
    return stack.isEmpty();
  }
}
