import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> mapBig = new HashMap();
        Map<Integer, Integer> mapSmall = new HashMap();
        int[] result = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            if(!mapBig.containsKey(arr1[i])){
                mapBig.put(arr1[i], 1);
            }
            else{
                mapBig.put(arr1[i], mapBig.get(arr1[i]) + 1);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(!mapSmall.containsKey(arr2[i])){
                mapSmall.put(arr2[i], mapBig.get(arr2[i]));
            }
        }
        for(int x : mapSmall.keySet()){
            mapBig.remove(x);
        }
        int mainIndex = 0;
        for(int j=0;j<arr2.length;j++){
            int index = 0;
            if(mapSmall.containsKey(arr2[j])){
                while(index != mapSmall.get(arr2[j])) {
                    result[mainIndex] = arr2[j];
                    index++;
                    mainIndex++;
                }
            }
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(mapBig);
        for(int i : treeMap.keySet()){
            int index = 0;
            while(index != treeMap.get(i)) {
                result[mainIndex] = i;
                index++;
                mainIndex++;
            }
        }

        System.out.println(treeMap);
        System.out.println(mapSmall);

        return result;
    }

    public static void main(String[] args) {
//        int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
//        int[] arr2 = {2,42,38,0,43,21};
        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};
        RelativeSortArray relativeSortArray = new RelativeSortArray();
        int[] x = relativeSortArray.relativeSortArray(arr1, arr2);
        System.out.println(x);
    }
}
