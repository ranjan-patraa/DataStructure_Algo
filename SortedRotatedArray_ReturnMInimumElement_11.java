package gs;

public class SortedRotatedArray_ReturnMInimumElement_11 {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        int i = returnMinimumElement(arr);
        System.out.println(i);
    }

    private static int returnMinimumElement(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start < end){
            if(arr[start] <= arr[end]) {
                return arr[start];
            }
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[end]) {
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return arr[start];
    }
}
