package gs;

public class CheckNumberIs_POWER_OF10_14 {

    public static void main(String[] args) {

        int num = 100;
        System.out.println("is num power Of 10 : "+ isPowerOf_10(num));

        int num2 = 90;
//      System.out.println("is num power Of 10 : "+ isPowerOf_10(num2));
        System.out.println(checkNumberIsPowerOf_10(num2));

        int num3 = 1000;
//      System.out.println("is num power Of 10 : "+ isPowerOf_10(num3));
        System.out.println(checkNumberIsPowerOf_10(num3));

    }

    static boolean isPowerOf_10(int n) {

        while(n > 1 && n % 10 == 0) {
            n /= 10;
        }
        return n == 1;
    }

    static boolean checkNumberIsPowerOf_10(int number) {
        return Math.pow(10, String.valueOf(number).length()-1) == number;
    }
}
