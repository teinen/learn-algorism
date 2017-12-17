import java.util.*;

/**
 * Hash Search
 */
public class HashSearch {

  public static void main(String[] args) {
    int arrD[] = {12, 25, 36, 20, 30, 8, 42};
    int len = arrD.length;

    int arrH[] = new int[len * 2];
    Arrays.fill(arrH, 0);

    int i = 0;
    int k = 0;

    long start = System.nanoTime();

    System.out.println("=== Exec Hash Search in Java ===");

    // Store data using hash
    while(i < len) {
      k = arrD[i] % 11;

      while(arrH[k] != 0) {
        k = (k + 1) % 11;
      }

      arrH[k] = arrD[i];
      i++;
    }

    // Input search target
    int target = 25;
    k = target % 11;

    System.out.println(Arrays.toString(arrH));

    // Search target number
    while(arrH[k] != 0) {
      if(arrH[k] == target) {
        System.out.println("Target number(" + target + ") is stored at index of " + k + ".");
        break;

      } else {
        k = (k + 1) % 11;
      }
    }

    if(arrH[k] == 0) {
      System.out.println("Target number(" + target + ") is not stored in array.");
    }

    long end = System.nanoTime();

    System.out.println("Exec time: " + (end - start) / 1000000f + " ms");
  }
}