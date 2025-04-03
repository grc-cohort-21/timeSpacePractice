import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity: O(n) n = array.length
  // Space Complexity: O(n) = n = evens.length
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n), n = matrix.length
  // Space Complexity: O(n^2), n = sum
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity:  O(n), n = array.length
  // Space Complexity: o(n), n = frequencies.length
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: O(n^2), n = n
  // Space Complexity: O(n), n = evens
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
   * Time Complexity: O(n), n = nums
   * Space Complexity: O(n), n = uniqueCount
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()
    Map<Integer, Integer> uniqueCount = new HashMap<>();
    for (int i : nums) {
      if (!uniqueCount.containsKey(i)) {
        uniqueCount.put(i, 1);
      } else {
        uniqueCount.put(i, uniqueCount.get(i) + 1);
      }
    }
    int mostCommon = 0;
    int mostCommonCounter = 0;
    for (Map.Entry<Integer, Integer> entry : uniqueCount.entrySet()) {
      if (entry.getValue()>mostCommonCounter){
        mostCommon = entry.getKey();
        mostCommonCounter = entry.getValue();
      }
    }
    return mostCommon;
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
    
    // Make a new array with size 10
    int[] frequency = new int[10];

    // Count the frequency 
    for (int num : nums) {
      frequency[num]++;
    }

    int maxFreq = 0;
    int mostFrequent = -1; 

    // Loop through frequency array to find the highest frequency
    for (int i = 0; i < frequency.length; i++) {
      if (frequency[i] > maxFreq) {
        maxFreq = frequency[i];
        mostFrequent = i;
      }
    }

    return mostFrequent;
  }
}