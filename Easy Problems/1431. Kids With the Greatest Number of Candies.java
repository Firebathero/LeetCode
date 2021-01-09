//Intuitive method using 2 loops, 
//First loop finds max candies 
//Second loop populates list with true/false if index is maxable using extracandies

class Solution {
  public List < Boolean > kidsWithCandies(int[] candies, int extraCandies) {
    List < Boolean > ans = new ArrayList < >(candies.length);
    int max = 0;
    for (int candy: candies) {
      max = Math.max(candy, max);
    }
    for (int candy: candies) {
      ans.add(candy + extraCandies >= max);
    }
    return ans;
  }
}

