import java.util.HashMap;
import java.util.Map;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())
            return false;
        boolean flag = false;
        if(A.equals(B)){
            if(A.length() == 2)
                return false;
            return true;
        }
        Map<Character, Character> m = new HashMap();
        for (int i = 0; i < A.length(); i++) {

            if (A.charAt(i) == B.charAt(i)) {
                continue;
            } else {
                    m.put(A.charAt(i), B.charAt(i));
            }
        }
        if(m.size() < 2)
            return flag;
        if(m.size() > 2 || m.keySet().toArray()[0] != m.get(m.keySet().toArray()[1]) || m.keySet().toArray()[1] != m.get(m.keySet().toArray()[0]) )
            flag = false;
        else
            flag = true;

        return flag;
    }

    public static void main(String[] args) {
        String s1 = "abcabc";
        String s2 = "abcabc";
        BuddyStrings buddyStrings = new BuddyStrings();
        System.out.println(buddyStrings.buddyStrings(s1, s2));
    }
}
