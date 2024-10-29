package gs;

  class Program_To_AddFractions_21 {

    public static void main(String[] args) {

        // int numerator_1 = 1;  int denominator_1 = 3;   // 2/3
        // int numerator_2 = 3;  int denominator_2 = 9;

        //  int numerator_1 = 1;  int denominator_1 = 2;  // 2/1
        // int numerator_2 = 3;  int denominator_2 = 2;

        int numerator_1 = 1;  int denominator_1 = 5;  // 2/5
        int numerator_2 = 3;  int denominator_2 = 15;

        System.out.print(numerator_1 + "/"+denominator_1 +" + "+ numerator_2 + "/"+denominator_2 + " = ");
        addTwoFraction(numerator_1, denominator_1, numerator_2, denominator_2);

    }

    static void addTwoFraction(int numerator_1, int denominator_1, int numerator_2, int denominator_2) {

        int denominator_3 = gcd(denominator_1, denominator_2);

        denominator_3 = (denominator_1 * denominator_2) / denominator_3;

        int  numerator_3 = numerator_1 * (denominator_3 / denominator_1) +
                numerator_2 * (denominator_3 / denominator_2) ;

        lowest(numerator_3, denominator_3);
    }

    private static void lowest(int numerator_3, int denominator_3) {

        int common_Fraction = gcd(numerator_3, denominator_3);

        denominator_3 = denominator_3 / common_Fraction;
        numerator_3 = numerator_3 / common_Fraction;

        System.out.println(numerator_3+"/"+denominator_3);
    }

    private static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
