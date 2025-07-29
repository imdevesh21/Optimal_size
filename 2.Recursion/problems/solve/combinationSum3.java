package solve;
import java.util.*;
public class combinationSum3 {

  public static List<List<Integer>> findCombinations(int n, int k){
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ds = new ArrayList<>();
    helper(1, n, k, ds, ans);
    return ans;
  }

  public static void helper(int pos, int n, int k, List<Integer> ds, List<List<Integer>> ans){
    if(k == 0 && n == 0){
      ans.add(new ArrayList<>(ds));
      return;
    }
    if(k == 0 || n < 0)
      return;
    for(int i=pos; i<=9; i++){
      ds.add(i);
      helper(i+1, n-i, k-1, ds, ans);
      ds.remove(ds.size() - 1);
    }
  }
  public static void main(String[] args) {
    int n = 9;
    int k = 3;
    List<List<Integer>> ans = findCombinations(n, k);
    for(List<Integer> res : ans){
      System.out.println(res);
    }
  }
}
