import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls


  // time efficency
  @Test
  void timeEfficent_fiveHighestAppearsFiveTimes() {
    // arrange
    int[] nums = {1, 9, 9, 4, 5, 5, 5, 5, 5};
    // act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //assert
    assertEquals(5, actual);
  }

  @Test
  void timeEfficent_threeHighestAppearsThreeTimesMultipleKings() {
    // arrange
    int[] nums = {1, 3, 3, 3, 4, 8, 5, 5, 5};
    // act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //assert
    assertEquals(3, actual);
  }


  // space effiency

  @Test
  void spaceEfficent_fiveHighestAppearsFiveTimes() {
    // arrange
    int[] nums = {1, 9, 9, 4, 5, 5, 5, 5, 5};
    // act
    int actual = Practice.mostCommonSpaceEfficient(nums);
    //assert
    assertEquals(5, actual);
  }

  @Test
  void spaceEfficent_threeHighestAppearsThreeTimesMultipleKings() {
    // arrange
    int[] nums = {1, 3, 3, 3, 4, 8, 5, 5, 5};
    // act
    int actual = Practice.mostCommonSpaceEfficient(nums);
    //assert
    assertEquals(3, actual);
  }
}
