import java.util.Arrays;

public class MinimumCostForTickets {

    public int mincostTickets(int[] days, int[] costs) {
        boolean [] travelDay = new boolean[366];
        int [] dp = new int[366];
        for(int day : days){
            travelDay[day] = true;
        }

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1;i<366;i++){
            if(!travelDay[i]){
                dp[i] = dp[i-1];
                continue;
            }
            dp[i] = Math.min(dp[i], dp[i-1] + costs[0]);
            if(i-7 >= 0){
                dp[i] = Math.min(dp[i], dp[i] + costs[1]);
            }
            else{
                dp[i] = Math.min(dp[i], costs[0]);
            }

            if(i-30 >= 0){
                dp[i] = Math.min(dp[i], dp[i] + costs[2]);
            }
            else{
                dp[i] = Math.min(dp[i], costs[2]);
            }
        }
        return dp[365];
    }
    public static void main(String[] args) {
        int []days = {1,4,6,9,10,11,12,13,14,15,16,17,18,20,21,22,23,27,28};
        int []cost = {3,13,45};
        MinimumCostForTickets minimumCostForTickets = new MinimumCostForTickets();
        System.out.println(minimumCostForTickets.mincostTickets(days, cost));

    }
}
