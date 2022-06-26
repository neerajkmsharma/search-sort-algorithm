package com.avinya.algorithm.binarytree;

public class BinaryTreeSmallestNode {

  // Represent the node of binary tree
  public static class Node {

    int data;

    Node left;

    Node right;

    public Node(final int data) {
      // Assign data to the new node, set left and right children to null
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // Represent the root of binary tree
  public Node root;

  public BinaryTreeSmallestNode() {
    root = null;
  }

  // smallestElement() will find out the smallest node in the binary tree
  public int smallestElement(final Node temp) {
    // Check whether tree is empty
    if (root == null) {
      System.out.println("Tree is empty");
      return 0;
    }
    else {
      int leftMin, rightMin;
      // Min will store temp's data
      int min = temp.data;
      // It will find smallest element in left subtree
      if (temp.left != null) {
        leftMin = smallestElement(temp.left);
        // If min is greater than leftMin then store the value of leftMin into min
        min = Math.min(min, leftMin);
      }
      // It will find smallest element in right subtree
      if (temp.right != null) {
        rightMin = smallestElement(temp.right);
        // If min is greater than rightMin then store the value of rightMin into min
        min = Math.min(min, rightMin);
      }
      return min;
    }
  }

  public static void main(final String[] args) {
    final BinaryTreeSmallestNode bt = new BinaryTreeSmallestNode();
    // Add nodes to the binary tree
    bt.root = new Node(9);
    bt.root.left = new Node(5);
    bt.root.right = new Node(7);
    bt.root.left.left = new Node(1);
    bt.root.right.left = new Node(2);
    bt.root.right.right = new Node(8);
    bt.root.right.left = new Node(4);
    bt.root.right.right = new Node(3);
    // Display smallest node in the binary tree
    System.out.println("Smallest element in the binary tree: " + bt.smallestElement(bt.root));
  }
}
