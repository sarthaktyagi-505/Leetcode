import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndAllMissingNumbers {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> list = new ArrayList();
//        //get Max element from nums
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i] > max)
//                max = nums[i];
//        }
//        System.out.println(max);
//        for(int i=1;i<=max;i++){
//            list.add(i);
//        }
//        int count = 0;
//        for(int i=0;i<nums.length;i++){
//            if(list.contains(nums[i]))
//                list.remove(list.indexOf(nums[i]));
//        }
//        return list;
//    }

//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> list = new ArrayList();
//        if(nums.length == 0)
//            return list;
//
//        int k=0;
//        for(int i=0;i<nums.length;i++){
//            if(list.contains(nums[i])){
//                list.remove(list.indexOf(nums[i]));
//                continue;
//            }
//            for(int j=k+1;j<nums[i];j++){
//                if(nums[i] > j){
//                    list.add(j);
//                }
//            }
//            k=nums[i];
//        }
//        return list;
//    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        if(nums.length == 0)
            return list;
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] = -1 * nums[Math.abs(nums[i]) - 1];
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0)
                list.add(nums[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        FIndAllMissingNumbers fIndAllMissingNumbers = new FIndAllMissingNumbers();
        fIndAllMissingNumbers.findDisappearedNumbers(nums);
    }
}
