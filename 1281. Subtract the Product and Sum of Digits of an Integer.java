import java.util.ArrayList;

class Solution {
    public int subtractProductAndSum(int n) {
        int prod =1;
        int sum = 0;
        ArrayList<Integer> digitify = new ArrayList<Integer>();
        
        
        while (n>0){
            digitify.add(n%10);
            n = n/10;
            }
        
        for (int j = 0;j<digitify.size();j++){
            sum+=digitify.get(j);
            prod*=digitify.get(j);
            
        }
        return prod-sum;
    }
}