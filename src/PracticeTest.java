import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  // ******************** TESTS for mostCommonTimeEfficient ********************
  @Test
  void testMostCommonTimeEfficient_oneMax()
  {
    // Arrange
    int[] input = {1, 5, 3, 7, 4, 4};
    // Act
    int actual = Practice.mostCommonTimeEfficient(input);
    // Assert
    assertEquals(4, actual);
  }

  @Test
  void testMostCommonTimeEfficient_multiMax()
  {
    // Arrange
    int[] input = {2, 6, 4, 5, 4, 5, 3, 9, 9, 5, 4};
    // Act
    int actual = Practice.mostCommonTimeEfficient(input);
    // Assert
    assertEquals(4, actual);
  }

  


  // ******************** TESTS of mostCommonSpaceEfficient ********************



}
