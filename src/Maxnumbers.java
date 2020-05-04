import java.util.*;

public class Maxnumbers {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList();

        for(int i=0;i<nums.length-1;){
            for(int j=0;j<nums[i];j++){
                list.add(nums[i+1]);
            }
            i = i+2;
        }
        Object[] x = list.toArray();
        int[] res = new int[x.length];
        for(int i=0;i<res.length;i++){
            res[i] = (int)x [i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Maxnumbers maxnumbers = new Maxnumbers();
        int[] x = maxnumbers.decompressRLElist(nums);
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}
