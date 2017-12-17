import java.util.*;

/**
 * SieveOfEratosthenes
 */
public class SieveOfEratosthenes {

  public static void main(String[] args) {
    int arr[] = new int[100];
    Arrays.fill(arr, 1);

    int size = arr.length;
    int i = 0;
    int k = 2;

    long start = System.nanoTime();

    System.out.println("=== Find Prime Numbers in Java ===");

    while(Math.pow(k, 2) <= size) {
      i = k;

      while(i * k < size) {
        arr[k * i] = 0;
        i++;
      }

      do {
        k++;
      } while (arr[k] == 0);
    }

    i = 2;

    while(i < size) {
      if(arr[i] == 1) {
        System.out.println(i);
      }
      i++;
    }

    long end = System.nanoTime();

    System.out.println("Exec time: " + (end - start) / 1000000f + " ms");
  }
}