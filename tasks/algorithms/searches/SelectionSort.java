package tasks.algorithms.searches;
import tasks.algorithms.utils.ArrayUtils;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 1, 2, 10};
        arr = selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] selectionSort(int[] arr){
        int[] newArr = new int[arr.length];
        int smallestIdx;
        int length = arr.length;
        for(int i = 0; i< length; i++){
            smallestIdx = FindSmallest.findSmallest(arr); // 3
            newArr[i] = arr[smallestIdx];
            arr = ArrayUtils.array_remove(arr, smallestIdx);
        }
        return newArr;
    }
}
