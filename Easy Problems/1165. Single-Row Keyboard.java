//First, fill hashmap with custom keyboard inputs and their index (which will be used to track distance between them)

class Solution {
  public int calculateTime(String keyboard, String word) {
    HashMap <Character, Integer> keyMap = new HashMap<>();
    for (int i = 0; i < keyboard.length(); i++) {
      keyMap.put(keyboard.charAt(i), i);
    }
      
//Calculate the absolute diff between starting position (prevKey) and the current position, then set current to prev and repeat for all chars in word
      
    int time = 0;
    int prevKey = 0;   
    for (int j = 0; j < word.length(); j++) {
      int currKey = keyMap.get(word.charAt(j));
      time += Math.abs(currKey - prevKey);
      prevKey = currKey;
    }
    return time;
  }
}
