class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedChars = new HashSet<>();
        
        // make set of allowed
        for (char c : allowed.toCharArray()) {
            allowedChars.add(c);
        }
        
        //for each word, for each char in an array of chars
        //if our set of legal chars does not contain the char we're looking at, decrement result
        int result = words.length;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (!allowedChars.contains(c)) {
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}