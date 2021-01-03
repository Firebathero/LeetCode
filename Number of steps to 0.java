class Solution {
    public int numberOfSteps (int num) {
        int counter = 0; 
        while(num!=0){
            if(num%2==1){
                num-=1;
                counter++;
            }
            else{
                num/=2;
                counter++;
            }
        }
        return counter;
    }
}