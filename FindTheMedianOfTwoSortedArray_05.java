package gs;

public class FindTheMedianOfTwoSortedArray_05 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = {10, 12, 14, 16, 18, 20};

        int arr[] = {1,3};
        int ar[] = {2};

        System.out.println(medianOfTwoDifferentSizeOfSortedArray(arr, ar));

    }
    static double medianOfTwoDifferentSizeOfSortedArray(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length){
            medianOfTwoDifferentSizeOfSortedArray(arr2, arr1);
        }
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        int totalLen = arr1Len + arr2Len;
        int start = 0;
        int end = arr1Len;

        while(start <= end) {

            int cut1 = start + (end-start)/2;
            int cut2 = totalLen/2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1-1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2-1];
            int right1 = (cut1 == arr1Len) ? Integer.MAX_VALUE : arr1[cut1];
            int right2 = (cut2 == arr2Len) ? Integer.MAX_VALUE : arr2[cut2];

            // valid cut check
            if(left1 <= right2 && left2 <= right1) {

                // total length of two array if odd
                if(totalLen % 2 != 0) {
                    return  Math.min(right1, right2);
                }else{
                    return  (Math.max(left1, left2) + Math.min(right1,right2))/2.0;
                }
            }else if(left1 > right2) {
                end = cut1 - 1;
            }else {
                start = cut1 + 1;
            }
        }
        return 0.0;
    }
}
