import javafx.util.Pair;

import java.util.*;

public class PairCode {
    public static int countGroups(List<String> related) {
        // Write your code here
        List<List<Integer>> lists = new ArrayList();
        for(int i=0;i<related.size();i++){
            List<Integer> list = new ArrayList();
            String s = related.get(i);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j) == '1'){
                    list.add(j);
                }
            }
            lists.add(list);
        }
        int sum = 0;
        boolean [] visited = new boolean[lists.size()];
        for(int i=0;i<lists.size();i++){
            sum += dfs(lists,i, visited);

        }

        return sum;
    }
    public static int dfs(List<List<Integer>> lists, int root, boolean[] visited){
        int count = 0;
        if(visited[root]){
            return 0;
        }
        visited[root] = true;
        Queue<Integer> queue = new LinkedList();
        for(int i=0;i<lists.get(root).size();i++){
            if(root != lists.get(root).get(i))
                queue.add(lists.get(root).get(i));
        }
        while(!queue.isEmpty()){
            int node = queue.poll();
            if(!visited[node]){
                visited[node] = true;
                for(int i=0;i<lists.get(root).size();i++){
                    queue.add(lists.get(root).get(i));
                }
            }
        }
        for(int j=0;j<visited.length;j++){
            if(visited[j] == true)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1100");
        list.add("1110");
        list.add("0110");
        list.add("0001");
        list.add("1111");
        System.out.println(countGroups(list));

    }
}
