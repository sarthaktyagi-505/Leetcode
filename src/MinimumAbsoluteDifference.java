import java.util.*;

public class MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList();
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int minCurr = Math.abs(arr[i+1] - arr[i]);
            if(minCurr < min){
                min = minCurr;
            }
        }
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], i);
        }
        for(int i=0;i< arr.length;i++){
            List<Integer> list = new ArrayList<>();
            if(map.containsKey(arr[i] - min)){
                if(!list.contains(arr[i]) && !list.contains(arr[i] - min)){
                    list.add(arr[i] - min);
                    list.add(arr[i]);

                }
                result.add(list);
            }
        }

        return result;
    }
    public List<List<Integer>> minimumAbsDifference1(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int minCurr = arr[i+1] - arr[i];
            if(minCurr < min){
                min = minCurr;
            }
        }
        System.out.println(min);
        for(int i=0;i<arr.length-1;i++){
            int minCurr = arr[i+1] - arr[i];
            if(minCurr == min){
                List<Integer> list = new ArrayList();
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] x = {1,3,1,5,4};
        MinimumAbsoluteDifference minimumAbsoluteDifference = new MinimumAbsoluteDifference();
        List<List<Integer>> list = minimumAbsoluteDifference.minimumAbsDifference(x);
        System.out.println(list);
    }
}
