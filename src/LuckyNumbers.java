import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LuckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList();
        int j=0;
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            for(j=0;j<matrix[0].length;j++){
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            if(min > max){
                max = min;
            }
        }
        int row = 0;
        boolean flag = false;

        for(int i=0;i<matrix.length;i++){
            for(int k=0;k<matrix[0].length;k++){
                if(matrix[i][k] == max){
                    row = k;
                    break;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][row] > max){
                flag = false;
                break;
            }
            else
                flag = true;
        }
        if(flag)
            list.add(max);
        return list;
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        LuckyNumbers luckyNumbers = new LuckyNumbers();
        List<Integer> l = luckyNumbers.luckyNumbers(A);
        System.out.println(l);
    }
}
