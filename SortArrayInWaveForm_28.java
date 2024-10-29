package gs;

import java.util.Arrays;

public class SortArrayInWaveForm_28 {

    public static void main(String[] args) {

        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};

        arraySortInWaveForm(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void arraySortInWaveForm(int[] arr) {

        int lengthOfArray = arr.length;

        for(int i = 0; i < lengthOfArray; i+=2) {

            if( i > 0 && arr[i-1] > arr[i]) {
                //swap(arr, arr[i-1], arr[i]);

                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            if(i < lengthOfArray-1 && arr[i] < arr[i+1]) {
                //swap(arr, arr[i], arr[i+1]);

                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    /*static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }*/
}
