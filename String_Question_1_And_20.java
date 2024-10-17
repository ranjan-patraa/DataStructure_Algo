package gs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class String_Question_1_And_20 {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        stringWithNumber(str);

        int[] result = findStartIndexOfConsecutiveCharacterInString(str);//findStartIndexOfConsecutiveCharacterInString(str);
        if(result[0] != -1){
            System.out.println("index is: "+result[0]);
            System.out.println("subString is: "+str.substring(result[0], result[0]+result[1]));
        }else {
            System.out.println("no substring found");
        }
    }

    static String StringWithNumber(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            }else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length()-1)).append(count);
        return sb.toString();
    }

    static int[] findStartIndexOfConsecutiveCharacterInString(String s) {
        int count = 1;
        int maxIndex = 0;
        int maxLength = 1;

        for(int i = 1; i< s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count > maxLength) {    // "aabbbbCCdd"
                    maxLength = count;
                    maxIndex = i - count;
                }
                count = 1;
            }
        }
        if(count > maxLength){
            maxIndex = s.length() - count;
            maxLength = count;
        }
        return new int[] {maxIndex, maxLength};

    }

    private static void stringWithNumber(String str) {
        Map<Character, Integer> hm = new LinkedHashMap<>();
        for(Character ch : str.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        int max_Value = 0;
        for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.print(entry.getKey()+""+entry.getValue());
            /*if(entry.getValue() > max_Value){
                max_Value = entry.getValue();
            }*/
        }
        // System.out.println(max_Value);
    }


}
