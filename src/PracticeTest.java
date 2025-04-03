import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
/**
 * 
 */
public static void main(String[] args) {
  testMostCommonTimeEfficient_SingleElement();
  testMostCommonTimeEfficient_AllSameElements();

  mostCommonSpaceEfficient_mixedNums();
  mostCommonSpaceEfficient_tie();
  mostCommonSpaceEfficient_noDups();
}

@Test
  public void testMostCommonTimeEfficient_SingleElement() {
    int[] nums = {5};
    assertEquals(5, Practice.mostCommonTimeEfficient(nums));
  }
  
  @Test
  public void testMostCommonTimeEfficient_AllSameElements() {
    int[] nums = {2, 2, 2, 2};
    assertEquals(2, Practice.mostCommonTimeEfficient(nums));
  }
  
  @Test
  public void testMostCommonTimeEfficient_OneMostCommon() {
    int[] nums = {1, 2, 2, 3, 3, 3, 4};
    assertEquals(3, Practice.mostCommonTimeEfficient(nums));
  }
  
  @Test
  public void testMostCommonTimeEfficient_TieBreakerFirstWins() {
    int[] nums = {1, 2, 2, 1, 3};
    assertEquals(1, Practice.mostCommonTimeEfficient(nums));
  }


@Test
public static void mostCommonSpaceEfficient_mixedNums() {
  int[] arr = {1,2,3,4,3,4,4};
  int actual = Practice.mostCommonSpaceEfficient(arr);
  assertEquals(4, actual);
}

@Test
public static void mostCommonSpaceEfficient_tie(){
  int[] arr = {1,2,2,3,4,4};
  int actual = Practice.mostCommonSpaceEfficient(arr);
  assertEquals(2, actual);
}

@Test
public static void mostCommonSpaceEfficient_noDups(){
  int[] arr = {1,2,3,4};
  int actual = Practice.mostCommonSpaceEfficient(arr);
  assertEquals(1, actual);
}
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
