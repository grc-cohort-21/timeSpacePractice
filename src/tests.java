import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class tests {

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
        int[] nums = {1, 2, 2, 1, 1, 2, 3};
        assertEquals(1, Practice.mostCommonTimeEfficient(nums));
    }

    @Test
    public void mostCommonSpaceEfficient_mixedNums() {
        int[] arr = {1, 2, 3, 4, 3, 4, 4};
        int actual = Practice.mostCommonSpaceEfficient(arr);
        assertEquals(4, actual);
    }

    @Test
    public void mostCommonSpaceEfficient_tie() {
        int[] arr = {1, 2, 2, 3, 4, 4};
        int actual = Practice.mostCommonSpaceEfficient(arr);
        assertEquals(2, actual);
    }

    @Test
    public void mostCommonSpaceEfficient_noDups() {
        int[] arr = {1, 2, 3, 4};
        int actual = Practice.mostCommonSpaceEfficient(arr);
        assertEquals(1, actual);
    }

    // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}