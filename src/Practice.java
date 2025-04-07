import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

  // Time Complexity: O(n)
  // Space Complexity: O(n)
  // n is the length of array
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
  // n is the length of the matrix
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: O(n)
  // Space Complexity: O(n))
  // n is the length of array
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
  // Space Complexity: O(n^2)
  // n is the value of int n
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
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   * // n is the length of nums
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) 
  {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()

    if(nums.length == 0)
    {
      return -1;
    }

    Map<Integer, Integer> intMap = new HashMap<>();
    for(Integer num : nums)
    {
      if(intMap.containsKey(num))
      {
        intMap.put(num, intMap.get(num) + 1 );
      }
      else{
        intMap.put(num, 1 );
      }
    }

    int maxValue = 0;
    int keyWithMaxValue = 0;

    
    for (int key : intMap.keySet()) 
    {
      if (intMap.get(key) > maxValue) 
      {
          maxValue = intMap.get(key);
          keyWithMaxValue = key;
      }
    }
    return keyWithMaxValue;

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
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */

  public static int mostCommonSpaceEfficient(int[] nums) 
  {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    if(nums.length == 0)
    {
      return -1;
    }
        
    Arrays.sort(nums); //sorted the list from smallest to largest 
    
    int count = 1;
    int maxCount = 1;
    int current = nums[0];
    int mostCommon = nums[0];

    for(int i = 1; i < nums.length; i++)
    {
      if(nums[i] == current)
      {
        count ++;
      }
      
      else
      {
        current = nums[i];
        count = 1;
      }
      
      if (count > maxCount)
      {
        maxCount = count;
        mostCommon = current;
          
      }
    }
    return mostCommon;
  }
}