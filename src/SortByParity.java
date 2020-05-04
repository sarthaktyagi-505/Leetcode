public class SortByParity {

    public int[] sortArrayByParity(int[] A) {
        int start = 0;
        int end = A.length-1;
        int temp = 0;
        while(start < end){
            if(A[start] % 2 != 0 && A[end] % 2 == 0){
                temp = A[start];
                A[start] = A[end];
                A[end] = temp;
            }
            else if(A[start] % 2 == 0 && A[end] % 2 != 0){
                start++;
                end--;
            }
            else
            {
                if(A[start] % 2 == 0)
                    start++;
                else
                    end--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int [] A = {1,3,4,5,7};
        SortByParity sortByParity = new SortByParity();
        sortByParity.sortArrayByParity(A);
        System.out.println(A);
    }
}
