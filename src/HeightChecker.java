import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int count = 0;
        int [] x = new int[heights.length];
        x = heights.clone();
        Arrays.sort(x);
        for(int i=0;i<heights.length;i++){
            if(heights[i] != x[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        HeightChecker heightChecker = new HeightChecker();
        int s = heightChecker.heightChecker(arr);
        System.out.println(s);
    }
}
