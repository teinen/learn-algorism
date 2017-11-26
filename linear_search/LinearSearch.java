import java.util.*;

/**
 * LinearSearch
 */
public class LinearSearch {

  public static void main(String[] args) {
    Integer inputArr[] = {13, 5, 17, 2, 11, 35};
    Integer targetNum = 11;
    boolean targetFindFlg = false;

    long start = System.nanoTime();

    for(Integer inputNum : inputArr) {
      if(targetNum == inputNum) {
        targetFindFlg = true;
        System.out.println("The target number(" + targetNum + ") was found.");
        break;
      }
    }

    if(targetFindFlg != true) {
      System.out.println("The target number (" + targetNum + ") was not found...");
    }

    long end = System.nanoTime();

    System.out.println("Exec time: " + (end - start) / 1000000f + " ms");
  }
}