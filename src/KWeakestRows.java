import java.util.*;

public class KWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int result[] = new int[k];
        for(int i=0;i<mat.length;i++){
            int sum = 0;
            for(int j=0;j<mat[0].length;j++){
                sum += mat[i][j];
            }
            map.put(i, sum);
        }
        int i= 0;
        int []temp = new int[map.size()];
        for(int x : map.keySet()){
            temp[i] = map.get(x);
            i++;
        }
        Arrays.sort(temp);
        for(int j=0;j<k;j++){
            for(int x : map.keySet()){
                if(temp[j] == map.get(x)) {
                    result[j] = x;
                    map.put(x, Integer.MAX_VALUE);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] x = {{1,1,0,0,0},
                    {1,1,1,1,0},
                    {1,0,0,0,0},
                    {1,1,0,0,0},
                    {1,1,1,1,1}};
        int k = 3;
        KWeakestRows kWeakestRows = new KWeakestRows();
        int [] a = kWeakestRows.kWeakestRows(x, k);
        System.out.println(a);
    }
}
