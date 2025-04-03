import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  @Test
  void mostCommonTimeEfficient_normalResult(){
    int[] input = {3,4,3,5,6,8,9,5,3,2,3,4,3,3,3};

    int actual = Practice.mostCommonTimeEfficient(input);

    assertEquals(3, actual);
  }
    
  @Test
  void mostCommonTimeEfficient_tieResult(){
    int[] input = {1,2,3,4,5,6};

    int actual = Practice.mostCommonTimeEfficient(input);

    assertEquals(1, actual);
  }

  @Test
  void mostCommonTimeEfficient_emptyArray(){
    int[] input = {};

    int actual = Practice.mostCommonTimeEfficient(input);

    assertEquals(-1, actual);
  }
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
