import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SubArraySorted {

    public int findUnsortedSubarray(int[] nums) {
        int[] snums = nums.clone();
        int start = nums.length;
        int end = 0;
        Arrays.sort(snums);
        for(int i=0;i<snums.length;i++){
            if(snums[i] != nums[i]){
                start = Math.min(start, i);
                end = Math.max(end,i);
            }
        }
        if(end-start < 0)
            return 0;
        else
            return end-start+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,2,2};
        SubArraySorted subArraySorted = new SubArraySorted();
        System.out.println(subArraySorted.findUnsortedSubarray(arr));

    }
}
