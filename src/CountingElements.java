import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public int countElements(int[] arr) {
        Set<Integer> lookup = new HashSet();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            lookup.add(arr[i] + 1);
            if(lookup.contains(arr[i])){
                count++;
            }
            lookup.add(arr[i] -1);
            if(lookup.contains(arr[i])){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        CountingElements countingElements = new CountingElements();
        countingElements.countElements(arr);
    }
}
