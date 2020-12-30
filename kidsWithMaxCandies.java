class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        //initialize the max value
    int max = candies[0];
        //traverse the array to find the maximum value
        for(int i=0;i<candies.length;i++)
            if (candies[i]>=max)
                max=candies[i];
                
        //initialize the output list
        List<Boolean> ans = new ArrayList<>();
        
        //loop through each element and set t or f
        for (int i=0;i<candies.length;i++){
            if (candies[i] + extraCandies < max){
                ans.add(false);
                
            } else{
                ans.add(true);
                }
            }
        return ans;
    } 
}
