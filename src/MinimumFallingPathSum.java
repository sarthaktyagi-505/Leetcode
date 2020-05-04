public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        for(int j=0;j<A[0].length;j++){
            result[0][j] = A[0][j];
        }
        for(int i=1;i<A.length;i++){
            int k = 0;
            int l = 0;
            int min = Integer.MAX_VALUE;
            for(int j=0;j<A[0].length;j++){
                if(l < A[0].length){
                    min = result[i-1][l] + A[i][k] < min ? result[i-1][l] + A[i][k] : min;
                    result[i][k] = min;
                    k++;
                }
            }
            l++;

        }
    return result[A.length-1][A.length-1];
    }
    public static void main(String[] args) {
        int [][] arr = {{51,24},{-50,82}};
//        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        MinimumFallingPathSum minimumFallingPathSum = new MinimumFallingPathSum();
        System.out.println(minimumFallingPathSum.minFallingPathSum(arr));
    }
}
