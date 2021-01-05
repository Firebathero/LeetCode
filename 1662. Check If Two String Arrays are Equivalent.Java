class Solution {
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

    boolean stringsEqual;

    // first attempt, use stringbuffer to convert arrays to one string each
      
    StringBuffer buffboy = new StringBuffer();
    StringBuffer buffboy2 = new StringBuffer();
    for (int i = 0; i < word1.length; i++) {
      buffboy.append(word1[i]);
    }
    String stringOne = buffboy.toString();

    for (int i = 0; i < word2.length; i++) {
      buffboy2.append(word2[i]);
    }

    String stringTwo = buffboy2.toString();

      
    //compare strings
    if (stringOne.equals(stringTwo)) {
      stringsEqual = true;
    }
    else {
      stringsEqual = false;
    }
    return stringsEqual;
  }

}