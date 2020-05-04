import java.util.HashMap;
import java.util.Map;

public class ShiftZeroes {
    public void moveZeroes(int[] nums) {
        Map x = new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j=i;
                while(j < nums.length-1 && nums[j] == 0){
                    j++;
                }
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }

        }
    }
    public static void main(String[] args) {
        int A[] = {0,0};
        ShiftZeroes shiftZeroes = new ShiftZeroes();
        shiftZeroes.moveZeroes(A);
    }
}
