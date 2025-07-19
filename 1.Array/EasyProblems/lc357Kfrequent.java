package EasyProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class lc357Kfrequent {

  public static int[] findKFrequent(int[] nums, int k){
    HashMap<Integer, Integer> freqMap = new HashMap<>();
    for(int n : nums){
      freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
    }

    PriorityQueue<HashMap.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

    for(HashMap.Entry<Integer, Integer> entry : freqMap.entrySet()){
      minHeap.add(entry);
      if(minHeap.size() > k){
        minHeap.poll();
      }
    }
    int[] res = new int[k];
    int i=0;
    for(HashMap.Entry<Integer, Integer> entry : minHeap){
      res[i++] = entry.getKey();
    }
    return res;
  }
  public static void main(String[] args){
    int[] nums = {1, 1, 1, 2, 2, 3};
    int k = 2;
    int[] ans = findKFrequent(nums, k);
    System.out.println("The freqMap k element are: " + Arrays.toString(ans));
  }
}
