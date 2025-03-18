package algorithms.sorting;

public class SelectionSort {

    static void sort(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int index = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 5, 2};
        sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
