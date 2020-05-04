public class SubArraySize {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 2, 1};
        int[] B = {3, 2, 1, 4, 7};
        int currSize = 0;
        int startIndexA = 0;
        int startIndexB = 0;
        int j= 0 ;
        for (int i = 0; i < A.length - 1; i++) {
            while (j < B.length - 1) {
                int count = 0;
                if (A[i] == B[j]) {
                    startIndexA = i;
                    startIndexB = j;
                    for (int k = startIndexB; k < B.length - 1;
                    k++){
                        if (startIndexA > A.length - 1)
                            break;
                        if (A[startIndexA] == B[k]) {
                            count++;
                            startIndexA++;
                        }
                        if (count > currSize)
                            currSize = count;
                    }
                }
                j++;
            }

        }
        System.out.println(currSize);
    }
}

