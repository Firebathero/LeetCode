class Solution {
    public int balancedStringSplit(String s) {

        int rCount = 0, lCount = 0, balanced=0;
        
        for (char c : s.toCharArray()){
            if(c=='R'){
                rCount++;
            }
            else if (c=='L'){
                lCount++;
            }
            if (lCount == rCount){
                balanced++;
                lCount = 0;
                rCount = 0;
            }
        }    
        return balanced;        
    }
}