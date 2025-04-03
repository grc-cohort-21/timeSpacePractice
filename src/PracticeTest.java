import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  @Test
  public void testMostCommonTimeEfficient() {
    // arrage
    int[] intArray = new int[5];
    intArray[0] = 1;
    intArray[1] = 2;
    intArray[2] = 2;
    intArray[3] = 3;
    intArray[4] = 3;
    // act
    int result = Practice.mostCommonTimeEfficient(intArray);
    // assert
    assertEquals(2, result);
  }

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
