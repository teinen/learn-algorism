import java.util.*;

/**
 * BubbleSort
 */
public class BubbleSort {

  public static void main(String[] args) {
    int inputArr[] = {20, 13, 17, 15, 18, 16, 14, 19};

    // variables
    int len = inputArr.length;
    int lastIdx = len - 1;
    int i = 0;
    int k = 0;
    int w = 0;

    long start = System.nanoTime();

    System.out.println("=== Exec Bubble Sort in Java ===");

    while(k < lastIdx) {
      i = lastIdx;
      while(i > k) {
        if(inputArr[i - 1] > inputArr[i]) {
          w = inputArr[i - 1];
          inputArr[i - 1] = inputArr[i];
          inputArr[i] = w;
        }
        i--;
      }
      k++;
    }

    System.out.println(Arrays.toString(inputArr));

    long end = System.nanoTime();

    System.out.println("Exec time: " + (end - start) / 1000000f + " ms");
  }
}