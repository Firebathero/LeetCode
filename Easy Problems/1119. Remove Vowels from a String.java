//Simple approach:  use the replaceAll() function.
public String removeVowels(String S) {
        return S.replaceAll("[aeiou]", "");
    }


//High performance approach - StringBuffer to build and user created isVowel Function
class Solution {
    public String removeVowels(String S) {
        StringBuffer sb = new StringBuffer(S.length());
        
		// For each character in String S, see if its a vowel, if it isn't then add to StringBuffer
        for(int i = 0; i < S.length(); i++){
            if(!isVowel(S.charAt(i))){
                sb.append(S.charAt(i));
            }
        }
        
        return sb.toString();     
    }
    
	// Using a function to check values, this makes it easy to control what to check for if things change
    public boolean isVowel(char c){
		// if list of things to check for grows, could switch to a hashset to minimize comparisons.
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        
        return false;
    }
}

