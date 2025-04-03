import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
@Test
public static int mostCommonTimeEfficient() {

}


@Test
public static void mostCommonSpaceEfficient_mixedNums() {
  int[] arr = {1,2,3,4,4,4};
  int actual = Practice.mostCommonSpaceEfficient(arr);
  assertEquals(4, actual);
}

@Test
public static void mostCommonSpaceEfficient_tie(){
  int[] arr = {1,1,2,3,4,4};
  int actual = Practice.mostCommonSpaceEfficient(arr);
  assertEquals(1, actual);
}

@Test
public static void mostCommonSpaceEfficient_noDups(){
  int[] arr = {1,2,3,4};
  int actual = Practice.mostCommonSpaceEfficient(arr);
  assertEquals(1, actual);
}
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
