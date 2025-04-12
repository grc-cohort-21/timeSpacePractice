import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity:   n
  // Space Complexity:  n
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity:   n
  // Space Complexity:  n^2
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity:   n
  // Space Complexity:  n
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity:   n^2
  // Space Complexity:  n
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
   * Time Complexity: 2n -> n
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : nums){
      if(frequencyMap.containsKey(num)){
        frequencyMap.put(num, frequencyMap.get(num)+1);
      }
      else{
        frequencyMap.put(num, 1);
      }
    }
    int king = -1;
    int kingOccurence = -1;
    for(int key : frequencyMap.keySet()){
      if(frequencyMap.get(key) > kingOccurence){
        kingOccurence = frequencyMap.get(key);
        king = frequencyMap.get(key);
      }
    }
    return king;
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
   * Time Complexity: n^2
   * Space Complexity: 1
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */

  public static int mostCommonSpaceEfficient(int[] nums) {
    int king = 0;
    int kingFrequency = 0;
    for (int i = 0; i < nums.length; i++) {
      int frequency = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          frequency++;
        }
      }
      if (frequency > kingFrequency) {
        kingFrequency = frequency;
        king = nums[i];
      }
    }
    return king;
  }
}

// I wonder if there is a way to get to 
// time complexity log(n) or lower
// while preserving space complexity at n or lower.
// a tree, maybe?