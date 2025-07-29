package solve;

import java.util.ArrayList;
import java.util.List;

public class letterCombination {

  public List<String> letterCombinations(String digits){
    List<String> res = new ArrayList<>();

    if(digits.length() == 0){
      return res;
    }

    res.add("");

    String[] digitToLetters = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    for(char digit : digits.toCharArray()){
      String letters = digitToLetters[digit - '2'];

      List<String> temp = new ArrayList<>();

      for(String Combinations : res){
        for(char letter : letters.toCharArray()){
          temp.add(Combinations + letter);
        }
      }
      res = temp;
    }
    return res;
  }
  public static void main(String[] args){
    letterCombination obj = new letterCombination();
    String input = "23";
    List<String> output = obj.letterCombinations(input);
    System.out.println("Combinations for \"" + input + "\": " + output);
  }
}
