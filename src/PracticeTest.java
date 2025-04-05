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

  @Test
  void testMostCommonTimeEfficient_emptyInput()
  {
    // Arrange
    int[] input = {};
    // Act
    int actual = Practice.mostCommonTimeEfficient(input);
    // Assert
    assertEquals(0,  actual);
    
  }

  @Test
  void testMostCommonTimeEfficient_singleInput()
  {
    // Arrange
    int[] input = {1};
    // Act
    int actual = Practice.mostCommonTimeEfficient(input);
    // Assert
    assertEquals(1, actual);
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
