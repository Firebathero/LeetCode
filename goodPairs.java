class Solution {
    public int numIdenticalPairs(int[] nums) {
        //iterate through array length -1
        //store current val and check against each index of the array. if ==, increase counter
        
        int counter=0;
        
        for (int i=0;i<nums.length-1;i++){
            int t=nums[i];
            
            for (int j=i+1;j<nums.length;j++)
                if(t==nums[j]){
                    counter++;
            }
        }
        return counter;
    }
}