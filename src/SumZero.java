public class SumZero {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int range = -(n/2);
        for(int i= 0;i < n ;i++){
            if(n % 2 == 0){
                if(range == 0){
                    range++;
                }
                result[i] = range;
                range++;
            }else{
                result[i] = range;
                range++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        SumZero sumZero = new SumZero();
        int []x = sumZero.sumZero(n);
        System.out.println(x);
    }
}
