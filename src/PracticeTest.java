import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  @Test
  public void testMostCommonTimeEfficient_tieScenario() {
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

  @Test
  public void testMostCommonTimeEfficient_empty() {
    // arrage
    int[] intArray = {};
    // act
    int result = Practice.mostCommonTimeEfficient(intArray);
    // assert
    assertEquals(-1, result);
  }

  @Test
  public void testMostCommonTimeEfficient_onlyOneCommon() {
    // arrage
    int[] intArray = {1,2,3,4,5,5,5,6,7};
    // act
    int result = Practice.mostCommonTimeEfficient(intArray);
    // assert
    assertEquals(5, result);
  }

  @Test
  public void testMostCommonTimeEfficient_onlyOneForEach() {
    // arrage
    int[] intArray = {3,6,9,12,15};
    // act
    int result = Practice.mostCommonTimeEfficient(intArray);
    // assert
    assertEquals(3, result);
  }

  @Test
  public void testMostCommonTimeEfficient_onlyOne() {
    // arrage
    int[] intArray = {10};
    // act
    int result = Practice.mostCommonTimeEfficient(intArray);
    // assert
    assertEquals(10, result);
  }

  @Test
  public void testMostCommonSpaceEfficient_tieScenario() {
    // arrage
    int[] intArray = new int[5];
    intArray[0] = 1;
    intArray[1] = 2;
    intArray[2] = 2;
    intArray[3] = 3;
    intArray[4] = 3;
    // act
    int result = Practice.mostCommonSpaceEfficient(intArray);
    // assert
    assertEquals(2, result);
  }

  @Test
  public void testMostCommonSpaceEfficient_empty() {
    // arrage
    int[] intArray = {};
    // act
    int result = Practice.mostCommonSpaceEfficient(intArray);
    // assert
    assertEquals(-1, result);
  }

  @Test
  public void testMostCommonSpaceEfficient_onlyOneCommon() {
    // arrage
    int[] intArray = {2,4,6,8,8,8,10};
    // act
    int result = Practice.mostCommonSpaceEfficient(intArray);
    // assert
    assertEquals(8, result);
  }

  @Test
  public void testMostCommonSpaceEfficient_onlyOneForEach() {
    // arrage
    int[] intArray = {5,10,15,20,25};
    // act
    int result = Practice.mostCommonSpaceEfficient(intArray);
    // assert
    assertEquals(5, result);
  }

  @Test
  public void testMostCommonSpaceEfficient_onlyOne() {
    // arrage
    int[] intArray = {7};
    // act
    int result = Practice.mostCommonSpaceEfficient(intArray);
    // assert
    assertEquals(7, result);
  }

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
