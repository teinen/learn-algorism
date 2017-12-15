import java.util.*;

/**
 * QuickSort
 */
public class QuickSort {

  public static void main(String[] args) {
    int arr[] = {17,72,27,77,43,100,6,9,92,37,1,50,36,67,45,98,33,54,19,91,99,65,3,69,12,79,18,42,90,16,84,51,70,29,61,2,14,76,39,95,81,97,82,96,63,58,53,89,11,5,20,47,23,88,44,62,83,7,34,74,10,57,64,22,32,48,4,46,80,13,71,38,25,93,15,21,73,30,66,26,56,55,8,24,52,94,49,40,87,60,31,75,41,59,28,78,35,86,68,85};

    int left = 0;
    int right = arr.length - 1;

    long start = System.nanoTime();

    System.out.println("=== Exec Quick Sort in Java ===");

    int[] result = quickSort(arr, left, right);

    System.out.println(Arrays.toString(result));

    long end = System.nanoTime();

    System.out.println("Exec time: " + (end - start) / 1000000f + " ms");
  }

  private static int[] quickSort(int[] arr, int left, int right) {
    if(left <= right) {
      int pivot = arr[(left + right) / 2];
      int l = left;
      int r = right;

      while(l <= r) {
        while(arr[l] < pivot) {
          l++;
        }

        while(arr[r] > pivot) {
          r--;
        }

        if(l <= r) {
          int tmp = arr[l];
          arr[l] = arr[r];
          arr[r] = tmp;
          l++;
          r--;
        }
      }

      quickSort(arr, left, r);
      quickSort(arr, l, right);
    }

    return arr;
  }
}