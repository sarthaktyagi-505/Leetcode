import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(s.isEmpty() || t.isEmpty())
            return "";
        if(s.length() < t.length())
            return "";
        if(s.length() == t.length() && s.equalsIgnoreCase(t))
            return s;
        if(s.length() == t.length() && !s.equalsIgnoreCase(t))
            return "";
        if(t.length() == 1 && s.contains(t))
            return t;
        int maxSize = Integer.MAX_VALUE;
        int startIndex= 0,endIndex = 0;
        Map<Character, List<Integer>> map = new HashMap();
        List<Integer> list = null;
        for(int i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                List<Integer> x = map.get(s.charAt(i));
                x.add(i);
            }
            else{
                list = new ArrayList<>();
                list.add(i);
                map.put(s.charAt(i), list);
            }
        }
        List<List<Integer>> lists = new ArrayList<>();

        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i)))
                lists.add(map.get(t.charAt(i)));
        }
        for(int i=0;i<lists.get(0).size();i++){
            if(lists.get(lists.size()-1).get(i) - lists.get(0).get(i) < maxSize) {
                if(maxSize > lists.get(lists.size() - 1).get(i) - lists.get(0).get(i)) {
                    maxSize = lists.get(lists.size() - 1).get(i) - lists.get(0).get(i);
                    endIndex = lists.get(lists.size() - 1).get(i);
                    startIndex = lists.get(0).get(i);
                }
            }
            else{
                return "";
            }
        }
        if(startIndex == endIndex)
            return s.substring(startIndex);
        return s.substring(startIndex-1, endIndex+1);
    }

    public static void main(String[] args) {
        String s = "ab";
        String t = "a";
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        System.out.println(minimumWindowSubstring.minWindow(s, t));
    }
}
