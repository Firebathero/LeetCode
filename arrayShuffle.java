class Solution {
  public int[] shuffle(int[] nums, int n) {

    int[] ans = new int[nums.length];

    for (int i = 0, j = 0; j < nums.length; j++) {
      if (j % 2 == 0) {
        ans[j] = nums[i];
      }

      else if (j % 2 == 1) {
        ans[j] = nums[n + i];
        i++;

      }
    }
    return ans;
  }
}
