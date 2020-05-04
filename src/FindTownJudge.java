import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTownJudge {
    public int findJudge(int N, int[][] trust) {
        Map<Integer, List<Integer>> graph = new HashMap();
        List<Integer> list = new ArrayList();

        for(int i=0;i<trust.length;i++){
            if(!graph.containsKey(trust[i][0])){
                list = new ArrayList();
                list.add(trust[i][1]);
                graph.put(trust[i][0], list);
            }
            else{
                list.add(trust[i][1]);
                graph.put(trust[i][0], list);
            }
        }
        System.out.println(graph);
        int judge = 0;
        for(int i=1;i<=N;i++){
            if(!graph.containsKey(i))
                judge = i;
        }
        System.out.println("judge : " +judge);
        boolean flag = false;

        for(int x : graph.keySet()){
            List temp = graph.get(x);
            if(!temp.contains(judge)){
                flag = false;
                break;
            }
            else{
                flag = true;
            }
        }
        System.out.println("flag : " +flag);
        return flag ? judge : -1;
    }

    public static void main(String[] args) {
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int N = 4;
        FindTownJudge findTownJudge = new FindTownJudge();
        findTownJudge.findJudge(N, trust);
    }
}
