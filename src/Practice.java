import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity:o(n)
  // Space Complexity: o(n)
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity:o(n)
  // Space Complexity: o(1)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: o(n)
  // Space Complexity: o(n)
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: o(n^2)
  // Space Complexity: o(n^2)
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
    //map that store how many time each number appears
    Map<Integer, Integer> countMap = new HashMap<>();

    //map for the index
    Map<Integer, Integer> firstSeen = new HashMap<>();

    int maxCount = 0;
    int mostAppear = nums[0];

    for(int i=0; i< nums.length; i++){
      int num = nums[i];
    

    //update count
    countMap.put(num, countMap.getOrDefault(num, 0) +1);

    if(!firstSeen.containsKey(num)){
      firstSeen.put(num, i);
    }
    
    int count = countMap.get(num);

    if(count > maxCount || (count == maxCount && firstSeen.get(num)< firstSeen.get(mostAppear))){
      maxCount =count;
      mostAppear =num;
    }
  }


    return mostAppear;
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
    int mostCommon = nums[0];
    int maxCount = 0;

    for(int i=0; i< nums.length; i++){
      int count =0;

      for(int j =0; j < nums.length; j++){
        if (nums[j] == nums[i]){
          count ++;
        }
      }

      if(count > maxCount){
        maxCount = count;
        mostCommon= nums[i];
      }


    }
    return mostCommon;
  }
}