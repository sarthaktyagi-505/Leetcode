import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet();
        int[] res= new int[2];
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                res[0] = nums[i];
                res[1] = target - nums[i];
            }
            else{
                set.add(target-nums[i]);
            }
        }
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == res[k]){
                res[k] = i++;
                k++;
            }

            if(nums[i] == res[k]) {
                res[k] = i++;
                k++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {3,3};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.twoSum(nums, target)[0]);
        System.out.println(twoSum.twoSum(nums, target)[1]);
    }
}
