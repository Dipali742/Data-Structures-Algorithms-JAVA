package algorithms.sorting;

public class BubbleSort {

    static void sort(int arr[]) {
        int n = arr.length;
        boolean isSwapped = false;
        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < i-1; j++) {
                if(arr[i] < arr[j]) {
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            if(isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 10, 8, 4, 8, 3};
        sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
