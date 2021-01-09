//Using loop, collect max of each sub-array and compare to max
class Solution {
  public int maximumWealth(int[][] accounts) {
    int max = 0;
    for (int[] customer: accounts) {
      int wealth = 0;
      for (int account: customer)
      wealth += account;
      max = Math.max(max, wealth);
    }
    return max;
  }
}


//Same concept using loop + stream to sum elements of array
class Solution {
  public int maximumWealth(int[][] accounts) {
    int max = 0;
    for (int[] customer: accounts) {
      int wealth = Arrays.stream(customer).sum();
      max = Math.max(max, wealth);
    }
    return max;
  }
}