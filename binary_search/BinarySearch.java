import java.util.*;

/**
 * BinarySearch
 */
public class BinarySearch {

  public static void main(String[] args) {
    int inputArr[] = {11, 13, 17, 19, 23, 29, 31};
    int targetNum = 29;

    int head = 0;
    int tail = inputArr.length - 1;

    long start = System.nanoTime();

    while (head <= tail) {
      int center = (head + tail) / 2;

      if(inputArr[center] == targetNum) {
        System.out.println("The target number(" + targetNum + ") was found.");
        break;

      } else if(inputArr[center] < targetNum) {
        head = center + 1;

      } else {
        tail = center - 1;
      }
    }

    if(head > tail) {
      System.out.println("The target number (" + targetNum + ") was not found...");
    }

    long end = System.nanoTime();

    System.out.println("Exec time: " + (end - start) / 1000000f + " ms");
  }
}