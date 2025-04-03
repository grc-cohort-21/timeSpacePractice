import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity: O(n)
  // Space Complexity: O(n)
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n)
  // Space Complexity: O(1)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }

  // Time Complexity: O(n) Where n is the size of the array
  // Space Complexity: O(n) Where n is the size of the array
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: O(n^2)
  // Space Complexity: O(n)
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for (int i = 0; i <= n * n; i += 2) {
      evens.add(i);
    }
    return evens;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: O(n) where n is the size of nums
   * Space Complexity: O(n) where n is the size of maps
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    Map<Integer, Integer> maps = new HashMap<>();
    // TODO: Complete this method with an implementation that runs
    for (int i = 0; i < nums.length; i++) {
      if (maps.containsKey(nums[i])) {
        maps.put(nums[i], maps.get(nums[i]) + 1);
      } else {
        maps.put(nums[i], 1);
      }
    }

    int common = 0;
    int often = 0;
    for (int num : maps.keySet()) {
      if (maps.get(num) > often) {
        often = maps.get(num);
        common = num;
      }
    }
    return common;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    int common = 0;
    int count = 0;
    int currcount = 0;

    for (int i = 0; i < nums.length - 1; i++) {

      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          currcount++;
        }
      }

      if (currcount > count) {
        common = nums[i];
        count = currcount;
      }
    }

    return common;
  }
}