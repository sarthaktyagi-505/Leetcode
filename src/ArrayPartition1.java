import java.util.HashMap;
import java.util.Map;

public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        if(nums.length == 0)
            return 0;
        int sum = 0;
        int toggleNumber = 0;
        for(int i=0;i<nums.length-1;){
            if(toggleNumber == 0) {
                sum += Math.min(nums[i], nums[i + 1]);
                toggleNumber = 2;
            }
            else if(toggleNumber % 2 == 0) {
                sum += Math.max(nums[i], nums[i + 1]);
                toggleNumber = 1;
            }
            else {
                sum += Math.min(nums[i], nums[i + 1]);
                toggleNumber = 2;
            }
            i = i+2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,3,2,7,8};
        ArrayPartition1 arrayPartition1 = new ArrayPartition1();
        arrayPartition1.arrayPairSum(nums);
    }
}
