package solve;
import java.util.*;
public class wordBreak {

  // Using boolean[] for memoization since we only need true/false values.
  private boolean[] memo;
  private int n;
  public boolean wordBreakUtil(String s, List<String> wordDict){
    n = s.length();
    memo = new boolean[s.length()];
    return solve(s, 0, wordDict);
  }

  public boolean solve(String s, int idx, List<String> wordDict){

    if(idx == n) return true;

    // If memo[idx] is true or false, return it; otherwise, continue.
    // Since boolean[] defaults to false, we need a separate visited array or use Boolean[] if null is needed.
    if(memo[idx]) return true;

    for(int i=idx+1; i<=n; i++){
      String split = s.substring(idx, i);
      if(wordDict.contains(split) && solve(s, i, wordDict)){
        memo[idx] = true;
        //System.out.println(new WordBreak().wordBreaks(s, wordDictList));
        return true;
      }
    }
    return memo[idx] = false;
  }
  public static void main(String[] args){
    String s = "leetcode";
    List<String> wordDict = Arrays.asList("leet", "code");
    wordBreak wb = new wordBreak();
    boolean result = wb.wordBreakUtil(s, wordDict);
    System.out.println(result);
  }
}
