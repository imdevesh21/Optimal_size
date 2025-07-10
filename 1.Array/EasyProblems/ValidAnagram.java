package EasyProblems;

// A anagram is a word or phrase formed by rearraning the letters of a diff word or phrase, typically using all the original letters exactly once

public class ValidAnagram {

  public static boolean isAnagra(String s, String t){
    if(s.length() != t.length()) return false;

    // for lowercase a-z
    int[] freq = new int[26];

    // counting freq for each character int s
    for(int i=0; i<s.length(); i++){
      freq[s.charAt(i) - 'a']++;
    }

    // subtract freq using character from t
    for(int i=0; i<t.length(); i++){
      freq[t.charAt(i) - 'a']--;
    }
    
    // check if all freq are zero
    for(int count : freq){
      if(count != 0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    String s = "anagram";
    String t = "naaragm";
    boolean res = isAnagra(s, t);
    System.out.println("Is anagram: " + res);
  }
}
