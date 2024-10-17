package gs;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Substring_2 {

    public static void main(String[] args) {
        String[] dictionary = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";

        System.out.println(findLongestWordWithSubString(dictionary, toSearch));
    }

    static int findLongestWordWithSubString(String[] str, String toSearch) {
        Map<String, Integer> hm = new HashMap<>();
        int max_Length = 0;
        for(String s : str){
            hm.put(s.toLowerCase(), s.length());
        }
        for(String s : hm.keySet()){
            if(s.contains(toSearch.toLowerCase())){
                max_Length = Math.max(max_Length, hm.get(s));
            }
        }
        for(String s : hm.keySet()) {
            if (hm.get(s) == max_Length) {
                System.out.println(s);
            }
        }

        return max_Length;
    }
}
