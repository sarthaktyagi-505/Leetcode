import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class KthDifferencePairs {
    public int findPairs(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap();
        List<List<Integer>> result = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i])+1);
        }
        if(k == 0){
            for(int x : map.keySet()){
                List<Integer> list = new ArrayList<>();
                if(map.get(x) > 1){
                    if(!list.contains(x))
                        list.add(x);
                }
                if(!list.isEmpty())
                    result.add(list);
            }
            return result.size();
        }
        for(int i=0;i< nums.length;i++){
            List<Integer> list = new ArrayList<>();
            if(map.containsKey(nums[i] - k)){
                if(!list.contains(nums[i]) && !list.contains(nums[i] - k)){
                    list.add(nums[i] - k);
                    list.add(nums[i]);
                }
                result.add(list);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        Integer[] x = set.toArray(new Integer[set.size()]);
        for(int i=0;i<x.length;i++){
            System.out.println(x[i].intValue());
        }
        return result.size();
    }

    public static void main(String[] args) {
        //[1,3,1,5,4]
        //0
        int[] arr = {1,3,1,5,4};
        int k = 0;
        KthDifferencePairs kthDifferencePairs = new KthDifferencePairs();
        System.out.println(kthDifferencePairs.findPairs(arr, k));
    }
}
