package com.avinya.algorithm.tree.printer;

public class BinaryTreePrinterTest {

  private static BinaryNode<Integer> test1() {
    final BinaryNode<Integer> root = new BinaryNode<Integer>(2);
    final BinaryNode<Integer> n11 = new BinaryNode<Integer>(7);
    final BinaryNode<Integer> n12 = new BinaryNode<Integer>(5);
    final BinaryNode<Integer> n21 = new BinaryNode<Integer>(2);
    final BinaryNode<Integer> n22 = new BinaryNode<Integer>(6);
    final BinaryNode<Integer> n23 = new BinaryNode<Integer>(3);
    final BinaryNode<Integer> n24 = new BinaryNode<Integer>(6);
    final BinaryNode<Integer> n31 = new BinaryNode<Integer>(5);
    final BinaryNode<Integer> n32 = new BinaryNode<Integer>(8);
    final BinaryNode<Integer> n33 = new BinaryNode<Integer>(4);
    final BinaryNode<Integer> n34 = new BinaryNode<Integer>(5);
    final BinaryNode<Integer> n35 = new BinaryNode<Integer>(8);
    final BinaryNode<Integer> n36 = new BinaryNode<Integer>(4);
    final BinaryNode<Integer> n37 = new BinaryNode<Integer>(5);
    final BinaryNode<Integer> n38 = new BinaryNode<Integer>(8);

    root.left = n11;
    root.right = n12;

    n11.left = n21;
    n11.right = n22;
    n12.left = n23;
    n12.right = n24;

    n21.left = n31;
    n21.right = n32;
    n22.left = n33;
    n22.right = n34;
    n23.left = n35;
    n23.right = n36;
    n24.left = n37;
    n24.right = n38;

    return root;
  }

  private static BinaryNode<Integer> test2() {
    final BinaryNode<Integer> root = new BinaryNode<Integer>(2);

    BinaryTreePrinterTest.insert(root, 5);
    BinaryTreePrinterTest.insert(root, 2);
    BinaryTreePrinterTest.insert(root, 6);
    BinaryTreePrinterTest.insert(root, 9);
    BinaryTreePrinterTest.insert(root, 5);
    BinaryTreePrinterTest.insert(root, 8);
    BinaryTreePrinterTest.insert(root, 4);

    return root;
  }

  public static void insert(final BinaryNode<Integer> node, final int value) {

    node.data = value;

  }

  public static void main(final String[] args) {

    BinaryTreePrinter.printNode(test1());
    BinaryTreePrinter.printNode(test2());

  }
}
