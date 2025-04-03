import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;


public class PracticeTest {
  @Test
  void mostCommonTimeEfficient_normalResult(){
    int[] input = {3,4,3,5,6,8,9,5,3,2,3,4,3,3,3};

    int actual = Practice.mostCommonTimeEfficient(input);

    assertEquals(3, actual);
  }
    
  @Test
  void mostCommonTimeEfficient_tieResult(){
    int[] input = {1,2,3,4,5,6};

    int actual = Practice.mostCommonTimeEfficient(input);

    assertEquals(1, actual);
  }

  @Test
  void mostCommonTimeEfficient_emptyArray(){
    int[] input = {};

    int actual = Practice.mostCommonTimeEfficient(input);

    assertEquals(-1, actual);
  }
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  @Test
  void testMostCommonSpaceEfficient_EqualsTwo() {
    int[] nums = {2, 1, 1, 2, 2, 3, 4};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(2, actual);
  }

  @Test
  void testMostCommonSpaceEfficient_EqualsFirstTie() {
    int[] nums = {1, 1, 1, 2, 2, 3, 2};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(1, actual);
  }

  @Test
  void testMostCommonSpaceEfficient_StartsAtAnotherIndex() {
    int[] nums = {1, 2, 1, 2, 2, 3, 2};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(2, actual);
  }
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
