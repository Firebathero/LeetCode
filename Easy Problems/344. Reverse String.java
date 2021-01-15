//placehold first and last char, swap them then increment. Refer to start+i and end-i until they cross, then halt
class Solution {
    public void reverseString(char[] s) {

       int half = (s.length+1)/2;
        
        for (int i = 0; i < half; i++){
            char swippity = s[i];
            char swappity = s[s.length-1-i];
            s[i] = swappity;
            s[s.length-1-i] = swippity;
        }
    }
}