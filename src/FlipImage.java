public class FlipImage {
    public int[][] flipAndInvertImage(int[][] A) {

        for(int i=0;i<A.length;i++){
            int k = A[0].length-1;
            for(int j=0;j<=k+1/2;j++){
                if(j < k){
                    int temp = A[i][j];
                    A[i][j] = A[i][k];
                    A[i][k] = temp;
                    k--;
                }
            }
        }


         for(int i=0;i<A.length;i++){
             for(int j=0;j<A[0].length;j++){
                 if(A[i][j] == 0){
                     A[i][j] = 1;
                     continue;
                 }
                 if(A[i][j] == 1){
                     A[i][j] = 0;
                     continue;
                 }
             }
         }
        return A;
    }

    public static void main(String[] args) {
        int[][] x = new int[][] {{0,1,1,1,0,1,1,0},{1,0,1,1,0,1,1,1},{1,1,0,1,0,1,1,0},{0,1,0,0,1,0,1,1},{1,1,0,1,0,1,1,1},{0,0,1,1,1,0,1,1},{0,1,1,1,0,1,0,1},{0,0,0,1,1,0,1,1}};
        FlipImage flipImage = new FlipImage();
        flipImage.flipAndInvertImage(x);
    }
}
