import java.util.*;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue(k, Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap();
        List<Integer> list = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for(int x : map.keySet()){
            queue.add(map.get(x));
        }


        for(int x : map.keySet()){
            if(list.size() == k)
                break;
            if(queue.poll() == map.get(x).intValue()){
                list.add(x);
                map.put(x, Integer.MAX_VALUE);
            }
        }
        return list;
    }

    public static void main(String[] args) {
//        [3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6]
//        10
        int [] A = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        System.out.println(topKFrequentElements.topKFrequent(A, 10));
    }
}
