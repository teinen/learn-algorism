import java.util.*;

/**
 * EuclideanAlgorithm
 */
public class EuclideanAlgorithm {

  public static void main(String[] args) {
    int a = 221;
    int b = 143;

    long start = System.nanoTime();

    while(true) {
      int r = a % b;

      if(r == 0) {
        System.out.println("Greatest common factor is '" + b + "'");
        break;
      }

      a = b;
      b = r;
    }

    long end = System.nanoTime();

    System.out.println("Exec time: " + (end - start) / 1000000f + " ms");
  }
}