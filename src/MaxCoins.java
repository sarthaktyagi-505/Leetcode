import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxCoins {
    public int maxCoins(int[] nums) {
        int [] res = new int[nums.length];
        Arrays.sort(nums);
        res[0] = nums[0] * nums[1];

        for(int i=1;i<=nums.length-1;i++){
            if(i != nums.length-1)
                res[i] = Math.max(res[i-1], nums[i-1]*nums[i]*nums[i+1]);
            else
                res[i] = Math.max(res[i-1], nums[i-1]*nums[i]*1);
        }


        for(int i=0;i<nums.length;i++){
            System.out.println(res[i]);
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] nums = {3,1,5,8};
        MaxCoins maxCoins = new MaxCoins();
        maxCoins.maxCoins(nums);
    }
}
