class Solution {
  public int sumOddLengthSubarrays(int[] arr) {

    int result = 0;
    int n = arr.length;
     
    /*
    1. find number of subarray starts and ends, multiply start*end to get total subarrays
    2. divide total by 2 to get number of odd subarrays
    3. add 1 subarr appearance when total is odd
    */
      
    for (int i = 0; i < n; i++) {
      int start = n - i;
      int end = i + 1;
      int total = start * end;
      int odd = total / 2;                //int divison rounds down
      if (total % 2 == 1) {
        odd++;
      }
      result += odd * arr[i];
    }

    return result;
  }
}