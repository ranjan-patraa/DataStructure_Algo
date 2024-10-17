package gs;

import java.util.HashMap;
import java.util.Map;

public class RepresentFractionOfTwoNumbersInTheStringFormat {

    public static void main(String[] args) {
        int Numerator = 50;
        int Denominator = 22;

        String fraction = calculateFraction(Numerator, Denominator);
        System.out.println("Fraction of Two Numbers "+Numerator +" And "+Denominator+ " = " + fraction);

    }
    static String calculateFraction(int N, int D) {
        // check Numerator && Denominator is 0 or not
        if(N == 0)
            return "0";
        if(D == 0)
            return "";

        StringBuilder result = new StringBuilder();
        // check -ve sign
        if((N < 0) ^ (D < 0))
            result.append("-");

        //Absolute value of Numerator && Denominator
        N = Math.abs(N);
        D = Math.abs(D);

        // Calculate Quotient && Reminder
        long quotient = N / D;
        long reminder = N % D * 10;

        result.append(String.valueOf(quotient));

        // Check reminder Zero
        if(reminder == 0)
            return result.toString();

        // if reminder is not zero
        result.append(".");
        // declare MAp for storing reminder
        Map<Long, Integer> hm = new HashMap<>();

        while(reminder != 0) {
            // if reminder is already present find the index and append
            if(hm.containsKey(reminder)){
                int index = hm.get(reminder);
                String part1 = result.substring(0, index);
                String part2 = "("+ result.substring(index, result.length()) +")";
                return part1 + part2;
            }

            hm.put(reminder, result.length());
            quotient = reminder / D;
            result.append(String.valueOf(quotient));
            //update reminder
            reminder = (reminder % D) * 10;
        }
        return result.toString();
    }
}
