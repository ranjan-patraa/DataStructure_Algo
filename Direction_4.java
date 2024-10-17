package gs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Direction_4 {
    public static void main(String[] args) {
        String direction1 = "DOWN UP 2xRIGHT DOWN 3xLEFT";
        String direction2 = "UUU";
        String direction3 = "URRDDL";

        coordinate(direction1);

    }
    public static void coordinate(String d) {

        Pattern pattern = Pattern.compile("(\\d*)x?(U|D|L|R)");
        Matcher matcher = pattern.matcher(d);
        int countUp = 0, countDown = 0, countRight=0, countLeft = 0 ;

        while (matcher.find()) {
           /* System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));*/

            String multiplierStr = matcher.group(1);
            /*if(!multiplierStr.isEmpty()) {
                int i = Integer.parseInt(multiplierStr);
                System.out.println(i);
            }*/
            String direction = matcher.group(2);
            //System.out.println(direction);
            int multiplier = multiplierStr.isEmpty() ? 1 : Integer.parseInt(multiplierStr);

            switch (direction) {
                case "U":
                    countUp+=multiplier;
                    break;
                case "D":
                    countDown+=multiplier;
                    break;
                case "R":
                    countRight+=multiplier;
                    break;
                case "L":
                    countLeft+=multiplier;
                    break;
            }
        }
        System.out.println("final position : ("+ (countRight-countLeft) +", "+ (countUp-countDown) +")");

    }
}
