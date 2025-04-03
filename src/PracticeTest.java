import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  @Test
  void mostCommonTimeEfficient_oneValueHighestCount() {
    // arrange
    int[] nums = {1,1,2,3};
    // act
    int actual = Practice.mostCommonTimeEfficient(nums);
    // Assert
    assertEquals(1, actual);
  }

  @Test
  void mostCommonTimeEfficient_trueTieBreaker() {
    // Arrange
    int[] nums = {1,1,2,2,2,3,3,3};
    // Act
    int actual = Practice.mostCommonTimeEfficient(nums);
    // Assert
    assertEquals(2, actual);
  }

  @Test
  void mostCommonSpaceEfficient_oneValueHighestCount() {
    // Arrange
    int[] nums = {1,2,3,3,5,5,5};
    // Assert
    int actual = Practice.mostCommonSpaceEfficient(nums);
    // Arrange
    assertEquals(5, actual);
  }

  @Test
  void mostCommonSpaceEfficient_trueTieBreaker() {
    // Arrange
    int[] nums = {1,2,3,3,4,4,4,5,5,5};
    // Assert
    int actual = Practice.mostCommonSpaceEfficient(nums);
    // Arrange
    assertEquals(4, actual);
  }

}
