package com.avinya.algorithm.tree.printer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePrinter {

  public static <T extends Comparable<?>> void printNode(final BinaryNode<T> root) {
    final int maxLevel = BinaryTreePrinter.maxLevel(root);

    printNodeInternal(Collections.singletonList(root), 1, maxLevel);
  }

  private static <T extends Comparable<?>> void printNodeInternal(final List<BinaryNode<T>> nodes, final int level,
    final int maxLevel) {
    if (nodes.isEmpty() || BinaryTreePrinter.isAllElementsNull(nodes)) {
      return;
    }

    final int floor = maxLevel - level;
    final int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
    final int firstSpaces = (int) Math.pow(2, (floor)) - 1;
    final int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

    BinaryTreePrinter.printWhitespaces(firstSpaces);

    final List<BinaryNode<T>> newNodes = new ArrayList<BinaryNode<T>>();
    for (final BinaryNode<T> node : nodes) {
      if (node != null) {
        System.out.print(node.data);
        newNodes.add(node.left);
        newNodes.add(node.right);
      }
      else {
        newNodes.add(null);
        newNodes.add(null);
        System.out.print(" ");
      }

      BinaryTreePrinter.printWhitespaces(betweenSpaces);
    }
    System.out.println("");

    for (int i = 1; i <= endgeLines; i++) {
      for (int j = 0; j < nodes.size(); j++) {
        BinaryTreePrinter.printWhitespaces(firstSpaces - i);
        if (nodes.get(j) == null) {
          BinaryTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
          continue;
        }

        if (nodes.get(j).left != null) {
          System.out.print("/");
        }
        else {
          BinaryTreePrinter.printWhitespaces(1);
        }

        BinaryTreePrinter.printWhitespaces(i + i - 1);

        if (nodes.get(j).right != null) {
          System.out.print("\\");
        }
        else {
          BinaryTreePrinter.printWhitespaces(1);
        }

        BinaryTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
      }

      System.out.println("");
    }

    printNodeInternal(newNodes, level + 1, maxLevel);
  }

  private static void printWhitespaces(final int count) {
    for (int i = 0; i < count; i++) {
      System.out.print(" ");
    }
  }

  private static <T extends Comparable<?>> int maxLevel(final BinaryNode<T> node) {
    if (node == null) {
      return 0;
    }

    return Math.max(BinaryTreePrinter.maxLevel(node.left), BinaryTreePrinter.maxLevel(node.right)) + 1;
  }

  private static <T> boolean isAllElementsNull(final List<T> list) {
    for (final Object object : list) {
      if (object != null) {
        return false;
      }
    }

    return true;
  }

}
