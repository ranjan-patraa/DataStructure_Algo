package gs;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMaxIp_16 {
    public static void main(String[] args) {
        String[] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };

        String maxIPOccurence = maxIPOccurs(str);
        System.out.println(maxIPOccurence);
    }

    static String maxIPOccurs(String[] str) {
        Map<String, Integer> ipMap = new HashMap<>();
        Pattern pattern = Pattern.compile("\\b(\\d{1,3}(\\.\\d{1,3}){3})\\b");

        for(String s : str) {
            Matcher matcher = pattern.matcher(s);

            if(matcher.find()) {
                String ip = matcher.group(1);
                if(isValidIP(ip)){
                    ipMap.put(ip, ipMap.getOrDefault(ip, 0)+1);
                }
            }
        }
        int maxCount = 0;
        String maxIP = "";
        for(String s : ipMap.keySet()){
            if(maxCount < ipMap.get(s)){
                maxCount = ipMap.get(s);
                maxIP = s;
            }
        }
        return maxIP;
    }

    private static boolean isValidIP(String ip) {
        String[] ipParts= ip.split("\\.");
        // check ip address length is 4 or not
        if(ipParts.length != 4){
            return false;
        }
        for (String part : ipParts){
            int num = Integer.parseInt(part);
            if(num < 0 || num > 255){
                return false;
            }
            if (part.length() > 1 && part.startsWith("0"))
                return false;
        }
        return true;
    }
}
