package com.avinya.algorithm.sort;

public class InsertionSort {

  void insert(final int a[]) /* function to sort an aay with insertion sort */
  {
    int i, j, temp;
    final int n = a.length;
    for (i = 1; i < n; i++) {
      temp = a[i];
      j = i - 1;
      /*-Move the elements greater than temp to one position ahead from their current position*/
      while (j >= 0 && temp <= a[j]) {
        a[j + 1] = a[j];
        j = j - 1;
      }
      a[j + 1] = temp;
    }
  }

  void printArr(final int a[]) /* function to print the array */
  {
    int i;
    final int n = a.length;
    for (i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }

  public static void main(final String[] args) {
    final int a[] = { 92, 50, 5, 20, 11, 22 };
    final InsertionSort i1 = new InsertionSort();
    System.out.println("\nBefore sorting array elements are - ");
    i1.printArr(a);
    i1.insert(a);
    System.out.println("\n\nAfter sorting array elements are - ");
    i1.printArr(a);
    System.out.println();
  }
}

/*-
Step 1 - If the element is the first element, assume that it is already sorted. Return 1.

Step2 - Pick the next element, and store it separately in a key.

Step3 - Now, compare the key with all elements in the sorted array.

Step 4 - If the element in the sorted array is smaller than the current element, then move to the next element. Else, shift greater elements in the array towards the right.

Step 5 - Insert the value.

Step 6 - Repeat until the array is sorted

Best Case -: O(n)
Average Case -: O(n2)
Worst Case -: O(n2)
 */
