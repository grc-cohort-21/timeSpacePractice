import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  //N = array.length
  // Time Complexity: o(N) 
  // Space Complexity: o(N)
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // n = matrix.length
  // Time Complexity: O(n)
  // Space Complexity: O(1)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  
  // n = array length
  // Time Complexity: O(n)
  // Space Complexity: O(n)
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) { // o(n)
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1); // O(1)
    }
    return frequencies;
  }

  //The size of N
  // Time Complexity: o(N^2)
  // Space Complexity: o(N
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) { //o(n^2)
      evens.add(i); //o(1)
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
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java     // [1, 1, 2, 2, 3]
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()

    Map<Integer, Integer> mapping = new HashMap<>();
    int commonNum = 0;
    int mostCommon = nums[0];
    
    for(int item: nums) //Loop the array
    {
      if(!mapping.containsKey(item)) //Store in map as a key if not there
      {
        mapping.put(item, 0); //init value to 0
      }

      int amount = mapping.get(item) + 1; //Store the number in a Integer Variable
      mapping.put(item, amount); //Add one to the value of the map

      if(commonNum < mapping.get(item)) // if 0 is less than item(looped through array)'s values on the map 
      {
        commonNum = mapping.get(item); // Assigned the returned value to the maps highest unique number value
        mostCommon = item; // we return this value, so that if the first pair found is the expected value then it returns.
      }
    }

    return mostCommon; //return unique number
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
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    return -1;
  }
}