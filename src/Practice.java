import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity: 0(n)
  // Space Complexity: 0(n)
  
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: 0(n)
  // Space Complexity: 0(1)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: 0(n)
  // Space Complexity: 0(n)
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: 0(n2)
  // Space Complexity: 0(n)
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
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()

    Map<Integer, Integer> temp = new HashMap<>();
    int common = 0;
    for(int num: nums){
      if(!temp.containsKey(num)){
        temp.put(num, 1);
      }else{
        temp.put(num, (temp.get(num) +1));
      }
    }
    for (Integer current: temp.keySet()){
      if(temp.get(current) < common){
        common = current;
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
   * Time Complexity: 0(n2)
   * Space Complexity: 0(n)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
 public static int mostCommonSpaceEfficient(int[] nums) {
    if (nums == null || nums.length == 0) {
        throw new IllegalArgumentException("Input array is empty or null");
    }
    
    int maxCount = 0;
    int mostCommon = nums[0];
    
    for (int i = 0; i < nums.length; i++) {
        int currentNum = nums[i];
        int currentCount = 0;
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == currentNum) {
                currentCount++;
            }
        }
        
        if (currentCount > maxCount) {
            maxCount = currentCount;
            mostCommon = currentNum;
        }
    }
    
    return mostCommon;
}
}