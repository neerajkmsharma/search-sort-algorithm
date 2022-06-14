package com.avinya.algorithm.search;

class BinarySearch {

  static int binarySearch(final int a[], final int beg, final int end, final int val) {
    int mid;
    if (end >= beg) {
      mid = (beg + end) / 2;
      if (a[mid] == val) {
        return mid + 1; /*- if the item to be searched is present at middle*/
      }
      /*-if the item to be searched is smaller than middle, then it can only be in left subarray */
      else if (a[mid] < val) {
        return binarySearch(a, mid + 1, end, val);
      }
      /*- if the item to be searched is greater than middle, then it can only be in right subarray */
      else {
        return binarySearch(a, beg, mid - 1, val);
      }
    }
    return -1;
  }

  public static void main(final String args[]) {
    final int a[] = { 8, 10, 22, 27, 37, 44, 49, 55, 69 }; // given array
    final int val = 37; // value to be searched
    final int n = a.length; // size of array
    final int res = binarySearch(a, 0, n - 1, val); // Store result
    System.out.print("The elements of the array are: ");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
    System.out.println("Element to be searched is: " + val);
    if (res == -1) {
      System.out.println("Element is not present in the array");
    }
    else {
      System.out.println("Element is present at " + res + " position of array");
    }
  }
}
