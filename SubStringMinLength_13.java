package gs;

import java.util.HashMap;
import java.util.Map;

public class SubStringMinLength_13 {

    public static void main(String[] args) {

        int[] arr = {-8, -8, -3, 8};
        int k = 5;
        System.out.println(lengthOfShortestSubArray(arr, k));

        int[] arr2 = {2, 4, 6, 10, 2, 1};
        int k2 = 12;
        System.out.println(lengthOfShortestSubArray(arr2, k2));

        int[] arr3 = {5, 8, 50, 4};
        int k3 = 50;
        System.out.println(lengthOfShortestSubArray(arr3, k3));
    }

    static int lengthOfShortestSubArray(int[] array, int targetSum) {

        int result = Integer.MAX_VALUE;
        int currSum = 0;
        int length = array.length;

        Map<Integer, Integer> hm = new HashMap<>();

        for(int index = 0; index < length; index++) {

            currSum += array[index];

            if(currSum == targetSum) {
                int l = index + 1;
                result = Math.min(result, l);
            }

            int requiredSum = currSum - targetSum;

            if(hm.containsKey(requiredSum)) {

                int value = hm.get(requiredSum);
                int currIndex = index;

                result = Math.min(result, currIndex-value);
            }
            hm.put(currSum, index);
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
