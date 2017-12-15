import java.util.*;

/**
 * InsertionSort
 */
public class InsertionSort {

  public static void main(String[] args) {
    int inputArr[] = {17,72,27,77,43,100,6,9,92,37,1,50,36,67,45,98,33,54,19,91,99,65,3,69,12,79,18,42,90,16,84,51,70,29,61,2,14,76,39,95,81,97,82,96,63,58,53,89,11,5,20,47,23,88,44,62,83,7,34,74,10,57,64,22,32,48,4,46,80,13,71,38,25,93,15,21,73,30,66,26,56,55,8,24,52,94,49,40,87,60,31,75,41,59,28,78,35,86,68,85};

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