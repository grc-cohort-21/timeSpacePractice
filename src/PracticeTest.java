import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
    // Tests for mostCommonTimeEfficient
    public static void main(String[] args) {
      testMostCommon();
  }
  
  public static void testMostCommon() {
      
      int result1 = Practice.mostCommonTimeEfficient(new int[]{1,2,3,3});
      System.out.println("Test 1: " + (result1 == 3 ? "PASSED" : "FAILED"));
      
      
      int result2 = Practice.mostCommonTimeEfficient(new int[]{2,2,1,1,2});
      System.out.println("Test 2: " + (result2 == 2 ? "PASSED" : "FAILED"));
      
      
      int result3 = Practice.mostCommonTimeEfficient(new int[]{1,2,3});
      System.out.println("Test 3: " + (result3 == 1 ? "PASSED" : "FAILED"));
  }

  public static void testMostCommonSpaceEfficient() {
    
    int result1 = Practice.mostCommonSpaceEfficient(new int[]{5});
    System.out.println("Test 1 (Single element): " + (result1 == 5 ? "PASSED" : "FAILED"));

    
    int result2 = Practice.mostCommonSpaceEfficient(new int[]{1, 2, 2, 3, 3, 3});
    System.out.println("Test 2 (Clear majority): " + (result2 == 3 ? "PASSED" : "FAILED"));

  
    int result3 = Practice.mostCommonSpaceEfficient(new int[]{1, 2, 2, 1});
    System.out.println("Test 3 (Tie breaker): " + (result3 == 1 ? "PASSED" : "FAILED"));
}
}