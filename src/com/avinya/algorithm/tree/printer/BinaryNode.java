package com.avinya.algorithm.tree.printer;

public class BinaryNode<T extends Comparable<?>> {

  BinaryNode<T> left, right;

  T data;

  public BinaryNode(final T data) {
    this.data = data;
  }
}
