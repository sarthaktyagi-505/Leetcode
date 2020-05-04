import java.util.ArrayList;
import java.util.List;

public class ThirdLargest {
    public int thirdMax(int[] nums) {





        int max = nums[0];
        int secondmax = nums[1];
        int temp = 0;
        if(nums.length == 0)
            return 0;
        if(nums.length == 2){
            if(nums[0] > nums[1])
                return nums[0];
            else
                return nums[1];
        }
        if(max < secondmax){
            swap(max, secondmax);
        }
        for(int i=2;i<nums.length;i++){
            if(nums[i] > max) {
                temp = max;
                max = nums[i];
                secondmax = temp;
            }
            else if(nums[i] < max && nums[i] >= secondmax){
                secondmax = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(secondmax);
        int finalMax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] <= max && nums[i] < secondmax && nums[i] > finalMax){
                finalMax = nums[i];
            }
        }
        if(finalMax == Integer.MIN_VALUE)
            return max;
        else
            return finalMax;
    }
    public void swap(int a, int b){
        int temp = 0;
        temp = a;
        a = b;
        b = a;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,2,1};
        ThirdLargest thirdLargest = new ThirdLargest();
        System.out.println(thirdLargest.thirdMax(nums));
    }
}
