public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int res[][] = new int[intervals.length][2];
        res[0][0] = intervals[0][0];
        res[0][1] = intervals[0][1];
        for(int i=1;i<intervals.length;){
            if(res[i-1][1] >= intervals[i][0] && res[i-1][1] <= intervals[i][1]) {
                res[i - 1][1] = intervals[i][1];
                i++;
            }
            else if(res[i-1][0] >= intervals[i][0] && res[i-1][0] >= intervals[i][1]) {
                res[i - 1][0] = intervals[i][0];
                i++;
            }
            else if(res[i-1][0] <= intervals[i][0] && res[i-1][0] <= intervals[i][1]) {
                res[i - 1][0] = intervals[i - 1][0];
                i++;
            }

            else{
                res[i-1][0] = intervals[i][0];
                res[i-1][1]= intervals[i][1];
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] x ={{1,3},{2,6},{8,10},{15,18}};
//        int[][] x = {{1,8}, {2,3}, {4,5}};
        MergeIntervals mergeIntervals = new MergeIntervals();

        int res[][] = mergeIntervals.merge(x);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i][0] + "," + res[i][1]);
        }
    }
}
