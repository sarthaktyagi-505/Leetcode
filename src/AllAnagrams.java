import java.util.ArrayList;
import java.util.List;

public class AllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length() == 0 || p.length() == 0)
            return ans;
        int auxA[] = new int [26];

        //Set up auxA with P equivalent array
        auxA = convertStringArray(p, auxA);

        //Apply windowing to check whether the length of big string is anagram or not
        for(int i=0;i<s.length()-p.length()+1;i++){
            int auxB[] = new int [26];
            auxB = convertStringArray(s.substring(i, i+(p.length())), auxB);
            if(checkAnagram(auxA, auxB)){
                ans.add(i);
            }
        }
        return ans;
    }
    public int[] convertStringArray(String p, int[] arr){
        for(int i=0;i<p.length();i++){
            int index = convertCharInt(p.charAt(i));
            arr[index] += 1;
        }
        return arr;
    }
    public boolean checkAnagram(int [] A, int []B){
        boolean flag = false;
        for(int i=0;i<A.length;i++) {
            if (A[i] == B[i])
                flag = true;
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public int convertCharInt(char x){
        return x -'a';
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        AllAnagrams allAnagrams = new AllAnagrams();
        List<Integer> x = allAnagrams.findAnagrams(s, p);
    }
}
