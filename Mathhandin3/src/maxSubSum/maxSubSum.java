package maxSubSum;

import java.util.*;

public class maxSubSum
{
  public int findMaxSubSum(ArrayList<Integer> input)
  {// TODO implement method
    if (input == null || input.isEmpty()) {
    return 0;
  }
    int maxSum=input.get(0);
    int currentSum = input.get(0);

    for (int i = 1; i < input.size(); i++) {
      int num = input.get(i);
      currentSum = Math.max(num, currentSum + num);
      maxSum = Math.max(maxSum, currentSum);
    }

    return Math.max(maxSum, 0);
  }

  public static void main(String[] args) {
    ArrayList<Integer> input = new ArrayList<>();
    input.add(31);
    input.add(-41);
    input.add(57);
    input.add(26);
    input.add(-53);
    input.add(59);
    input.add(97);
    input.add(-93);
    input.add(-23);
    input.add(84);

    maxSubSum maxSubSumObject = new maxSubSum();
    int result = maxSubSumObject.findMaxSubSum(input);
    System.out.println("Maximum Subarray Sum: " + result);
  }
}
