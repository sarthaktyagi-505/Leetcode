import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class MergeRanges {
//    public int[] replaceElements(int[] arr) {
//        int resultArr[] = new int[arr.length];
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            resultArr[i] = getMax(i+1, arr.length, arr);
//        }
//        return resultArr;
//    }
//    int getMax(int index, int length, int [] arr){
//        int max = Integer.MIN_VALUE;
//        for(int i=index;i<length;i++){
//            if(arr[i] > max)
//                max = arr[i];
//        }
//        if(max == Integer.MIN_VALUE)
//            return -1;
//        return max;
//    }

        public int[] replaceElements(int[] arr) {

            String strArr = new String("1:[1,2,3,4]");

            String[] connectedLocations = strArr.split(":")[1].replace("[","").replace("]", "").split(",");
            System.out.println(connectedLocations.length);

            System.out.println(connectedLocations.length);
            return new int[1];

        }
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 9, 7, 3, 4, 1};
        MergeRanges mergeRanges = new MergeRanges();
        int[]x = mergeRanges.replaceElements(arr);


    }
}
