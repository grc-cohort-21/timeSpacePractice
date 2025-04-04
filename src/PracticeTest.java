import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  @Test
  void testUniqueNumTimeEfficientAlgo() {
    // arrange
    int input[] = {1,2,2,3,3,3,4};
    int expected = 3;
    // act
    int actual = Practice.mostCommonTimeEfficient(input);
    //assert
    assertEquals(expected, actual);
  }

  @Test
  void testUniqueNumTimeEfficientAlgo_multipleNumbers() {
    // arrange
    int input[] = {1,2,2,2,3,3,3,4};
    int expected = 2;
    // act
    int actual = Practice.mostCommonTimeEfficient(input);
    //assert
    assertEquals(expected, actual);
  }

  @Test
  void testUniqueNumTimeEfficientAlgo_multipleNumbersFindMostUnique() {
    // arrange
    int input[] = {1,2,2,2,3,3,3,3,4};
    int expected = 3;
    // act
    int actual = Practice.mostCommonTimeEfficient(input);
    //assert
    assertEquals(expected, actual);
  }

}
