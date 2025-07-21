package EasyProblems;
import java.util.*;

public class lc357Kfrequent {

  public static int[] findKFrequent(int[] nums, int k){
    HashMap<Integer, Integer> freqMap = new HashMap<>();
    // for(int n : nums){
    //   freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
    // }

    // PriorityQueue<HashMap.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

    // for(HashMap.Entry<Integer, Integer> entry : freqMap.entrySet()){
    //   minHeap.add(entry);
    //   if(minHeap.size() > k){
    //     minHeap.poll();
    //   }
    // }
    // int[] res = new int[k];
    // int i=0;
    // for(HashMap.Entry<Integer, Integer> entry : minHeap){
    //   res[i++] = entry.getKey();
    // }
    // return res;

    for(int num : nums){
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    List<int[]> arr = new ArrayList<>();
    for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
      arr.add(new int[]{entry.getValue(), entry.getKey()});
    }
    arr.sort((a, b) -> b[0] - a[0]);

      int[] res = new int[k];
      for(int i=0; i<k; i++){
        res[i] = arr.get(i)[1]; //give us the numbers
        // res[i] = arr.get(i)[0]; //gives us the frequency
      }
      return res;
  }
  public static void main(String[] args){
    int[] nums = {1, 1, 1, 2, 2, 3};
    int k = 2;
    int[] ans = findKFrequent(nums, k);
    System.out.println(k + " -> " + Arrays.toString(ans));
  }
}
