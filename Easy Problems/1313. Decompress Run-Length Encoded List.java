/* 
Simple list solve, start with index 0 and add val at index 1 to list as many times as index 0 indicates, then skip index to next frequency determining index. 

Once list is populated, convert back for answer format
*/
class Solution {
  public int[] decompressRLElist(int[] nums) {
    List <Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i += 2) {
      for (int j = 0; j < nums[i]; j++) {
        list.add(nums[i + 1]);
      }
    }
    int[] res = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      res[i] = list.get(i);
    }
    return res;
  }
}
