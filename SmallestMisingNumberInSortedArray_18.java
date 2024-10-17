package gs;


public class SmallestMisingNumberInSortedArray_18 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {0, 1, 2, 3, 4};

        System.out.println(missingNumberBS(arr)); // 0
        System.out.println(missingNumberBS(arr1)); // 5

        int arr2[] = {4,0,2,1};
        System.out.println(missingElement(arr2)); // 3
    }

    static int missingNumberBS(int[] arr) {
        int i = 0;
        int length = arr.length;

        while(i < arr.length){
            if(arr[i] != i){
                return i;
            }else{
                i++;
            }
        }
        return arr.length;
    }

    static int missingElement(int[] arr){
        int i = 0;
        int l = arr.length;

        while(i < l)
        {
          int correctIndex = arr[i]; // 4 0 2

          if(arr[i] < arr.length && arr[i] != arr[correctIndex]) // 4 0 2 1
          {
              swapElement(arr, i, correctIndex);   // 0 4 2 1    , 0 1 2 4
          }else {
              i++;
          }
        }
        for(int index = 0; index < l; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    private static void swapElement(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
