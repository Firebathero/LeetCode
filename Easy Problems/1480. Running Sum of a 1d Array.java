1119. Running Sum of a 1d Array

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Ans:  This can be solved with a simple loop.  The while loop is slightly more space effecient
*/


//while loop
class Solution {
  public int[] runningSum(int[] nums) {
    int i = 1;
    while (i < nums.length) {
      nums[i] += nums[i - 1];
      i++;
    }
    return nums;
  }
}

//for loop
class Solution {
  public int[] runningSum(int[] nums) {
    for (int i=1; i < nums.length; i++) {
      nums[i] += nums[i-1];
    }
    return nums;
  }
}
