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
}