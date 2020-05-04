public class ThirdMax {
    public int thirdMax(int[] nums) {
        Integer thirdMaxNum = null;
        Integer secondMax = null;
        Integer max = null;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max ){
                thirdMaxNum = secondMax;
                secondMax = max;
                max = nums[i];

            }
            else if(nums[i] > secondMax && nums[i] < max){
                thirdMaxNum = secondMax;
                secondMax = nums[i];

            }
            else {
                if(nums[i] > thirdMaxNum && nums[i] < secondMax)
                    thirdMaxNum = nums[i];
            }
        }

            return thirdMaxNum == null ? max : thirdMaxNum;
    }

    public static void main(String[] args) {
        //[1,2,-2147483648]
        int [] arr = {1,2,-2147483648};
        ThirdMax thirdMax = new ThirdMax();
        System.out.println(thirdMax.thirdMax(arr));
    }
}
