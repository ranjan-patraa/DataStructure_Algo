package gs;

import java.util.Scanner;

public class Custom_Atoi_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string if you want to convert integer");
        String str = sc.nextLine();

        System.out.println("convert above String to Integer: "+customAtoiConvertStringToInteger(str));
    }

    private static int customAtoiConvertStringToInteger(String str) {
        // trim all spaces
        str = str.trim();

        //check String is empty, if empty please return -1
        if(str.isEmpty()){
            return -1;
        }
        int length = str.length();
        int startIndex = 0;
        int result = 0;
        int sign = 1; // 1 for +ve and -1 for _ve
        // check sign of String
        if(str.charAt(0) == '-'){
            sign = -1;
            startIndex++;
        }else if(str.charAt(0) == '+'){
            startIndex++;
        }
        //check every character
        for(int i = startIndex; i<length; i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){ // check character is digit or not
                //convert to integer
                int digit = ch - '0';
                // check for over flow
                if(result > (Integer.MAX_VALUE-digit)/10){
                    return -1;
                }
                result = result * 10 + digit;
            }else {
                return -1;
            }
        }
        return sign * result;
    }
}
