import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

// Tests for mostCommonTimeEfficient method //

@Test
void mostCommonTimeEfficient_SingleElement() 
{
  // arrange
  int[] testArray = {100};
  // act
  int actual = Practice.mostCommonTimeEfficient(testArray);
  //assert
  assertEquals(100, actual);
}

@Test
void mostCommonTimeEfficient_OneMostCommonValue() 
{
  // arrange
  int[] testArray = {1, 2, 3, 1};
  // act
  int actual = Practice.mostCommonTimeEfficient(testArray);
  //assert
  assertEquals(1, actual);
}

@Test
void mostCommonTimeEfficient_MultipleMostCommonValues() 
{
  // arrange
  int[] testArray = {1, 2, 3, 1, 2, 2, 3, 3, 1};
  // act
  int actual = Practice.mostCommonTimeEfficient(testArray);
  //assert
  assertEquals(1, actual);
}

@Test
void mostCommonTimeEfficient_EmptyArray() 
{
  // arrange
  int[] testArray = {};
  // act
  int actual = Practice.mostCommonTimeEfficient(testArray);
  //assert
  assertEquals(-1, actual);
}

@Test
void mostCommonTimeEfficient_NegativeElements() 
{
  // arrange
  int[] testArray = {-1, 1, -2, 3, -1, 2, -3};
  // act
  int actual = Practice.mostCommonTimeEfficient(testArray);
  //assert
  assertEquals(-1, actual);
}


}
