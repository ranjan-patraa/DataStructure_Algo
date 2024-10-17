package gs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter_8 {
    public static void main(String[] args) {
        String str1 = "1234",  str2 = "abbbbacd";

        String s = Arrays.stream(str2.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()>1).findFirst().get().getKey();
        System.out.println(s);

        char c = firstNonRepeatingChar(str2);
        System.out.println(c);
    }
    static Character firstNonRepeatingChar(String s) {
        Map<Character, Integer> hm = new LinkedHashMap<>();
        for(Character ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1){
               return entry.getKey();
            }
        }
        return '\0';
    }


}
