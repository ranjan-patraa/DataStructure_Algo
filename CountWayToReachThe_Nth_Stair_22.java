package gs;

public class CountWayToReachThe_Nth_Stair_22 {

    public static void main(String[] args) {

        int n = 4;
        int way = countWays(n);
        System.out.println(way);

        System.out.println(countWays_1(6));
    }

    private static int countWays(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return countWays(n-1) + countWays(n-2);
    }

    private static int countWays_1(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 1;

        for(int i = 2; i <= n ; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
