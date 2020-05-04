import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class CommonCHaracter {
    public List<String> commonChars(String[] A) {
        ArrayList<TreeMap<Character, Integer>> list = new ArrayList<>();
        for(int i=0;i < A.length;i++){
            TreeMap<Character, Integer> map = new TreeMap<>();
            String ref = A[i];
            for(int j=0;j<ref.length();j++){
                if(!map.containsKey(ref.charAt(j))){
                    map.put(ref.charAt(j), 1);
                }
                else{
                    map.put(ref.charAt(j), map.get(ref.charAt(j))+1);
                }
            }
            list.add(map);
        }
        TreeMap<Character, Integer> ref = list.get(0);
        for(int i=1;i<list.size();i++){
            TreeMap<Character, Integer> result = new TreeMap<>();
            for(char index : list.get(i).keySet()){
                int min = 0;
                if(ref.containsKey(index)){
                    if(ref.get(index) != list.get(i).get(index)) {
                        if (ref.get(index) < list.get(i).get(index)) {
                            min = ref.get(index);
                            result.put(index, min);
                        } else {
                            min = list.get(i).get(index);
                            result.put(index, min);
                        }
                    }
                    else
                        result.put(index, list.get(i).get(index));
                }


            }
            ref = result;
        }
        List<String> result = new ArrayList<>();

        for(char x : ref.keySet()){
            int index = 0;
            while(index != ref.get(x)){
                result.add(String.valueOf(x));
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] T = {"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"};
        CommonCHaracter commonCHaracter = new CommonCHaracter();
        List<String> x = commonCHaracter.commonChars(T);
        System.out.println(x);
    }
}
