import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  @Test
  public void testMostCommonTimeEff(){
    //arrange
    int[] input ={1, 2, 2, 2, 3, 3, 4, 5};
    //act
    int actual = Practice.mostCommonTimeEfficient(input);
    //assert
    assertEquals(2, actual);

  }

  @Test 
  public void testMostCommonTimeEff_tieBreaker(){
    //arrange
    int[]input ={4, 5, 4, 5};
    //act
    int actual =Practice.mostCommonTimeEfficient(input);
    //assert
    assertEquals(4, actual);
  }
}
