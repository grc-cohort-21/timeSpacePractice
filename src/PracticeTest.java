import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  //tests for mostCommonTimeEfficient

    @Test
      public void timeEfficientMostCommonNumWorking() {
      // Arrange
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7};
    
      // Act
        int result = Practice.mostCommonTimeEfficient(numbers);
    
      // Assert
        assertEquals(7, result); //expected res: 7
    }


}//end practiceTest
