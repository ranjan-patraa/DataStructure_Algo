package gs;

import java.util.ArrayList;
import java.util.List;

public class PrefixSearch_7 {
    public static void main(String[] args) {
        String[] str = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        System.out.println(allWordStartingWithPrefix(str, prefix));
    }

    static List<String> allWordStartingWithPrefix(String[] str, String prefix) {

        List<String> list = new ArrayList<>();

        for(String s : str) {
            if(s.startsWith(prefix)){
                list.add(s);
            }
        }
        return list;
    }
}
