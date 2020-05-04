import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        Map<Character, Integer> map = new HashMap();
        int max = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), max);
                    max++;
            }
            else{
                    map.put(s.charAt(i), max);
            }
            if(max > maxLength)
                maxLength = max;

        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s =  "pwwkew";
        LongestNonRepeatingSubstring longestNonRepeatingSubstring = new LongestNonRepeatingSubstring();
        System.out.println(longestNonRepeatingSubstring.lengthOfLongestSubstring(s));
    }
}
