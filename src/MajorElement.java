import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+ 1);
            }
        }
        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            if(x.getValue().intValue() > nums.length/2){
                return x.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,3};
        MajorElement majorElement = new MajorElement();
        System.out.println(majorElement.majorityElement(nums));
    }
}
