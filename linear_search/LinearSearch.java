import java.util.*;

/**
 * LinearSearch
 */
public class LinearSearch {

  public static void main(String[] args) {
    Integer inputArray[] = {13, 5, 17, 2, 11, 35};
    Integer targetNum = 11;
    boolean targetFoundFlg = false;

    long start = System.nanoTime();

    for(Integer inputNum : inputArray) {
      if(targetNum == inputNum) {
        targetFoundFlg = true;
        System.out.println("The target number(" + targetNum + ") was found.");
        break;
      }
    }

    if(targetFoundFlg != true) {
      System.out.println("The target number (" + targetNum + ") was not found...");
    }

    long end = System.nanoTime();

    System.out.println("Exec time: " + (end - start) / 1000000f + " ms");
  }
}