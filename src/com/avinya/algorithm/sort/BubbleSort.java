package com.avinya.algorithm.sort;

public class BubbleSort {

  static void print(final int a[]) // function to print array elements
  {
    final int n = a.length;
    int i;
    for (i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }

  static void bubbleSort(final int a[]) // function to implement bubble sort
  {
    final int n = a.length;
    int i, j, temp;
    for (i = 0; i < n; i++) {
      for (j = i + 1; j < n; j++) {
        if (a[j] < a[i]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }

  public static void main(final String[] args) {
    final int a[] = { 35, 10, 31, 11, 26 };
    new BubbleSort();
    System.out.println("Before sorting array elements are - ");
    BubbleSort.print(a);
    BubbleSort.bubbleSort(a);
    System.out.println();
    System.out.println("After sorting array elements are - ");
    BubbleSort.print(a);

  }
}

/*-
begin BubbleSort(arr)
   for all array elements
      if arr[i] > arr[i+1]
         swap(arr[i], arr[i+1])
      end if
   end for
   return arr
end BubbleSort

Complexity of bubble sort is O(n2)

Best Case O(n)
Average Case  O(n2)
Worst Case  O(n2)
 */
