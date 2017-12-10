import java.util.*;

/**
 * SelectionSort
 */
public class SelectionSort {

  public static void main(String[] args) {
    int inputArr[] = {20, 13, 17, 15, 18, 16, 14, 19};

    // variables
    int i = 0;
    int k = 0;
    int idxMin = 0;
    int w = 0;

    int len = inputArr.length;

    long start = System.nanoTime();

    while(i < len - 1) {
      idxMin = i;
      k = i + 1;

      while(k < len) {
        if(inputArr[k] < inputArr[idxMin]) {
          idxMin = k;

        } else {
          k++;
        }

      }
      // change the min number
      w = inputArr[i];

      inputArr[i] = inputArr[idxMin];

      inputArr[idxMin] = w;

      i++;
    }

    System.out.println(Arrays.toString(inputArr));

    long end = System.nanoTime();

    System.out.println("Exec time: " + (end - start) / 1000000f + " ms");
  }
}