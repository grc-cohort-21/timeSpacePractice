import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeTest {

  // TODO: Implement tests for Practice.mostCommonTimeEfficient and
  // Practice.mostCommonSpaceEfficient

  @Test
  void mostCommonTimeEfficient_basic() {
    int[] nums = { 3, 4, 5, 8, 9, 2, 4, 3, 3 };

    int common = Practice.mostCommonTimeEfficient(nums);

    assertEquals(3, common);
  }

  @Test
  void mostCommonTimeEfficient_tie() {
    int[] nums = { 3, 4, 5, 8, 9, 2, 4, 3, 3, 4 };

    int common = Practice.mostCommonTimeEfficient(nums);

    assertEquals(3, common);
  }

  @Test
  void mostCommonTimeEfficient_basic2() {
    int[] nums = { 3, 4, 5, 8, 9, 2, 4, 3, 3, 4, 4 };

    int common = Practice.mostCommonTimeEfficient(nums);

    assertEquals(4, common);
  }

  // Hints: They are static methods, so you will use the full
  // Practice.mostCommonTimeEfficient for method calls
}
