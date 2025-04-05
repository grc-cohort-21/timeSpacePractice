import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  // ******************** TESTS for mostCommonTimeEfficient ********************
  @Test
  void testMostCommonTimeEfficient_basicInput()
  {
    // Arrange
    
    // Act

    // Assert
  }


  // ******************** TESTS of mostCommonSpaceEfficient ********************
  @Test
  void testMostCommonSpaceEfficient_basicInput() {
    // Arrange
    int[] input = {1, 3, 5, 1, 4, 1, 5, 4};
    // Act
    int actual = Practice.mostCommonSpaceEfficient(input);
    // Assert
    assertEquals(1, actual);
  }

  @Test
  void testMostCommonSpaceEfficient_twoCommonNums() {
    // Arrange
    int[] input = {1, 2, 3, 2, 3, 2, 4, 3, 4, 5};
    // Act
    int actual = Practice.mostCommonSpaceEfficient(input);
    // Assert
    assertEquals(2, actual);
  }

  @Test
  void testMostCommonSpaceEfficient_sameAmountOfNums() {
    // Arrange
    int[] input = {1, 3, 2, 7, 4, 5, 6};
    // Act
    int actual = Practice.mostCommonSpaceEfficient(input);
    // Assert
    assertEquals(1, actual);
  }
}
