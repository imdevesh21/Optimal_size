package EasyProblems;
import java.util.*;
public class groupAnagram {

  public static List<List<String>> groupsAnagram(String[] strs){
    // create a map to groups the anagrams, where the key is the sorted strings, and the value is li
    Map<String, List<String>> map = new HashMap<>();
    
    // Iterate over the each string in the array
    for(String word : strs){
      // convert the string to a character array and sort It
      char[] ch = word.toCharArray();
      Arrays.sort(ch);

      // create a new string from the sorted character array
      String sortedStr = String.valueOf(ch);

      // if the sorted string key is not in the map, initailize the List
      // then add the original string to the list associated with the sorted string key
      map.computeIfAbsent(sortedStr, _ -> new ArrayList<>()).add(word);
    }
    // return a new list containing all  vlaues form the map's lists,
    // effectively grouping all anagram together
    return new ArrayList<>(map.values());
  }
  public static void main(String[] args) {
    String[] strs = {"act", "god", "cat", "dog", "tac"};    List<List<String>> grouped =   groupsAnagram(strs);
    for(List<String> ans : grouped){
      System.out.println(ans + " ");
    }
  }
}
