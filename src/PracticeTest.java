import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;


public class PracticeTest {
  
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
