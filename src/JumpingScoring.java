import java.util.*;

public class JumpingScoring {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int [] result = new int[alice.length];
        Set<Integer> set = new HashSet();
        for(int i=0;i<scores.length;i++){
            set.add(scores[i]);
        }
        List<Set<Integer>> list = new ArrayList(set);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        System.out.println("------");

        Integer[] x = list.toArray(new Integer[set.size()]);


        for(int j=0;j<alice.length;j++){
            for(int i=0;i<x.length;i++){
                if(alice[j] == x[i].intValue()){
                    result[j] = i+1;
                    break;
                }

                else if(alice[j] >= x[i].intValue()) {
                    result[j] = i+1;
                    break;
                }
                else {
                    if(result[j] == 0 && i == x.length-1){
                        result[j] = i+2;
                    }
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int []alice = {5 ,25 ,50 ,120};
        int []scores = {100 ,100 ,50 ,40 ,40 ,20 ,10 };
        int []x = climbingLeaderboard(scores,alice);
        System.out.println(x);
    }
}
