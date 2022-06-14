package com.avinya.algorithm.search;

public class LinearSearch {

  static int linearSearch(final int a[], final int n, final int val) {
    // Going through array sequentially
    for (int i = 0; i < n; i++) {
      if (a[i] == val) {
        return i + 1;
      }
    }
    return -1;
  }

  public static void main(final String args[]) {
    final int a[] = { 55, 29, 10, 40, 57, 41, 20, 24, 45 }; // given array
    final int val = 10; // value to be searched
    final int n = a.length; // size of array
    final int res = linearSearch(a, n, val); // Store result
    System.out.println();
    System.out.print("The elements of the array are - ");
    for (int i = 0; i < n; i++) {
      System.out.print(" " + a[i]);
    }
    System.out.println();
    System.out.println("Element to be searched is - " + val);
    if (res == -1) {
      System.out.println("Element is not present in the array");
    }
    else {
      System.out.println("Element is present at " + res + " position of array");
    }
  }
}

/*-
Linear_Search(a, n, val) // 'a' is the given array, 'n' is the size of given array, 'val' is the value to search
Step 1: set pos = -1
Step 2: set i = 1
Step 3: repeat step 4 while i <= n
Step 4: if a[i] == val
set pos = i
print pos
go to step 6
[end of if]
set ii = i + 1
[end of loop]
Step 5: if pos = -1
print "value is not present in the array "
[end of if]
Step 6: exit

Best Case O(1)
Average Case  O(n)
Worst Case  O(n)
 */
