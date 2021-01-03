class Solution {
    public int[] decompressRLElist(int[] nums) {
        int[]freq = new int[nums.length/2];
        int[]val = new int[nums.length/2];
              
    int p1=0,p2=0;
    for(int i = 0;i<nums.length;i++){
        if(i%2==0){
            freq[p1]=nums[i];
            p1++;
        }
        else{
            val[p2]=nums[i]; 
            p2++;
            }
        }
    ArrayList<Integer> res = new ArrayList<Integer>();  
    for(int t = 0; t<val.length;t++){
        for(int z= 0; z<freq[t];z++){
            res.add(val[t]);
        }
    }
                
     int [] result = new int[res.size()];
     for(int i=0;i<res.size();i++){
         result[i]=res.get(i);
     }          
     return result;  
} 
}