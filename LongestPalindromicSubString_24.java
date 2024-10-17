package gs;

public class LongestPalindromicSubString_24 {

    static int start = 0;
    static int maxLen = 1;

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        String str1 = "abcdefe";

        System.out.println(longestPalSubString(str1));
    }

    static String longestPalSubString(String s) {
        int len = s.length();
        if(len < 2){
            return s;
        }

        for(int i = 0; i < s.length()-1; i++){
            expandRange(s, i, i);
            expandRange(s, i, i+1);
        }
        return s.substring(start, start+maxLen);
    }

    private static void expandRange(String s, int low, int high) {
        while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
            int currLen = high - low + 1;
            if(currLen > maxLen){
                start = low;
                maxLen = currLen;
            }
            low--;
            high++;
        }
    }
}
