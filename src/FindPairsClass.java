import java.util.HashSet;
import java.util.Set;

public class FindPairsClass {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        if(nums.length == 0 || k == 0)
            return 0;
        Set<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-k))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        int k = 1;
        FindPairsClass findPairsClass = new FindPairsClass();
        System.out.println(findPairsClass.findPairs(nums, k));
    }
}
