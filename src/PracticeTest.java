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
        assertEquals(7, result); //expected res: 7, most common number
    }//end working

    @Test
      public void timeEfficientMostCommonNumTie() {
      // Arrange
        int[] nums = {1, 1, 2, 2, 3, 3};
        
      // Act
        int result = Practice.mostCommonTimeEfficient(nums);
        
      // Assert
        assertEquals(1, result); //expected res: 1, the first most common number is never overwritten since its a tie
    }//end tie

    @Test
      public void timeEfficientMostCommonNumOutOfOrder() {
      // Arrange
        int[] numerals = {1, 2, 3, 2, 3, 2, 3, 7, 3};
        
      // Act
        int result = Practice.mostCommonTimeEfficient(numerals);
        
      // Assert
        assertEquals(3, result); //expected res: 3, the most common number but out of order
    }// end outOfOrder

    




    
}//end practiceTest
