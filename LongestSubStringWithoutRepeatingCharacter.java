package gs;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubStringWithoutNonRepeated(s));
    }
    static String longestSubStringWithoutNonRepeated(String s) {
        HashSet<Character> charSet = new HashSet<>();

        int maxLength = 0;
        int left = 0;
        String longestSubString = "";

        for(int right = 0; right < s.length() ; right++) {
            System.out.println(charSet);
            while (charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            int currentLength =  right - left +1;
            if(currentLength > maxLength){
                maxLength = currentLength;
                longestSubString = s.substring(left, right+1);
            }
        }
        return longestSubString;
    }
}
