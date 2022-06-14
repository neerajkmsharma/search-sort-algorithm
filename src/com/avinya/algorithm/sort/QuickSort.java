package com.avinya.algorithm.sort;

public class QuickSort {

  /*
   * function that consider last element as pivot, place the pivot at its exact
   * position, and place smaller elements to left of pivot and greater elements to
   * right of pivot.
   */
  int partition(final int a[], final int start, final int end) {
    final int pivot = a[end]; // pivot element
    int i = (start - 1);

    for (int j = start; j <= end - 1; j++) {
      // If current element is smaller than the pivot
      if (a[j] < pivot) {
        i++; // increment index of smaller element
        final int t = a[i];
        a[i] = a[j];
        a[j] = t;
      }
    }
    final int t = a[i + 1];
    a[i + 1] = a[end];
    a[end] = t;
    return (i + 1);
  }

  /* function to implement quick sort */
  void quick(final int a[], final int start,
    final int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */
  {
    if (start < end) {
      final int p = partition(a, start, end); // p is partitioning index
      quick(a, start, p - 1);
      quick(a, p + 1, end);
    }
  }

  /* function to print an array */
  void printArr(final int a[], final int n) {
    int i;
    for (i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }

  public static void main(final String[] args) {
    final int a[] = { 13, 18, 27, 2, 19, 25 };
    final int n = a.length;
    System.out.println("\nBefore sorting array elements are - ");
    final QuickSort q1 = new QuickSort();
    q1.printArr(a, n);
    q1.quick(a, 0, n - 1);
    System.out.println("\nAfter sorting array elements are - ");
    q1.printArr(a, n);
    System.out.println();
  }
}

/*-
 Sort Algorithm:-

 QUICKSORT (array A, start, end) {
  if (start < end) {
    p = partition(A, start, end)
    QUICKSORT (A, start, p - 1)
    QUICKSORT (A, p + 1, end)
  }
}

Partition Algorithm

 PARTITION (array A, start, end) {
  pivot ? A[end]
  i ? start-1
  for j ? start to end -1 {
  do if (A[j] < pivot) {
  then i ? i + 1
  swap A[i] with A[j]
   }}
  swap A[i+1] with A[end]
  return i+1
}
 */
