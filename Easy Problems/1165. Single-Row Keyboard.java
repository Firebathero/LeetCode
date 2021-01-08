class Solution {
    
    public int calculateTime(String keyboard, String word) {
        
        int index = 0;
        HashMap<Character, Integer> layout = new HashMap<>();
        
        //populate alphabet map with [char,value]
        for(char c: keyboard.toCharArray()){
            layout.put(c, index);
            index++;
        }
        
        /*
        for each char in word[], get value at char in map
        compare value at c to previous
        */
        int steps = 0, prev = 0;
        for(char c: word.toCharArray()){
            int temp = layout.get(c);
            steps += Math.abs(prev - temp);
            prev = temp;
        }
        return steps;
    }
}
