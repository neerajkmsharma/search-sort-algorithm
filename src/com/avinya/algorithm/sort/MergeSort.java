package com.avinya.algorithm.sort;

class MergeSort {

  /* Function to merge the subarrays of a[] */
  void merge(final int a[], final int beg, final int mid, final int end) {
    int i, j, k;
    final int n1 = mid - beg + 1;
    final int n2 = end - mid;

    /* temporary Arrays */
    final int LeftArray[] = new int[n1];
    final int RightArray[] = new int[n2];

    /* copy data to temp arrays */
    for (i = 0; i < n1; i++) {
      LeftArray[i] = a[beg + i];
    }
    for (j = 0; j < n2; j++) {
      RightArray[j] = a[mid + 1 + j];
    }

    i = 0; /* initial index of first sub-array */
    j = 0; /* initial index of second sub-array */
    k = beg; /* initial index of merged sub-array */

    while (i < n1 && j < n2) {
      if (LeftArray[i] <= RightArray[j]) {
        a[k] = LeftArray[i];
        i++;
      }
      else {
        a[k] = RightArray[j];
        j++;
      }
      k++;
    }
    while (i < n1) {
      a[k] = LeftArray[i];
      i++;
      k++;
    }

    while (j < n2) {
      a[k] = RightArray[j];
      j++;
      k++;
    }
  }

  void mergeSort(final int a[], final int beg, final int end) {
    if (beg < end) {
      final int mid = (beg + end) / 2;
      mergeSort(a, beg, mid);
      mergeSort(a, mid + 1, end);
      merge(a, beg, mid, end);
    }
  }

  /* Function to print the array */
  void printArray(final int a[], final int n) {
    int i;
    for (i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }

  public static void main(final String args[]) {
    final int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
    final int n = a.length;
    final MergeSort m1 = new MergeSort();
    System.out.println("\nBefore sorting array elements are - ");
    m1.printArray(a, n);
    m1.mergeSort(a, 0, n - 1);
    System.out.println("\nAfter sorting array elements are - ");
    m1.printArray(a, n);
    System.out.println("");
  }

}

/*-
Alogo-

MERGE_SORT(arr, beg, end)

if beg < end
set mid = (beg + end)/2
MERGE_SORT(arr, beg, mid)
MERGE_SORT(arr, mid + 1, end)
MERGE (arr, beg, mid, end)
end of if

END MERGE_SORT

Best Case O(n*logn)
Average Case  O(n*logn)
Worst Case  O(n*logn)

 */
