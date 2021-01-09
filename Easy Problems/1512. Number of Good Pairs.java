// simple solution: nested for loop that checks val at i vs rest of array vals, and if match, increments answer(count of gps)
class Solution {
  public int numIdenticalPairs(int[] nums) {
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          ans++;
        }
      }
    }
    return ans;
  }
}

//bucket method
class Solution {
  public int numIdenticalPairs(int[] nums) {
    int ans = 0,
    count[] = new int[101]; //create empty bucket
    for (int num: nums) {   //for each number in the nums array     
      ans += count[num]++;  //add value of the index(number of times the int appeared), then increment the index
    }
    return ans;
  }
}
