//create char array and populate index i with s.charAt i, then return new String(c);
class Solution {

  public String restoreString(String s, int[] index) {
    char[] c = new char[index.length];

    for (int i = 0; i < index.length; i++) {
      c[index[i]] = s.charAt(i);
    }
    return new String(c);
  }
}