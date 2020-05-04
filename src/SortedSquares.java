import javax.swing.*;

public class SortedSquares {
    public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        int mid = A.length/2;
        int leftT = mid;
        int rightT = mid+1;
        int i=0;
        while(leftT >= 0 && rightT <= A.length-1){
            if(Math.abs(A[leftT]) <= Math.abs(A[rightT])){
                B[i] = (int)Math.pow(A[leftT], 2);
                leftT--;
            }else{
                B[i] = (int)Math.pow(A[rightT], 2);
                rightT++;
            }
            i++;
        }
        if(leftT > 0){
            while(rightT < A.length) {
                B[i] = (int) Math.pow(A[rightT], 2);
                rightT++;
            }
            i++;
        }
        if(rightT < A.length-1){
            while(leftT > -1) {
                B[i] = (int) Math.pow(A[leftT], 2);
                leftT--;
            }
            i++;
        }

        return B;
    }

    public static void main(String[] args) {
        int[] A = {-1, 2, 2};
        SortedSquares sortedSquares = new SortedSquares();
        A = sortedSquares.sortedSquares(A);
        System.out.println(A);
    }
}
