import java.util.*;

/**
 * InsertionSort
 */
public class InsertionSort {

  public static void main(String[] args) {
    int inputArr[] = {7, 3, 10, 2, 1, 6, 5, 9, 8, 4};

    // variables
    int i = 1;
    int k = 0;
    int tmp = 0;

    int len = inputArr.length;

    long start = System.nanoTime();

    System.out.println("=== Exec Insertion Sort in Java ===");

    while(i < len) {
      tmp = inputArr[i];
      k = i;

      while((k > 0) && (inputArr[k - 1] > tmp)) {
        inputArr[k] = inputArr[k - 1];
        --k;
      }

      inputArr[k] = tmp;
      i++;
    }

    System.out.println(Arrays.toString(inputArr));

    long end = System.nanoTime();

    System.out.println("Exec time: " + (end - start) / 1000000f + " ms");
  }
}