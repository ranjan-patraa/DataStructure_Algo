package gs;

import java.util.*;

public class Dictionary_17 {
    public static void main(String[] args) {
        String str[] = {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
        String input = "caab";
        String input1 = "abcd";

        System.out.println(occurInputInGivenArray(str, input1));
        /*String[] returnStrings = occurInputInGivenArray(str, input);
        System.out.println(Arrays.toString(returnStrings));*/
    }

    private static List<String> occurInputInGivenArray(String[] str, String input) {
        List<String> result = new ArrayList<>();
        if(str.length == 0){

            //return new String[]{};
            return  new ArrayList<>();
        }
        Map<Character, Integer> inputMap = new HashMap<>();
        for(char ch : input.toCharArray()){
            inputMap.put(ch, inputMap.getOrDefault(ch, 0)+1);
        }
        for(String word : str){
            if(canFormWord(word, inputMap)){
                result.add(word);
            }
        }
        return result;
    }

    private static boolean canFormWord(String word, Map<Character, Integer> inputMap) {
        Map<Character, Integer> tempMap = new HashMap<>(inputMap);

        for (char c : word.toCharArray()) {
            if (!tempMap.containsKey(c) || tempMap.get(c) <= 0) {
                return false;
            }
            tempMap.put(c, tempMap.get(c) - 1);
        }

        for (int i : tempMap.values())
        {
            if(i < 0){
                return false;
            }
        }
        return true;
    }
}

