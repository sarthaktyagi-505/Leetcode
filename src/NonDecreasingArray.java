public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int indexi = 0;
        int indexj = 0;
        for(int i=0,j=1;i< nums.length-1;i++,j++){
            if(nums[i] > nums[j]) {
                count++;
                indexi = i;
                indexj = j;
            }
        }
        if(count > 1 && (indexi-1 > 0 && nums[indexi] > nums[indexi-1] ) && (indexj < nums.length-1 && nums[indexj] < nums[indexj+1]))
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int [] nums  =  {4,2,1};
        NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
        System.out.println(nonDecreasingArray.checkPossibility(nums));

    }
}
