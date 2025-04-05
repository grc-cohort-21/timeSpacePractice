import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity: O(n) | n = array.length
  // Space Complexity: O(n) | n = evens.length
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n) | n = matrix.length
  // Space Complexity: O(1)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: O(n) | n = Map iteration
  // Space Complexity: O(n) | n = frequencies
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: O(n^2) | n = n argument
  // Space Complexity: O(n) | n = n argument
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
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
   * Time Complexity: O(n) | n = nums.length/iteration
   * Space Complexity: O(n) | n = nums.length
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()
    
    // Empty Handling
    if (nums == null || nums.length == 0)
    {
      return 0;
    }

    Map<Integer, Integer> numfreq = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++)
    {
      if (numfreq.containsKey(nums[i]))
      {
        int keyAdded = numfreq.get(nums[i]) + 1;
        numfreq.replace(nums[i], keyAdded);
      }
      else
      {
        numfreq.put(nums[i], 1);
      }

    }

    List<Integer> highestNums = new ArrayList<>(numfreq.values());
    int numCount = 0;

    for (int num : highestNums)
    {
      if (num > numCount)
      {
        numCount = num;
      }

    }

    List<Integer> mostFrequentKey = new ArrayList<>();
    for (int num : numfreq.keySet())
    {
      if (numfreq.get(num) == numCount)
      {
        mostFrequentKey.add(num);
      }
    }

    return mostFrequentKey.get(0);

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
   * Time Complexity: O(n^2) | n = nums.length 
   * Space Complexity: O(1)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    int finalNum = 0;
    int finalCount= 0;

    for(int i = 0; i < nums.length; i++) {
      int currNum = nums[i];
      int currCount = 1;
      for(int j = i + 1; j < nums.length; j++) {
        if(currNum == nums[j]) {
          currCount++;
        }
      }
      if(finalCount < currCount) {
        finalCount = currCount;
        finalNum = nums[i];
      }
    }

    return finalNum;
  }
}