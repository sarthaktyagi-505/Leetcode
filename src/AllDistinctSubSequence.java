import java.util.*;

public class AllDistinctSubSequence {
    String newResult = "";
    void printDistinctSubsequence(String s, int kSize) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
           if(!list.contains(s.charAt(i)))
               list.add(s.charAt(i));
        }
        Collections.sort(list);
        System.out.println(list);
        StringBuilder sb = new StringBuilder();
        helperRecursive(list, "", kSize, kSize);

    }
    void helperRecursive(List list, String result, int k, int sizeK) {
        // when the length of result becomes equal to k we print the result
        if(k == 0) {
            if(result.length() == sizeK)
                System.out.println(result);
            return;
        }
        // recursively append all the members of the list
        // Ignore if the result already consists of the character to maintain distinction
        for(int i=0;i<list.size();i++){
            if(!result.contains(list.get(i).toString()))
              newResult = result + list.get(i);
            helperRecursive(list, newResult, k-1, sizeK);
        }


    }
    public static void main(String[] args) {
        String s = "kabccr";
        int k = 1;
        AllDistinctSubSequence allDistinctSubSequence = new AllDistinctSubSequence();
        allDistinctSubSequence.printDistinctSubsequence(s,k);
    }
}
